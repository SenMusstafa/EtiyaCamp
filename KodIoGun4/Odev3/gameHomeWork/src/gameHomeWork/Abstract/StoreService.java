package gameHomeWork.Abstract;

import gameHomeWork.Entites.Campain;
import gameHomeWork.Entites.Player;

public interface StoreService {
	void sell(Campain campain, Player player,int selectIndex);
}
