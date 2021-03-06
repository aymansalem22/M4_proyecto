package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Movie;
import com.example.demo.entities.Shopcart;
import com.example.demo.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	// Filtrar por email y password
	Optional<User> findByEmailAndPassword(String email, String password);

	
	//List<Shopcart> findAllByUsersId(Long id);




}
