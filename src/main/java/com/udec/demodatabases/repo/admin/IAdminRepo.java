package com.udec.demodatabases.repo.admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udec.demodatabases.model.admin.Admin;

@Repository
public interface IAdminRepo extends JpaRepository<Admin, Integer> {

}
