package br.com.marcosxavierdev.apitestes.service.implementation;

import br.com.marcosxavierdev.apitestes.domain.User;
import br.com.marcosxavierdev.apitestes.repositories.UserRepository;
import br.com.marcosxavierdev.apitestes.service.UserService;
import br.com.marcosxavierdev.apitestes.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
