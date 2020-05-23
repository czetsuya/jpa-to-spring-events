/**
 * Copyright 2020 - present, Edward P. Legaspi | czetsuya@gmail.com.
 * All rights reserved.
 * 
 * This source code is license under the license found in the 
 * License.md file in the root directory of this source tree.
 */
package com.czetsuya.event;

import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
@Component
public class JpaToSpringEvent {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @PrePersist
    public void created(Object e) {
        applicationEventPublisher.publishEvent(new CreatedJpaEvent(e));
    }

    @PreUpdate
    public void updated(Object e) {
        applicationEventPublisher.publishEvent(new UpdatedJpaEvent(e));
    }

    @PreRemove
    public void removed(Object e) {
        applicationEventPublisher.publishEvent(new RemovedJpaEvent(e));
    }
}
