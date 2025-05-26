package com.fitness.gym.FitnessGym.repositories;

import com.fitness.gym.FitnessGym.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
