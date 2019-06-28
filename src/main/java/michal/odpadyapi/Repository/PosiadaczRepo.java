package michal.odpadyapi.Repository;

import michal.odpadyapi.Entity.Posiadacz;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PosiadaczRepo extends CrudRepository<Posiadacz,Long> {
}
