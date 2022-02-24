package com.inma.botlmdshow;

import com.inma.botlmdshow.domain.Data;
import com.inma.botlmdshow.service.DiscriminatorService;
import com.inma.botlmdshow.service.RedditService;
import com.inma.botlmdshow.service.TwitterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@Component
public class Scheduler {
    private static final Logger log = LoggerFactory.getLogger(Scheduler.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    private final RedditService redditService;
    private final DiscriminatorService discriminatorService;
    private final TwitterService twitterService;

    public Scheduler(RedditService redditService, DiscriminatorService discriminatorService, TwitterService twitterService) {
        this.redditService = redditService;
        this.discriminatorService = discriminatorService;
        this.twitterService = twitterService;
    }

    @Scheduled(fixedRate = 5, timeUnit = TimeUnit.MINUTES)
    public void scheduledTask() {
        log.info("Executando Bot LMDShow a las {}", dateFormat.format(new Date()));
        Data allPosts = this.redditService.getAllPosts();
        log.info("Recibio {} posts", allPosts.getData().size());
        allPosts.getData().forEach(post -> {
            boolean discriminated = discriminatorService.discriminatePost(post);
            if (!discriminated) {
                twitterService.postTweet(post);
            } else {
                log.info("Nos saltamos ese post, por duplicado y por feo.");
            }
        });
    }

}
