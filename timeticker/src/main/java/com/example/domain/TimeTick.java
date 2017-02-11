package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class represents time tick message payload
 *
 * // TODO move to common
 *
 * @author rdrcelic
 * @since 09/02/17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimeTick {
    private String time;
}
