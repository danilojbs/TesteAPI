package fire.sc.testeapi;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class TesteAPI extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("&aPlugin Habilitado!");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("&cPlugin Desabilitado!");
    }

    public String getName(Player p){
        return p.getName();
    }

}
