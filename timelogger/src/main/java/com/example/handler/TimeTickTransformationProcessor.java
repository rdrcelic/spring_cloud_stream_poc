package com.example.handler;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * Interface describes processor channels for time_tick events
 *
 * // TODO move to commons
 *
 * @author rdrcelic
 * @since 09/02/17
 */
public interface TimeTickTransformationProcessor {
    String INPUT_CHANNEL = "time_tick_processor_input";
    String OUTPUT_CHANNEL = "time_tick_processor_output";

    @Input(TimeTickTransformationProcessor.INPUT_CHANNEL)
    SubscribableChannel timeTickChannel();

    @Output(TimeTickTransformationProcessor.OUTPUT_CHANNEL)
    MessageChannel timeTickTransformedChannel();
}
