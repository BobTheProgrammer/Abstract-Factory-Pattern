package ro.abstractfactory.pattern;

public class USBase implements Base {

	static final String DESCRIPTION = "This is the US Base!";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}
