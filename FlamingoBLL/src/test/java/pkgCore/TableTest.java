package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

public class TableTest {
	Table t = new Table();
	Player Player1 = new Player("Japhet Teshale",1);
	Player Player2 = new Player("Japhet Teshale",1);
	Player Player3 = new Player("Japhet Teshale",1);
	@Test
	public void test() {
		
		t.AddPlayerToTable(Player1);
		t.AddPlayerToTable(Player2);
		t.AddPlayerToTable(Player3);
		assertEquals(Player1.getPlayerID(),t.GetPlayerFromTable(Player1).getPlayerID());
		
		t.RemovePlayerFromTable(Player3);
		assertEquals(null,t.GetPlayerFromTable(Player3));
		
	}

}
