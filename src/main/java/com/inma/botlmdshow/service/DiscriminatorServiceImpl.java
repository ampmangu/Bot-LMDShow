package com.inma.botlmdshow.service;

import com.inma.botlmdshow.domain.Datum;
import com.inma.botlmdshow.domain.Post;
import com.inma.botlmdshow.repository.PostRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

import static com.inma.botlmdshow.utils.DatumUtils.formUrl;

@Service
public class DiscriminatorServiceImpl implements DiscriminatorService {
    private static final Logger log = LoggerFactory.getLogger(DiscriminatorServiceImpl.class);

    private final PostRepository postRepository;

    public DiscriminatorServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public boolean discriminatePost(Datum datum) {
        String title = formUrl(datum);
        Optional<Post> postById = postRepository.findAll().stream().filter(post -> post.getTitle().equalsIgnoreCase(title)).findAny();
        boolean present = postById.isPresent();
        if (!present) {
            log.info("No teniamos el post con titulo {}, saving.", title);
            Post post = new Post();
            post.setTitle(title);
            post.setAccessTime(Long.toString(Instant.now().getEpochSecond()));
            postRepository.save(post);
        }
        return present;
    }
}
