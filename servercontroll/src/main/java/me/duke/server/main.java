package me.duke.server;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        Server servercon = Bukkit.getServer();

        String bv = servercon.getBukkitVersion();
        System.out.println(ChatColor.GREEN + "Get Bukkit Vertion Plugin");
        System.out.println(bv);


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
