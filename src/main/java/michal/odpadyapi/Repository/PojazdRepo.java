package michal.odpadyapi.Repository;

import michal.odpadyapi.Entity.Pojazd;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PojazdRepo extends CrudRepository<Pojazd,Long> {
}
