package ro.abstractfactory.pattern;

public interface BaseFactory {

	Base createBase();

	General createGeneral();

	Army createArmy();

}
