package gameHomeWork.Concrete;

import java.util.ArrayList;
import java.util.List;

import gameHomeWork.Abstract.CampainService;
import gameHomeWork.Entites.Campain;

public class CampainManager implements CampainService{
	
	private List<Campain> campains;
	
	public CampainManager() {
		this.campains = new ArrayList<Campain>();
	}
	@Override
	public void add(Campain campain) {
		campains.add(campain);
		
	}

	@Override
	public void delete(Campain campain) {
		campains.remove(campains.indexOf(campain));
		
	}

	@Override
	public void update(Campain oldCampain, Campain newCampain) {
		int index = campains.indexOf(oldCampain);
		campains.remove(campains.indexOf(oldCampain));
		campains.add(index, newCampain);
		
	}

	@Override
	public void getPlayers() {
		for(Campain campain:campains) {
			System.out.println(campain.getCampainName());
		}
	}

}
