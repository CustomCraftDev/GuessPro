package xyz.diefriiks.guesspro;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class GuessPro extends JavaPlugin implements CommandExecutor{
	protected Executor exec;
	protected Event event;
	protected config config;
	protected updater updater;
	
	boolean update = false;
	String prefix = "[GuessPro]";
	Object[] obj;
	

	/*
	 *  Bukkit default onEnable function.
	 */
	public void onEnable(){
		updater = new updater(this);
		exec = new Executor(this);
		event = new Event(this);
		config = new config(this);
		
		getCommand("gp").setExecutor(this);
	}
	
	
	/*
	 *  Bukkits default onConmmand function.
	 */
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] split) {
	
		if(sender instanceof Player) {
			Player p = (Player) sender;
			if(cmd.getName().equalsIgnoreCase("gp")){
				//TODO
			}
		}
		return false;
	}
	
	
	/*
	 *  Debug function to print to console.
	 */
	public void say(String msg){
		System.out.println(ChatColor.stripColor(msg));
	}
	
    	
}
