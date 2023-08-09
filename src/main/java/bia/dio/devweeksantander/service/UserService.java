package bia.dio.devweeksantander.service;

import bia.dio.devweeksantander.domain.User;

public interface UserService {
	User findById(Long id);

    User create(User userToCreate);
    
    void delete(Long id);
}
