package com.EComm.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.EComm.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

	
	

}
