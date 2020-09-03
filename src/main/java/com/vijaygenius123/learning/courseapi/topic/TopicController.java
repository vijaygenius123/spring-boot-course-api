package com.vijaygenius123.learning.courseapi.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topic")
    public List<Topic> getAllTopic() {
        return Arrays.asList(
                new Topic("1", "Spring Framework", "About Spring"),
                new Topic("2", "Java", "About Java")
                );
    }
}
