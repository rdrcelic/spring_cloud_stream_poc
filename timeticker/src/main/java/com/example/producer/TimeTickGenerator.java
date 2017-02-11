package com.example.producer;

import com.example.domain.TimeTick;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * This is time tick generator - message producer
 *
 * @author rdrcelic
 * @since 09/02/17
 */
@Slf4j
@Service
@EnableBinding(TimeTickSource.class)
public class TimeTickGenerator {

    private TimeTickSource timeTickSource;

    @Autowired
    public TimeTickGenerator(TimeTickSource source) {
        this.timeTickSource = source;
    }

    /**
     * send time upon request
     */
    public void sendTimeTick() {
        timeTickSource.timeTickChannel().send(MessageBuilder.withPayload(new TimeTick(new Date().toString())).build());
    }

    /**
     * send time every minute
     *
     * @return
     */
    @Bean
    @InboundChannelAdapter(value = TimeTickSource.OUTPOUT_CHANNEL, poller = @Poller(fixedRate = "1000", maxMessagesPerPoll = "1"))
    public MessageSource<TimeTick> timeTickMessageSource() {
        return () -> new GenericMessage<>(new TimeTick(new Date().toString()));
    }
}
