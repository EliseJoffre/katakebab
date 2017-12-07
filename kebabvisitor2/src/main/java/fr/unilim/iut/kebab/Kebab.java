package fr.unilim.iut.kebab;

import java.util.List;
import fr.unilim.iut.kebab.ingredients.Ingredient;
import fr.unilim.iut.visitor.VisiteurRegimePescetarien;
import fr.unilim.iut.visitor.VisiteurRegimeVegetarien;

public abstract class Kebab {
	public abstract List<Ingredient> getIngredients();
	public boolean isVegetarien() {
		for(Ingredient ingredients : this.getIngredients()) {
			if(!ingredients.accept(new VisiteurRegimeVegetarien())) {
				return false;
			}
		}
		return true;
	}
	public  boolean isPescetarien() {
		for(Ingredient ingredients : this.getIngredients()) {
			if(!ingredients.accept(new VisiteurRegimePescetarien())) {
				return false;
			}
		}
		return true;
	};
}
