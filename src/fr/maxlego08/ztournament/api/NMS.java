package fr.maxlego08.ztournament.api;

import org.bukkit.entity.Player;

public interface NMS {
	
	/**
	 * Send title to player
	 * @param title
	 * @param subTitle
	 * @param start
	 * @param time
	 * @param end
	 */
	void sendTitle(Player player, String title, String subTitle, int start, int time, int end);
	
	
}
