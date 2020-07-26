package fr.maxlego08.ztournament.api.events;

import org.bukkit.entity.Player;

import fr.maxlego08.ztournament.api.Team;

public class TournamentTeamJoinEvent extends TournamentEvent {

	private final Team team;
	private final Player player;
	private boolean canJoin;

	/**
	 * @param team
	 * @param player
	 * @param canJoin
	 */
	public TournamentTeamJoinEvent(Team team, Player player, boolean canJoin) {
		super();
		this.team = team;
		this.player = player;
		this.canJoin = canJoin;
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
	 * @return the canJoin
	 */
	public boolean isCanJoin() {
		return canJoin;
	}

	/**
	 * @param canJoin
	 *            the canJoin to set
	 */
	public void setCanJoin(boolean canJoin) {
		this.canJoin = canJoin;
	}

}
