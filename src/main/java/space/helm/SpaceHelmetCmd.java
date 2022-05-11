package space.helm;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;

public class SpaceHelmetCmd implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length >= 1) {
            String playerName = args[0];
            Player targetPlayer = Bukkit.getPlayer(playerName);
        }

        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (args.length >= 1) {
                String playerName = args[0];
                player = Bukkit.getPlayer(playerName);
            }

            assert player != null;
            if (player.hasPermission("specialgift.dctrspacehelm")) {
                ItemStack itemStack = new ItemStack(Material.RED_STAINED_GLASS);

                ItemMeta itemMeta = itemStack.getItemMeta();
                itemMeta.setDisplayName(ChatColor.RED + "Dctr's Space Helmet");

                itemMeta.setLore(Arrays.asList(
                        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "A rare space helmet forged");
                        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "from shards of moon glass.");
                        lore.add("");
                        lore.add(ChatColor.DARK_GRAY + "To: " + player.getDisplayName());
                        lore.add(ChatColor.DARK_GRAY + "From: " + ChatColor.RED + "[ADMIN] " + ((Player)sender).getDisplayName());
                        lore.add("");
                        lore.add(ChatColor.DARK_GRAY + "Edition: Year 2022");
                        lore.add("");
                        lore.add(ChatColor.DARK_GRAY + "This item can be reforged!");
                        lore.add(ChatColor.RED + "" + ChatColor.BOLD + "SPECIAL HELMET");
                ));

                itemStack.setItemMeta(itemMeta);
                player.getInventory().setHelmet(new ItemStack(itemStack));
                player.sendMessage("§eYou have been given a§e §cDctr's Space Helmet!§c §e(2022)§e");
            } else {
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cYou don't have access to this command!"));
            }
        }
        return true;
    }
}

