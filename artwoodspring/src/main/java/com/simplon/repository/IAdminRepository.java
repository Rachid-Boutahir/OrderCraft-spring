package com.simplon.repository;

import com.simplon.entity.Admin;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdminRepository extends IGenericRepository<Admin, Integer> {
}
