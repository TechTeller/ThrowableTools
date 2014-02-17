package com.github.Wilwark.ThrowableTools;


import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Listener implements org.bukkit.event.Listener
{
    Main plugin;
    public Listener(Main plugin)
    {
        this.plugin = plugin;
    }

    @EventHandler
    public void onRightClick(PlayerInteractEvent event)
    {
        Player p = event.getPlayer();
        if(shotTool(p))
        {
            launchTool(p);
        }
    }

    private boolean shotTool(Player p)
    {
        ItemStack iteminhand = p.getItemInHand();
        if(iteminhand.hasItemMeta())
        {
            if(iteminhand.getItemMeta().getDisplayName().contains("Dagger") || iteminhand.getItemMeta().getDisplayName().contains("Axe"))
            {
                if(iteminhand.getAmount() == 1)
                    return true;
            }
        }
        return false;
    }

    private void launchTool(Player p)
    {
        ItemStack iteminhand = p.getItemInHand();
        ItemStack throwable = iteminhand;
        throwable.setAmount(1);
        World w = p.getWorld();
    }

}
