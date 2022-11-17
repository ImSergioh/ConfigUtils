package me.imsergioh.configutils.spigot;

import me.imsergioh.configutils.util.FileUtil;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class PluginConfigSpigot {

    private final File file;
    private FileConfiguration config;

    public PluginConfigSpigot(String folderPath, String fileName){
        this.file = new File(folderPath, fileName);
        FileUtil.registerFile(file);
        config = YamlConfiguration.loadConfiguration(file);
    }

    public void set(String path, Object value){
        config.set(path, value);
    }

    public void saveConfig(){
        try {
            config.save(file);
        } catch (Exception e){e.printStackTrace();}
    }

    public FileConfiguration config() {
        return config;
    }
}
