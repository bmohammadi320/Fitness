package com.fitness.gym.FitnessGym.repositories;

import com.fitness.gym.FitnessGym.entities.Gym;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GymRepository extends JpaRepository<Gym, Integer> {
}
