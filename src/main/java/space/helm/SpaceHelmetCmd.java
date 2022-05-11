package space.helm;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import space.helm.dctr;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class SpaceHelmetCmd implements CommandExecutor {

        @Override
        public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

                if (args.length >= 1){

                        String playerName = args[0];
                        Player targetPlayer = Bukkit.getPlayer(playerName);

                }


                if (sender instanceof Player) {
                        Player player = (Player)sender;
                        if (args.length >= 1) {
                                String playerName = args[0];
                                player = Bukkit.getPlayer(playerName);
                        }
                        if (player.hasPermission("dctr.givespacehelm"));
                        ItemStack itemStack = new ItemStack(Material.RED_STAINED_GLASS);
                        ItemMeta itemMeta = itemStack.getItemMeta();
                        itemMeta.setDisplayName(ChatColor.RED + "Dctr's Space Helmet");
                        ArrayList<String> lore = new ArrayList<>();
                        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "Drop this item to decrease your FPS");
                        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "Immune to drops");
                        lore.add("");
                        lore.add(ChatColor.DARK_GRAY + "To: " + player.getDisplayName());
                        lore.add(ChatColor.DARK_GRAY + "From: " + ChatColor.RED + "[ADMIN] " + ((Player)sender).getDisplayName());
                        lore.add("");
                        lore.add(ChatColor.DARK_GRAY + "Edition: Year 2022");
                        lore.add("");
                        lore.add(ChatColor.DARK_GRAY + "This item can be reforged!");
                        lore.add(ChatColor.RED + "" + ChatColor.BOLD + "SPECIAL HELMET");
                        itemMeta.setLore(lore);
                        itemStack.setItemMeta(itemMeta);
                        player.getInventory().setHelmet(new ItemStack(itemStack));
                        player.sendMessage("§eYou have been given a§e §cDctr's Space Helmet!§c §e(2022)§e");
                }
                return true;
        }
}
