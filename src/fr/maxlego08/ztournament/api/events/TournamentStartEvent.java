package fr.maxlego08.ztournament.api.events;

import fr.maxlego08.ztournament.api.Kit;
import fr.maxlego08.ztournament.api.TournoisType;

public class TournamentStartEvent extends TournamentEvent {

	private TournoisType type;
	private Kit kit;

	/**
	 * @param type
	 * @param kit
	 */
	public TournamentStartEvent(TournoisType type, Kit kit) {
		super();
		this.type = type;
		this.kit = kit;
	}

	/**
	 * @return the type
	 */
	public TournoisType getType() {
		return type;
	}

	/**
	 * @return the kit
	 */
	public Kit getKit() {
		return kit;
	}

	/**
	 * @param kit
	 *            the kit to set
	 */
	public void setKit(Kit kit) {
		this.kit = kit;
	}

	/**
	 * 
	 * @param type
	 */
	public void setType(TournoisType type) {
		this.type = type;
	}

}
