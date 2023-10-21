package br.com.rabbithole.blockmanager;

import br.com.rabbithole.common.Common;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class BlockManager extends JavaPlugin {
    private static Common common;

    @Override
    public void onEnable() {
        // Plugin startup logic
        registers();
        common.getMessages().sendSuccess(Bukkit.getConsoleSender(), "[BlockManager] iniciado com Sucesso!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        common.getMessages().sendSuccess(Bukkit.getConsoleSender(), "[BlockManager] desativado com Sucesso!");
    }

    private void registers() {
        common = new Common(this);
    }

    public static Common getCommon() {
        return common;
    }
}
