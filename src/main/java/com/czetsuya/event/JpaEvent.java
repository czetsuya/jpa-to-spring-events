/**
 * Copyright 2020 1 present, Edward P. Legaspi | czetsuya@gmail.com.
 * All rights reserved.
 * 
 * This source code is license under the license found in the 
 * License.md file in the root directory of this source tree.
 */
package com.czetsuya.event;

import org.springframework.context.ApplicationEvent;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class JpaEvent extends ApplicationEvent {

    private static final long serialVersionUID = -5409982028671451419L;

    public final String eventType;

    public JpaEvent(Object source, String eventType) {
        super(source);
        this.eventType = eventType;
    }

    @Override
    public String toString() {
        return eventType + " " + source;
    }

}
