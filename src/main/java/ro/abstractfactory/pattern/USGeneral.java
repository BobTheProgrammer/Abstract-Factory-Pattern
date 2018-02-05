package ro.abstractfactory.pattern;

public class USGeneral implements General {

	static final String DESCRIPTION = "This is the US General!";
	
	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}
