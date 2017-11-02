package pkgCore;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.UUID;

import org.junit.Test;

import pkgEnum.eGameType;

public class GamePlayTest {
	Table t = new Table();
	Player Player1 = new Player("Japhet Teshale",1);
	Player Player2 = new Player("Japhet Teshale",1);
	Player Player3 = new Player("Japhet Teshale",1);
	HashMap<UUID,Player> PlayersAtTable;
	GamePlayBlackJack Game = new GamePlayBlackJack(eGameType.BLACKJACK);
	
	@Test
	public void test() {
		t.AddPlayerToTable(Player1);
		t.AddPlayerToTable(Player2);
		t.AddPlayerToTable(Player3);
		PlayersAtTable = t.getPlayersInTable();
		Game.AddPlayersToGame(PlayersAtTable);
		assertEquals(Game.getGamePlayers(),PlayersAtTable);
		assertEquals(Player1.getPlayerID(),Game.GetPlayerInGame(Player1).getPlayerID());
		Game.RemovePlayerFromGame(Player3);
		assertEquals(null,Game.GetPlayerInGame(Player3));
		
	}

}
