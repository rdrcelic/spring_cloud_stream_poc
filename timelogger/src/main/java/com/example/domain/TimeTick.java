package com.example.domain;

import lombok.Data;

/**
 * Describes time tick message payload
 *
 * // TODO: move to commons
 *
 * @author rdrcelic
 * @since 09/02/17
 */
@Data
public class TimeTick {
    private String time;
}
