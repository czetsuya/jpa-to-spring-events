/**
 * Copyright 2020 - present, Edward P. Legaspi | czetsuya@gmail.com.
 * All rights reserved.
 * 
 * This source code is license under the license found in the 
 * License.md file in the root directory of this source tree.
 */
package com.czetsuya.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.czetsuya.business.data.entity.Book;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
