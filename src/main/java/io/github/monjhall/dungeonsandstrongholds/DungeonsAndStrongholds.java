package io.github.monjhall.dungeonsandstrongholds;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class DungeonsAndStrongholds extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new HitListener(), this);

        getCommand("setclass").setExecutor(new SetClassCommand());
    }
    @Override
    public void onDisable() {

    }
}
