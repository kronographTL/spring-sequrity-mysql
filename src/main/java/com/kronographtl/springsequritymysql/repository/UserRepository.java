package com.kronographtl.springsequritymysql.repository;

import com.kronographtl.springsequritymysql.model.UserDO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserDO, Integer> {
    Optional<UserDO> findUserByUserName(String userName);
}
