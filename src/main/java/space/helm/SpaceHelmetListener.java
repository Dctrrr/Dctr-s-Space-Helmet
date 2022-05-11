package space.helm;

import org.bukkit.event.Listener;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class SpaceHelmetListener implements Listener {

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        if (event.getBlockPlaced().getType().equals(Material.RED_STAINED_GLASS)) {
            event.setCancelled(true);
            if (event.getBlockPlaced().getType().equals(Material.BLACK_STAINED_GLASS)) {
                event.setCancelled(true);
                if (event.getBlockPlaced().getType().equals(Material.BLUE_STAINED_GLASS)) {
                    event.setCancelled(true);
                    if (event.getBlockPlaced().getType().equals(Material.BROWN_STAINED_GLASS)) {
                        event.setCancelled(true);
                        if (event.getBlockPlaced().getType().equals(Material.CYAN_STAINED_GLASS)) {
                            event.setCancelled(true);
                            if (event.getBlockPlaced().getType().equals(Material.GREEN_STAINED_GLASS)) {
                                event.setCancelled(true);
                                if (event.getBlockPlaced().getType().equals(Material.LIGHT_BLUE_STAINED_GLASS)) {
                                    event.setCancelled(true);
                                    if (event.getBlockPlaced().getType().equals(Material.LIME_STAINED_GLASS)) {
                                        event.setCancelled(true);
                                        if (event.getBlockPlaced().getType().equals(Material.LIGHT_GRAY_STAINED_GLASS)) {
                                            event.setCancelled(true);
                                            if (event.getBlockPlaced().getType().equals(Material.MAGENTA_STAINED_GLASS)) {
                                                event.setCancelled(true);
                                                if (event.getBlockPlaced().getType().equals(Material.ORANGE_STAINED_GLASS)) {
                                                    event.setCancelled(true);
                                                    if (event.getBlockPlaced().getType().equals(Material.YELLOW_STAINED_GLASS)) {
                                                        event.setCancelled(true);
                                                        if (event.getBlockPlaced().getType().equals(Material.PINK_STAINED_GLASS)) {
                                                            event.setCancelled(true);
                                                            if (event.getBlockPlaced().getType().equals(Material.PURPLE_STAINED_GLASS)) {
                                                                event.setCancelled(true);
                                                                if (event.getBlockPlaced().getType().equals(Material.GRAY_STAINED_GLASS)) {
                                                                    event.setCancelled(true);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
