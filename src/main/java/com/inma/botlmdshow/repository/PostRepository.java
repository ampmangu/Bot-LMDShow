package com.inma.botlmdshow.repository;

import com.inma.botlmdshow.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

@EnableMongoRepositories(basePackages = "com.inma.botlmdshow.repository")
@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
