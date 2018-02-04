package ro.bogdan.mocanu;

public class USArmyFactory implements BaseFactory {

	public Base createBase() {
		return new USBase();
	}

	public General createGeneral() {
		return new USGeneral();
	}

	public Army createArmy() {
		return new USArmy();
	}

}
