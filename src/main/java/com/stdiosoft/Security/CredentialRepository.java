package com.stdiosoft.Security;

import com.stdiosoft.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CredentialRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
