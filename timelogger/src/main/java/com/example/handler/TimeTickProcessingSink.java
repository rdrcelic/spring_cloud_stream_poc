package com.example.handler;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * TODO document
 *
 * @author rdrcelic
 * @since 09/02/17
 */
public interface TimeTickProcessingSink {
    String INPUT_CHANNEL = "time_tick_second";

    @Input(TimeTickProcessingSink.INPUT_CHANNEL)
    SubscribableChannel secondTimeTickSink();
}
