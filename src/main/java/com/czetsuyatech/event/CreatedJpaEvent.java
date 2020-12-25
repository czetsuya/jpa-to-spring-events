/**
 * Copyright 2020 - present, Edward P. Legaspi | czetsuya@gmail.com.
 * All rights reserved.
 * 
 * This source code is license under the license found in the 
 * License.md file in the root directory of this source tree.
 */
package com.czetsuyatech.event;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class CreatedJpaEvent extends JpaEvent {

    private static final long serialVersionUID = -8923264580035968707L;

    public CreatedJpaEvent(Object source) {
        super(source, "CREATED");
    }

}
