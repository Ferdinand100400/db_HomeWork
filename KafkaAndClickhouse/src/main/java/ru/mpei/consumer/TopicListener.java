package ru.mpei.consumer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ru.mpei.util.Measurement;

@Slf4j
@RequiredArgsConstructor
@Service
public class TopicListener {

    @Value("${topic.name.consumer}")
    private String topicName;

    @KafkaListener(topics = "${topic.name.consumer}", groupId = "group_id")
    public void consume(ConsumerRecord<String, Measurement> measurementPayload) {
        log.info("Topic: {}", topicName);
        log.info("key: {}", measurementPayload.key());
        log.info("Headers: {}", measurementPayload.headers());
        log.info("Partion: {}", measurementPayload.partition());
        log.info("Order: {}", measurementPayload.value());
    }

}