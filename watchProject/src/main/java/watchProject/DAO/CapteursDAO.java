package watchProject.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import watchProject.objects.Capteurs;

@Repository
public interface CapteursDAO extends CrudRepository<Capteurs, Long> {
}