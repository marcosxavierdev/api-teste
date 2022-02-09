package br.com.marcosxavierdev.apitestes.service;

import br.com.marcosxavierdev.apitestes.domain.User;
import br.com.marcosxavierdev.apitestes.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById (Integer id);
    List<User> findAll();
    User create (UserDTO obj);
    User update (UserDTO obj);
    void delete (Integer id);
}
