package ro.abstractfactory.pattern;

public class USArmy implements Army {

	static final String DESCRIPTION = "This is the US Army!";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}
