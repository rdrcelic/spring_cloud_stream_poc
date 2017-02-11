package com.example.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Simple time tick wrapper to support transformer processor
 *
 * // TODO: move to common
 *
 * @author rdrcelic
 * @since 09/02/17
 */
@Data
@NoArgsConstructor
public class TimeTickWrapper {

    private static final String messagePrefix = "Transformed time tick: ";

    private String value;
    private String customProperty;

    public TimeTickWrapper(TimeTick timeTick) {

        value = messagePrefix + timeTick.getTime();
        customProperty = UUID.randomUUID().toString();
    }
}
