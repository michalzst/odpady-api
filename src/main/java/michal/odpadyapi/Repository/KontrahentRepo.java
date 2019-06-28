package michal.odpadyapi.Repository;

import michal.odpadyapi.Entity.KontrahentNaWydruku;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KontrahentRepo extends CrudRepository<KontrahentNaWydruku,Long> {
}
