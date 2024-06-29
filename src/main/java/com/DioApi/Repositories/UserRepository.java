package com.DioApi.Repositories;

import com.DioApi.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User,Long>{
    boolean existsByAccountId(Long accountNumber);
}
