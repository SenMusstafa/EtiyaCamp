package gameHomeWork.Abstract;

import gameHomeWork.Entites.Campain;

public interface CampainService {
	void add(Campain campain);
	void delete(Campain campain);
	void update(Campain oldCampain,Campain newCampain);
	void getPlayers();
}
