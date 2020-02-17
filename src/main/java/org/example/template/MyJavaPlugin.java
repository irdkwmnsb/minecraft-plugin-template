package org.example.template;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class MyJavaPlugin extends JavaPlugin {
    FileConfiguration config = getConfig();
    PluginDescriptionFile descriptionFile = getDescription();
    Logger logger = getLogger();

    @Override
    public void onEnable() {
        logger.info(String.format("%s (%s) is enabling", descriptionFile.getName(), descriptionFile.getVersion()));
    }

    @Override
    public void onDisable() {
        logger.info(String.format("%s (%s) is disabling", descriptionFile.getName(), descriptionFile.getVersion()));
    }
}
