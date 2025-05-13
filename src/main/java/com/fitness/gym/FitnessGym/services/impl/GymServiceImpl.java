package com.fitness.gym.FitnessGym.services.impl;

import com.fitness.gym.FitnessGym.dtos.GymDto;
import com.fitness.gym.FitnessGym.entities.Gym;
import com.fitness.gym.FitnessGym.mappers.GymMapper;
import com.fitness.gym.FitnessGym.repositories.GymRepository;
import com.fitness.gym.FitnessGym.services.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GymServiceImpl implements GymService {

    @Autowired
    private GymRepository gymRepository;
    @Autowired
    private GymMapper gymMapper;


    @Override
    public GymDto createGym(GymDto gymDto) {
        Gym gym = gymMapper.mapToGym(gymDto);
        Gym savedGym = gymRepository.save(gym);

        return gymMapper.mapToGymDto(savedGym);
    }

    @Override
    public GymDto getGymById(int id) {
        return null;
    }

    @Override
    public List<GymDto> getAllGyms() {
        return List.of();
    }

    @Override
    public GymDto updateGymById(int id, GymDto gymDto) {
        return null;
    }


    @Override
    public String deleteGymById(int id) {
        return "";
    }
}
