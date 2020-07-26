package fr.maxlego08.ztournament.api.events;

import fr.maxlego08.ztournament.Reward;
import fr.maxlego08.ztournament.api.Team;

public class TournamentTeamRewardEvent extends TournamentEvent {

	private final Team team;
	private Reward reward;

	/**
	 * @param team
	 * @param reward
	 */
	public TournamentTeamRewardEvent(Team team, Reward reward) {
		super();
		this.team = team;
		this.reward = reward;
	}

	/**
	 * @return the team
	 */
	public Team getTeam() {
		return team;
	}

	/**
	 * @return the reward
	 */
	public Reward getReward() {
		return reward;
	}

	/**
	 * @param reward
	 *            the reward to set
	 */
	public void setReward(Reward reward) {
		this.reward = reward;
	}

}
