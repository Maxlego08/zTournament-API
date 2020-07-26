package fr.maxlego08.ztournament.api.events;

import java.util.Collection;

import fr.maxlego08.ztournament.api.Arena;
import fr.maxlego08.ztournament.api.Duel;
import fr.maxlego08.ztournament.api.Team;
import fr.maxlego08.ztournament.api.TournoisType;

public class TournamentPostWaveEvent extends TournamentEvent {

	private final Collection<Team> teams;
	private final Collection<Duel> duels;
	private final Collection<Arena> arenas;
	private final TournoisType type;
	private final Team bypassTeam;

	/**
	 * @param teams
	 * @param duels
	 * @param arenas
	 * @param type
	 * @param bypassTeam
	 */
	public TournamentPostWaveEvent(Collection<Team> teams, Collection<Duel> duels, Collection<Arena> arenas,
			TournoisType type, Team bypassTeam) {
		super(true);
		this.teams = teams;
		this.duels = duels;
		this.arenas = arenas;
		this.type = type;
		this.bypassTeam = bypassTeam;
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

	/**
	 * @return the duels
	 */
	public Collection<Duel> getDuels() {
		return duels;
	}

	/**
	 * @return the arenas
	 */
	public Collection<Arena> getArenas() {
		return arenas;
	}

	/**
	 * 
	 * @return
	 */
	public Team getBypassTeam() {
		return bypassTeam;
	}

}
