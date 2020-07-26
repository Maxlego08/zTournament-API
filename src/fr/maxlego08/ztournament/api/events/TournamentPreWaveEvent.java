package fr.maxlego08.ztournament.api.events;

import java.util.Collection;

import fr.maxlego08.ztournament.api.Team;
import fr.maxlego08.ztournament.api.TournoisType;

public class TournamentPreWaveEvent extends TournamentEvent {

	private final Collection<Team> teams;
	private final TournoisType type;

	/**
	 * @param teams
	 * @param type
	 * @param isAsync 
	 */
	public TournamentPreWaveEvent(Collection<Team> teams, TournoisType type, boolean isAsync) {
		super(isAsync);
		this.teams = teams;
		this.type = type;
	}

	/**
	 * @return the teams
	 */
	public Collection<Team> getTeams() {
		return teams;
	}

	/**
	 * @return the type
	 */
	public TournoisType getType() {
		return type;
	}

}
