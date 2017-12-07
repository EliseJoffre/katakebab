package fr.unilim.iut.kebab.ingredients;

import fr.unilim.iut.kebab.Kebab;
import fr.unilim.iut.visitor.VisiteurDeRegime;

public class Salade extends Ingredient {

	public Salade(String nom, Kebab kebab) {
		super(nom, kebab);
	}
	

	@Override
	public boolean isPescetarien() {
		return super.isPescetarien();
	}


	@Override
	public boolean accept(VisiteurDeRegime visiteurDeRegime) {
		return visiteurDeRegime.visit(this);
	}
}
