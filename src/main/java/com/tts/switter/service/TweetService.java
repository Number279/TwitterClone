package com.tts.switter.service;

import com.tts.switter.model.Tweet;
import com.tts.switter.model.User;

import java.util.List;

public interface TweetService {

    List<Tweet> findAll();
    List<Tweet> findAllByUser(User user);
    List<Tweet> findAllByUsers(List<User> users);
    void save(Tweet tweet);

}