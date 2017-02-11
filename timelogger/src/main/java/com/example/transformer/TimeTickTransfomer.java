package com.example.transformer;

import com.example.domain.TimeTick;
import com.example.domain.TimeTickWrapper;
import com.example.handler.TimeTickTransformationProcessor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;

/**
 * Puts time tick in wrapper and resends such transformed time tick further
 *
 * @author rdrcelic
 * @since 09/02/17
 */
@Slf4j
@EnableBinding(TimeTickTransformationProcessor.class)
public class TimeTickTransfomer {

    // @Transformer doesn't work
    //@Transformer(inputChannel = TimeTickTransformationProcessor.INPUT_CHANNEL, outputChannel = TimeTickTransformationProcessor.OUTPUT_CHANNEL)
    @StreamListener(TimeTickTransformationProcessor.INPUT_CHANNEL)
    @SendTo(TimeTickTransformationProcessor.OUTPUT_CHANNEL)
    public TimeTickWrapper transformTimeTick(TimeTick timeTick) {
        log.debug("transforming message: {}", timeTick);
        return new TimeTickWrapper(timeTick);
    }
}
