package sia.sample.demo.data;

import org.springframework.data.repository.CrudRepository;
import sia.sample.demo.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long> {

    Taco save(Taco taco);

}
