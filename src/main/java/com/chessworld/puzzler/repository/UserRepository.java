package com.chessworld.puzzler.repository;

import com.chessworld.puzzler.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> { // data type for ID

}
