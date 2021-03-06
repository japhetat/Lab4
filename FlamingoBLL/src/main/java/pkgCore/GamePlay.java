package pkgCore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

import pkgEnum.eGameType;

public abstract class GamePlay {

	private eGameType eGameType;
	private HashMap<UUID,Player> GamePlayers = new HashMap<UUID,Player>();
	
	public GamePlay(eGameType eGameType)
	{
		super();
		this.eGameType = eGameType;
	}
	
	protected void AddPlayersToGame(HashMap<UUID,Player> Players)
	{
		GamePlayers.putAll(Players);
		//TODO: Implement this method
	}
	protected void RemovePlayerFromGame(Player p)
	{
		GamePlayers.remove(p.getPlayerID());
		//TODO: Implement this method		
	}
	protected Player GetPlayerInGame(Player p)
	{
		
		//TODO: Implement this method	
		return GamePlayers.get(p.getPlayerID());
	}

	public HashMap<UUID, Player> getGamePlayers() {
		return GamePlayers;
	}

	public void setGamePlayers(HashMap<UUID, Player> gamePlayers) {
		GamePlayers = gamePlayers;
	}
}
