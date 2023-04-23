package ru.mpei.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.mpei.producer.TopicProducer;
import ru.mpei.util.Measurement;

@RequiredArgsConstructor
@RequestMapping(value = "/kafka")
@RestController
public class KafkaController {

    private final TopicProducer topicProducer;

    @PostMapping(value = "/send")
    public void send(@RequestParam Measurement file) {
        topicProducer.send(file);
    }

}
