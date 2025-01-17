package com.SFM.Student_Management.repositories;

import com.SFM.Student_Management.entities.Account;
import com.SFM.Student_Management.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Account, String> {


     static Account findByRole(Role userRole){
         return null;
     }

    Optional<Account> findFirstByEmail(String email);
}
