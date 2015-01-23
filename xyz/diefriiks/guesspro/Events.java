package xyz.diefriiks.guesspro;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Event implements Listener {

	private GuessPro plugin;
	
	public Event(GuessPro guessPro) {
		this.plugin = guessPro;
		
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}



	@EventHandler
	public void onclick(InventoryClickEvent e) {

	}
	
	@EventHandler
	public void onchat(AsyncPlayerChatEvent e) {

	}
	
	public void give(boolean b, Player p) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
