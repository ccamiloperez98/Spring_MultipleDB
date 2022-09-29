package com.udec.demodatabases.repo.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udec.demodatabases.model.user.User;

@Repository
public interface IUserRepo extends JpaRepository<User, Integer> {

}
