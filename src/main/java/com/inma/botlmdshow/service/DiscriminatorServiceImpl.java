package com.inma.botlmdshow.service;

import com.inma.botlmdshow.domain.Post;
import com.inma.botlmdshow.domain.PostDTO;
import com.inma.botlmdshow.repository.PostRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;


@Service
public class DiscriminatorServiceImpl implements DiscriminatorService {
    private static final Logger log = LoggerFactory.getLogger(DiscriminatorServiceImpl.class);

    private final PostRepository postRepository;

    public DiscriminatorServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public boolean discriminatePost(PostDTO postDTO) {
        String link = postDTO.getLink();
        Optional<Post> postById = postRepository.findAll().stream().filter(post -> post.getTitle().equalsIgnoreCase(link)).findAny();
        boolean present = postById.isPresent();
        if (!present) {
            log.info("No teniamos el post con link {}, saving.", link);
            Post post = new Post();
            post.setTitle(link);
            post.setAccessTime(Long.toString(Instant.now().getEpochSecond()));
            postRepository.save(post);
        }
        return present;
    }
}
