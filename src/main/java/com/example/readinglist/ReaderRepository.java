package com.example.readinglist;

/**
 * @author weat0212@gmail.com
 * @project readinglist
 * @package PACKAGE_NAME
 * @date 2020/9/11 下午 06:38
 */

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReaderRepository extends JpaRepository<Reader, String> { }
