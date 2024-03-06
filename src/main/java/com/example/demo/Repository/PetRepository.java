package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Pet;

public interface PetRepository extends JpaRepository<Pet,Integer>{

	}

