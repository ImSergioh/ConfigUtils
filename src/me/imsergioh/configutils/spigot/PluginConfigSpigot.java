package me.imsergioh.configutils.spigot;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class PluginConfigSpigot {

    private final File file;
    private FileConfiguration config;

    public PluginConfigSpigot(String folderPath, String fileName){
        this.file = new File(folderPath, fileName);
        setupFolder(); setupFile();
        config = YamlConfiguration.loadConfiguration(file);
    }

    private void setupFolder(){
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
    }

    private void setupFile(){
        if(!file.exists()){
            try {
               file.createNewFile();
            } catch(Exception e){e.printStackTrace();}
        }
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
