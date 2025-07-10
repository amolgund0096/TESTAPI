package com.sample.sample.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.sample.Entity.Test;

public interface TestRepository extends JpaRepository<Test, Long> {

}
