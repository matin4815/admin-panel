package com.matin.adminpanel.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app")
public class AppConfig {

    private CommentsAndVotesMode commentsAndVotesMode;

    public CommentsAndVotesMode getCommentsAndVotesMode() {
        return commentsAndVotesMode;
    }

    public void setCommentsAndVotesMode(CommentsAndVotesMode commentsAndVotesMode) {
        this.commentsAndVotesMode = commentsAndVotesMode;
    }
}


