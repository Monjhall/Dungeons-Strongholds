package io.github.monjhall.dungeonsandstrongholds;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.metadata.FixedMetadataValue;

public class SetClassCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender Sender, Command Command, String Label, String[] Args)
    {

        if (Sender instanceof Player)
        {
            Player Player = (Player) Sender;

            if (Args[2].equals("Ranger"))
            {
                // Eventually set the class here.
            }
        }

        return false;
    }
}
