package ro.abstractfactory.pattern;

public class EnemyBase implements Base {

	static final String DESCRIPTION = "This is the Enemy Base!";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}
