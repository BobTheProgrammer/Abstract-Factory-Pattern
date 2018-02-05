package ro.abstractfactory.pattern;


/**
 * Abstract Factory patterns work around a super-factory which creates other factories.
 * This factory is also called as factory of factories.
 * This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
 */

class App {

	private General general;
	private Base base;
	private Army army;

	void createBase(final BaseFactory factory) {
		setGeneral(factory.createGeneral());
		setBase(factory.createBase());
		setArmy(factory.createArmy());
	}
	
	USArmyFactory getUSArmyFactory() {
		return new USArmyFactory();
	}
	
	EnemyBaseFactory getEnemyBaseFactory() {
		return new EnemyBaseFactory();
	}
	
	General getGeneral(final BaseFactory factory) {
		return factory.createGeneral();
	}
	
	Base getBase(final BaseFactory factory) {
		return factory.createBase();
	}
	
	Army getArmy(final BaseFactory factory) {
		return factory.createArmy();
	}
	
	General getGeneral() {
		return general;
	}
	
	private void setGeneral(final General general) {
		this.general = general;
	}
	
	Base getBase() {
		return base;
	}
	
	private void setBase(final Base base) {
		this.base = base;
	}
	
	Army getArmy() {
		return army;
	}
	
	private void setArmy(final Army army) {
		this.army = army;
	}
}
