package com.example.processor;

import com.example.domain.TimeTick;
import com.example.handler.TimeTickProcessingSink;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * TODO document
 *
 * @author rdrcelic
 * @since 09/02/17
 */
@Slf4j
@EnableBinding(TimeTickProcessingSink.class)
public class TimeTickProcessor {

    @StreamListener(TimeTickProcessingSink.INPUT_CHANNEL)
    public void procesTimeTick(TimeTick message) {
        log.debug("processing message: {}", message);
    }
}
