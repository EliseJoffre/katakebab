package fr.unilim.iut.visitor;

import fr.unilim.iut.kebab.Assiette;
import fr.unilim.iut.kebab.ingredients.*;

public interface VisiteurDeRegime {

	 boolean visit(Boeuf boeuf);
	 boolean visit(Agneau agneau);
	 boolean visit(Sauce sauce);
	 boolean visit(Crevette crevette);
	 boolean visit(Fromage fromage);
	 boolean visit(Oignon oignon);
	 boolean visit(Pain pain);
	 boolean visit(Salade salade);
	 boolean visit(Thon thon);
	 boolean visit(Tomate tomate);
	

}
