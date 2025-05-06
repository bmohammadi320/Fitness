package com.fitness.gym.FitnessGym.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GymDto {
    private int id;
    private String name;
    private String address;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
