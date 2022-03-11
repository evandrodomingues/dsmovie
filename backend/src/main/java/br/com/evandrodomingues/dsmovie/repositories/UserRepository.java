package br.com.evandrodomingues.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.evandrodomingues.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
}
