package com.fitness.gym.FitnessGym.services;

import com.fitness.gym.FitnessGym.dtos.GymDto;

import java.util.List;

public interface GymService {
    GymDto createGym (GymDto gymDto);
    GymDto getGymById(int id);
    List<GymDto> getAllGyms();
    GymDto updateGymById(int id, GymDto gymDto);
    String deleteGymById(int id);
}
