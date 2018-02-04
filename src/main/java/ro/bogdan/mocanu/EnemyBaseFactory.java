package ro.bogdan.mocanu;

public class EnemyBaseFactory implements BaseFactory {

	public Base createBase() {
		return new EnemyBase();
	}

	public General createGeneral() {
		return new EnemyGeneral();
	}

	public Army createArmy() {
		return new EnemyArmy();
	}

}
