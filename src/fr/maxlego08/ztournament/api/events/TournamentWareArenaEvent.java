package fr.maxlego08.ztournament.api.events;

import fr.maxlego08.ztournament.api.Arena;
import fr.maxlego08.ztournament.api.Duel;

public class TournamentWareArenaEvent extends TournamentEvent {

	private final Arena arena;
	private final Duel duel;

	/**
	 * @param arena
	 * @param duel
	 */
	public TournamentWareArenaEvent(Arena arena, Duel duel) {
		super();
		this.arena = arena;
		this.duel = duel;
	}

	/**
	 * @return the arena
	 */
	public Arena getArena() {
		return arena;
	}

	/**
	 * @return the duel
	 */
	public Duel getDuel() {
		return duel;
	}

	}
