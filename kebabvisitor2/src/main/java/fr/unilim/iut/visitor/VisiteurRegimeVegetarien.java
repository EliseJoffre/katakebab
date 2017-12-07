package fr.unilim.iut.visitor;

import fr.unilim.iut.kebab.Assiette;
import fr.unilim.iut.kebab.ingredients.*;

public class VisiteurRegimeVegetarien implements VisiteurDeRegime{

	@Override
	public boolean visit(Boeuf boeuf) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visit(Agneau agneau) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visit(Sauce sauce) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean visit(Crevette crevette) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visit(Fromage fromage) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean visit(Oignon oignon) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean visit(Pain pain) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean visit(Salade salade) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean visit(Thon thon) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visit(Tomate tomate) {
		// TODO Auto-generated method stub
		return true;
	}

}
