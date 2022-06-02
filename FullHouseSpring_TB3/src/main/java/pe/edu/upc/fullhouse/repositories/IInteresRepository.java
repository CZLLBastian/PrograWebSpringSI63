package pe.edu.upc.fullhouse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.fullhouse.entities.Interes;

@Repository
public interface IInteresRepository extends JpaRepository<Interes, Integer> {

}
