package ru.dgu.dockerproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dgu.dockerproject.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
