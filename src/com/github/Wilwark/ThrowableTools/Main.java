package com.github.Wilwark.ThrowableTools;


import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashSet;
import java.util.Set;

public class Main extends JavaPlugin
{
    Set<Material> tools = new HashSet<Material>();

    public void onEnable()
    {
        Listener l = new Listener(this);
        getServer().getPluginManager().registerEvents(l, this);
        getLogger().info("Activated ThrowableTools");
    }

    public void onDisable()
    {
        getLogger().info("ThrowableTools deactivated");
    }

    private void instantiateThrowables()
    {
        tools.add(Material.IRON_AXE);
        tools.add(Material.IRON_SWORD);
        tools.add(Material.DIAMOND_AXE);
        tools.add(Material.DIAMOND_SWORD);
    }
}
