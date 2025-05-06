package com.fitness.gym.FitnessGym.mappers;

import com.fitness.gym.FitnessGym.dtos.GymDto;
import com.fitness.gym.FitnessGym.entities.Gym;

public class GymMapper {
    public Gym mapToGym (GymDto gymDto){
        Gym gym = new Gym();
        gym.setId(gymDto.getId());
        gym.setName(gymDto.getName());
        gym.setAddress(gymDto.getAddress());
        gym.setCreatedAt(gymDto.getCreatedAt());
        gym.setUpdatedAt(gymDto.getUpdatedAt());

        return gym;
    }

    public GymDto mapToGymDto(Gym gym){
        GymDto gymDto = new GymDto();
        gymDto.setId(gym.getId());
        gymDto.setName(gym.getName());
        gymDto.setAddress(gym.getAddress());
        gymDto.setCreatedAt(gym.getCreatedAt());
        gymDto.setUpdatedAt(gym.getUpdatedAt());

        return gymDto;
    }
}
