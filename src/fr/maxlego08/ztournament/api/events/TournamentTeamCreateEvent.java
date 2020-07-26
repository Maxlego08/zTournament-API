package fr.maxlego08.ztournament.api.events;

import org.bukkit.entity.Player;

import fr.maxlego08.ztournament.api.Team;

public class TournamentTeamCreateEvent extends TournamentEvent {

	private final Team team;
	private final Player player;
	private String name;

	/**
	 * @param team
	 * @param player
	 * @param name
	 */
	public TournamentTeamCreateEvent(Team team, Player player, String name) {
		super();
		this.team = team;
		this.player = player;
		this.name = name;
	}

	/**
	 * @return the team
	 */
	public Team getTeam() {
		return team;
	}

	/**
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
