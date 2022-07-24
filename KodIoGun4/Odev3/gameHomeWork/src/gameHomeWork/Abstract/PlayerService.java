package gameHomeWork.Abstract;


import gameHomeWork.Entites.Player;

public interface PlayerService {
	void add(Player player);
	void update(Player oldPlayer,Player newPlayer);
	void delete(Player player);
	void getPlayers();
}
