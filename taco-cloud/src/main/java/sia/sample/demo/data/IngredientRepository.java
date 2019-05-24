package sia.sample.demo.data;

import org.springframework.data.repository.CrudRepository;
import sia.sample.demo.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);
}
