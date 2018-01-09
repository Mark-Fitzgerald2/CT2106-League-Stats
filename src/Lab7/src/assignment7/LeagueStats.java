package Lab7.src.assignment7;

public class LeagueStats {
	
	private League league;

	public void add(League lg) {
		this.league = lg; //adds league to leagueStats
	}

	public int getNumDivisions2() {
		// TODO Auto-generated method stub
		return league.getNumDivisions2();
	}

	public int getNumTeams(String string) {
		return league.getNumTeams(string);
	}

}
