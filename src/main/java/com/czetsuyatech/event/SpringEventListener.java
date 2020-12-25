/**
 * Copyright 2020 - present, Edward P. Legaspi | czetsuya@gmail.com.
 * All rights reserved.
 * 
 * This source code is license under the license found in the 
 * License.md file in the root directory of this source tree.
 */
package com.czetsuyatech.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
@Component
public class SpringEventListener {

    @EventListener
    public void onJpaEntityCreated(CreatedJpaEvent e) {
        System.out.println("create jpa event received " + e);
    }

    @EventListener
    public void onJpaEntityUpdated(UpdatedJpaEvent e) {
        System.out.println("update jpa event received " + e);
    }

    @EventListener
    public void onJpaEntityRemoved(RemovedJpaEvent e) {
        System.out.println("remove jpa event received " + e);
    }
}
