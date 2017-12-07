package fr.unilim.iut.kebab.ingredients;

import fr.unilim.iut.kebab.Kebab;
import fr.unilim.iut.visitor.VisiteurDeRegime;

public class Boeuf extends Ingredient{
	
	public Boeuf(String nom, Kebab kebab) {
        super(nom,kebab);
    }

    @Override
	public boolean accept(VisiteurDeRegime visiteurDeRegime) {
		return visiteurDeRegime.visit(this);
	}
}
