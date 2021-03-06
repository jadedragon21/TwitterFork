package com.example.demo.service;


import com.example.demo.model.Tweet;
import com.example.demo.model.User;
import com.example.demo.repository.TweetRepository;
import java.util.List;

public interface TweetService {

    List<Tweet> findAll();
    List<Tweet> findAllByUser(User user);
    List<Tweet> findAllByUsers(List<User> users);
    List<Tweet> findAllWithTag(String tag);
    void handleTags(Tweet tweet);
    void save(Tweet tweet);

}
