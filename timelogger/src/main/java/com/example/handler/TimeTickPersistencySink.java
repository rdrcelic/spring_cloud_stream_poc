package com.example.handler;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * Interface describes input channel for time_tick_reframed events
 *
 * // TODO: move to commons
 *
 * @author rdrcelic
 * @since 09/02/17
 */
public interface TimeTickPersistencySink {
    String INPUT_CHANNEL = "time_tick_transformed";

    @Input(TimeTickPersistencySink.INPUT_CHANNEL)
    SubscribableChannel timeTickReframedChannel();
}
