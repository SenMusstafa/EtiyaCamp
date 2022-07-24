package gameHomeWork.Concrete;

import gameHomeWork.Abstract.PlayerCheckService;
import gameHomeWork.Entites.Player;

public class PlayerCheckManager implements PlayerCheckService{

	@Override
	public boolean checkIfRealPlayer(Player player) {
		if(player.getNationalIdentity().length() ==11) {
			return true;
		}
		
		return false;
	}

}
