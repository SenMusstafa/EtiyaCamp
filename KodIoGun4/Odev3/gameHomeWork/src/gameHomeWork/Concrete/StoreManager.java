package gameHomeWork.Concrete;

import gameHomeWork.Abstract.StoreService;
import gameHomeWork.Entites.Campain;
import gameHomeWork.Entites.Game;
import gameHomeWork.Entites.Player;

public class StoreManager implements StoreService {

	@Override
	public void sell(Campain campain, Player player, int selectIndex) {
		player.setGames((Game) campain.getGames());
		
	}

}
