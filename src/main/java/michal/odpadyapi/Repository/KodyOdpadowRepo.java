package michal.odpadyapi.Repository;

import michal.odpadyapi.Entity.KodyOdpadow;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KodyOdpadowRepo extends CrudRepository<KodyOdpadow,Long> {
}
