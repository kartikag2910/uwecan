package com.example.Uwecan.Service.ServiceImpl;

import com.example.Uwecan.DTO.UserDetailsDTO;
import com.example.Uwecan.Entity.UserDetailsEntity;
import com.example.Uwecan.Repository.UserDetailsRepository;
import com.example.Uwecan.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    UserDetailsRepository userDetailsRepository;
    @Override
    public String addUser(UserDetailsDTO userDetailsDTO) {
        UserDetailsEntity userDetailsEntity=new UserDetailsEntity();
        userDetailsEntity.setAddress(userDetailsDTO.getAddress());
        userDetailsEntity.setName(userDetailsDTO.getName());
        userDetailsEntity.setPhoneNumber(userDetailsDTO.getPhoneNumber());
        userDetailsRepository.save(userDetailsEntity);
        return "Success";
    }
}
