package gameHomeWork.Concrete;

import java.util.List;

import gameHomeWork.Abstract.PlayerService;
import gameHomeWork.Entites.Player;

public class PlayerManager implements PlayerService{
	
	private List<Player> players;
	
	@Override
	public void add(Player player) {
		players.add(player);
		
	}

	@Override
	public void update(Player oldPlayer, Player newPlayer) {
		
	}

	@Override
	public void delete(Player player) {
		players.remove(player.indexOf(player));
		
	}

	@Override
	public void getPlayers() {
		// TODO Auto-generated method stub
		
	}

}
