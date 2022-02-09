package br.com.marcosxavierdev.apitestes.service;

import br.com.marcosxavierdev.apitestes.domain.User;

import java.util.List;

public interface UserService {

    User findById (Integer id);
    List<User> findAll();
}
