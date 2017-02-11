package com.example.logging;

import com.example.domain.TimeTick;
import com.example.handler.TimeTickLoggingSink;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * Concrete implementation of time_tick event handler
 *
 * @author rdrcelic
 * @since 09/02/17
 */
@Slf4j
@EnableBinding(TimeTickLoggingSink.class)
public class TimeTickLogger {

    @StreamListener(TimeTickLoggingSink.INPUT_CHANNEL)
    public void logTimeTick(TimeTick message) {
        log.debug("logging message: {}", message);
    }
}
