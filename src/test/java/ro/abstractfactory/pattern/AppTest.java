package ro.abstractfactory.pattern;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AppTest {

	private App app = new App();;
	private BaseFactory USFactory;
	private BaseFactory enemyFactory;
	
	@Before
	public void setUp() {
		USFactory = app.getUSArmyFactory();
		enemyFactory = app.getEnemyBaseFactory();
	}
	
	@Test
	public void general() {
		final General usGeneral = app.getGeneral(USFactory);
		assertTrue(usGeneral instanceof USGeneral);
		assertEquals(USGeneral.DESCRIPTION, usGeneral.getDescription());
		final General enemyGeneral = app.getGeneral(enemyFactory);
		assertTrue(enemyGeneral instanceof EnemyGeneral);
		assertEquals(EnemyGeneral.DESCRIPTION, enemyGeneral.getDescription());
	}
	
	@Test
	public void base() {
		final Base usBase = app.getBase(USFactory);
		assertTrue(usBase instanceof USBase);
		assertEquals(USBase.DESCRIPTION, usBase.getDescription());
		final Base enemyBase = app.getBase(enemyFactory);
		assertTrue(enemyBase instanceof EnemyBase);
		assertEquals(EnemyBase.DESCRIPTION, enemyBase.getDescription());
	}
	
	@Test
	public void army() {
		final Army usArmy = app.getArmy(USFactory);
		assertTrue(usArmy instanceof USArmy);
		assertEquals(USArmy.DESCRIPTION, usArmy.getDescription());
		final Army enemyArmy = app.getArmy(enemyFactory);
		assertTrue(enemyArmy instanceof EnemyArmy);
		assertEquals(EnemyArmy.DESCRIPTION, enemyArmy.getDescription());
	}
	
	@Test
	public void createUSArmy() {
		app.createBase(USFactory);
		final General usGeneral = app.getGeneral();
		final Base base = app.getBase();
		final Army army = app.getArmy();
		assertTrue(usGeneral instanceof USGeneral);
		assertEquals(USGeneral.DESCRIPTION, usGeneral.getDescription());
		assertTrue(base instanceof USBase);
		assertEquals(USBase.DESCRIPTION, base.getDescription());
		assertTrue(army instanceof USArmy);
		assertEquals(USArmy.DESCRIPTION, army.getDescription());
	}
	
	@Test
	public void createEnemyArmy() {
		app.createBase(enemyFactory);
		final General general = app.getGeneral();
		final Base base = app.getBase();
		final Army army = app.getArmy();
		assertTrue(general instanceof EnemyGeneral);
		assertEquals(EnemyGeneral.DESCRIPTION, general.getDescription());
		assertTrue(base instanceof EnemyBase);
		assertEquals(EnemyBase.DESCRIPTION, base.getDescription());
		assertTrue(army instanceof EnemyArmy);
		assertEquals(EnemyArmy.DESCRIPTION, army.getDescription());
	}
}
