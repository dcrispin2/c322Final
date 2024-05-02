package repository;


import model.Flower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlowersRepository extends JpaRepository<Flower, String> {
    List<Flower> findAll();
}