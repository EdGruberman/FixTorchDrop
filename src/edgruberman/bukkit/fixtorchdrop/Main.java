package edgruberman.bukkit.fixtorchdrop;

import org.bukkit.plugin.java.JavaPlugin;

import edgruberman.bukkit.messagemanager.MessageManager;

public final class Main extends JavaPlugin {
    
    public static MessageManager messageManager;
    
    @Override
    public void onLoad() {        
        Main.messageManager = new MessageManager(this);
        Main.messageManager.log("Version " + this.getDescription().getVersion());
    }
	
    @Override
    public void onEnable() {
        new TorchMonitor(this);
        
        Main.messageManager.log("Plugin Enabled");
    }
    
    @Override
    public void onDisable() {
        Main.messageManager.log("Plugin Disabled");
    }
}