package ro.abstractfactory.pattern;

public class EnemyArmy implements Army {

	static final String DESCRIPTION = "This is the Enemy Army!";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}
