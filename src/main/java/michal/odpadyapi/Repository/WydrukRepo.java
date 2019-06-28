package michal.odpadyapi.Repository;

import michal.odpadyapi.Entity.Wydruk;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WydrukRepo extends CrudRepository<Wydruk,Long> {
}
