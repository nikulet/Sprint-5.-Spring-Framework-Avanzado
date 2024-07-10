package cat.itacademy.barcelonactiva.ceban.nicusor.s05.t01.n02.model.repository;

import cat.itacademy.barcelonactiva.ceban.nicusor.s05.t01.n02.model.domain.Flor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlorRepo extends JpaRepository<Flor, Integer> {
}
