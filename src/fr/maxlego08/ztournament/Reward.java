package fr.maxlego08.ztournament;

import java.util.List;

public class Reward{

	private final int minPosition;
	private final int maxPosition;
	private final List<String> commands;

	/**
	 * @param maxPosition
	 * @param minPosition
	 * @param commands
	 */
	public Reward(int minPosition, int maxPosition, List<String> commands) {
		super();
		this.maxPosition = maxPosition;
		this.minPosition = minPosition;
		this.commands = commands;
	}

	public int getMaxPosition() {
		return maxPosition;
	}

	public int getMinPosition() {
		return minPosition;
	}

	public List<String> getCommands() {
		return commands;
	}

}
