package Lab7.src.assignment7;

import java.util.HashMap;

public class League {

	private HashMap<String, Division> map = new HashMap<String, Division>();
	
	private String leagueName;

	public League(String string) {
		this.setLeagueName(string);
	}

	public int getNumDivisions2() {
	
		return map.size();
	}

	public void put(String string, Division div) {
		// TODO Auto-generated method stub
		map.put(string, div);
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public int getNumTeams(String string) {
		Division div = map.get(string);
		return div.getNumTeams();
	}
}
