package br.com.marcosxavierdev.apitestes.repositories;

import br.com.marcosxavierdev.apitestes.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
