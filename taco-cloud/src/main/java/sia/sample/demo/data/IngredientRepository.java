package sia.sample.demo.data;

import sia.sample.demo.Ingredient;

public interface IngredientRepository {

	Iterable<Ingredient> findAll();
	
	Ingredient findOne(String id);
	
	Ingredient save(Ingredient ingredient);
}
