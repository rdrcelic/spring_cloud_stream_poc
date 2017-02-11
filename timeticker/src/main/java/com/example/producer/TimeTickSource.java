package com.example.producer;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * Interface describes output channel for time_tick events
 *
 * // TODO: move to commons
 *
 * @author rdrcelic
 * @since 09/02/17
 */
public interface TimeTickSource {
    String OUTPOUT_CHANNEL = "time_tick";

    @Output(TimeTickSource.OUTPOUT_CHANNEL)
    MessageChannel timeTickChannel();
}
