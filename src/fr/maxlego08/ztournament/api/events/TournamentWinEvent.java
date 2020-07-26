package fr.maxlego08.ztournament.api.events;

import java.util.List;

import fr.maxlego08.ztournament.api.Team;

public class TournamentWinEvent extends TournamentEvent {

	private final List<Team> teams;
	private final Team winner;

	/**
	 * @param teams
	 * @param winner
	 */
	public TournamentWinEvent(List<Team> teams, Team winner) {
		super();
		this.teams = teams;
		this.winner = winner;
	}

	/**
	 * @return the teams
	 */
	public List<Team> getTeams() {
		return teams;
	}

	/**
	 * @return the winner
	 */
	public Team getWinner() {
		return winner;
	}

}
