package com.paywallet.repository;

import com.paywallet.entity.*;
import org.springframework.data.jpa.repository.*;

public interface UserRepository extends JpaRepository<User, Long> {

}
