package fr.maxlego08.ztournament.api.events;

import org.bukkit.entity.Player;

import fr.maxlego08.ztournament.api.Duel;
import fr.maxlego08.ztournament.api.Team;

public class TournamentTeamLooseEvent extends TournamentEvent {

	private final Team team;
	private final Duel duel;
	private final Player player;

	/**
	 * @param team
	 * @param duel
	 * @param player
	 */
	public TournamentTeamLooseEvent(Team team, Duel duel, Player player) {
		super();
		this.team = team;
		this.duel = duel;
		this.player = player;
	}

	/**
	 * @return the team
	 */
	public Team getTeam() {
		return team;
	}

	/**
	 * @return the duel
	 */
	public Duel getDuel() {
		return duel;
	}

	/**
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}

}
