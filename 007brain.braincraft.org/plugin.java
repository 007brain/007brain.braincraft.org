package tk.braincraft.test;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class plugin extends JavaPlugin{
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    	
    	//Umwandlung Sender=Player
    	Player p = null;
    	if(sender instanceof Player){
    		p = (Player) sender;
    		
    	}
    	//Kommando "brain"
    	if(cmd.getName().equalsIgnoreCase("brain")){
    		
    		if(p != null){
    			p.sendMessage(ChatColor.RED + "Hallo " + p.getDisplayName());
    			sender.sendMessage(ChatColor.RED + "[Brain" + ChatColor.BLACK + "OS] " + ChatColor.GREEN + "geladen");
    			return true;
    		} else {
    			sender.sendMessage(ChatColor.RED + "[Brain" + ChatColor.BLACK + "OS] " + ChatColor.GREEN + "geladen");
    			return true;
    		}
    		
    	}
    	
    	return false;
    }
}