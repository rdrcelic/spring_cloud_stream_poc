package com.example.persistency;

import com.example.domain.TimeTickWrapper;
import com.example.handler.TimeTickPersistencySink;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * Persists time tick reframed messages in DB (logging only for demo purposes)
 *
 * @author rdrcelic
 * @since 09/02/17
 */
@Slf4j
@Component
@EnableBinding(TimeTickPersistencySink.class)
public class TimeTickRepository {

    @StreamListener(TimeTickPersistencySink.INPUT_CHANNEL)
    public void persistTimeTick(TimeTickWrapper object) {
        log.debug("persisting object: {}", object);
    }
}
