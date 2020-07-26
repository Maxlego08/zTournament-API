package fr.maxlego08.ztournament.api.events;

public class TournamentStartTickEvent extends TournamentEvent {

	private final int timer;

	/**
	 * @param isAsync
	 * @param timer
	 */
	public TournamentStartTickEvent(int timer) {
		super(true);
		this.timer = timer;
	}

	public int getTimer() {
		return timer;
	}

}
