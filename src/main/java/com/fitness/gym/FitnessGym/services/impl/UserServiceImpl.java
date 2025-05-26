package com.fitness.gym.FitnessGym.services.impl;

import com.fitness.gym.FitnessGym.dtos.UserDto;
import com.fitness.gym.FitnessGym.entities.User;
import com.fitness.gym.FitnessGym.mappers.UserMapper;
import com.fitness.gym.FitnessGym.repositories.UserRepository;
import com.fitness.gym.FitnessGym.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;


    @Override
    public UserDto createUser(UserDto userDto) {
        User user = userMapper.mapToUser(userDto);
        User savedUser = userRepository.save(user);
        return userMapper.mapToUserDto(savedUser);
    }

    @Override
    public UserDto getUserById(int id) {
        User user = userRepository.findById(id).orElseThrow( () -> new RuntimeException("User of this Id not found!") );
        return userMapper.mapToUserDto(user);
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = userRepository.findAll();
        List<UserDto> userDtos = users.stream().map(userMapper::mapToUserDto).toList();
        return userDtos;
    }

    @Override
    public UserDto updateUserById(int id, UserDto userDto) {
        User user = userRepository.findById(id).orElseThrow( () -> new RuntimeException("User of this Id not found!") );
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        user.setUpdatedAt(userDto.getUpdatedAt());

        User savedUser = userRepository.save(user);

        return userMapper.mapToUserDto(savedUser);
    }

    @Override
    public String deleteUserById(int id) {
        if (userRepository.existsById(id)){
            userRepository.deleteById(id);
            return "Successfully deleted!" + id;
        }
        else {
            return "No record found!";
        }

    }
}
