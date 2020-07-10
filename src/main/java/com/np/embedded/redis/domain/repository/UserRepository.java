package com.np.embedded.redis.domain.repository;

import com.np.embedded.redis.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserRepository extends CrudRepository<User, UUID> {

}