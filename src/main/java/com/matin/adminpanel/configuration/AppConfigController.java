package com.matin.adminpanel.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RestController
@RefreshScope
@ConditionalOnProperty(name = "app.comments-and-votes-mode")
public class AppConfigController {

    @Autowired
    private AppConfig appConfig;

    @PostMapping("/config/comments-and-votes-mode")
    public ResponseEntity<String> updateCommentsAndVotesMode(@RequestBody CommentsAndVotesMode mode) {
        appConfig.setCommentsAndVotesMode(mode);
        return new ResponseEntity<>("Configuration updated successfully", HttpStatus.OK);
    }
}

