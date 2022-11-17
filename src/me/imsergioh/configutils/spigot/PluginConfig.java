package me.imsergioh.configutils.spigot;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class PluginConfig extends FileConfiguration {

    private final File file;
    private FileConfiguration config;

    public PluginConfig(String folderPath, String fileName){
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

    @Override
    public String saveToString() {
        return null;
    }

    @Override
    public void loadFromString(String s) throws InvalidConfigurationException {

    }

    @Override
    protected String buildHeader() {
        return null;
    }
}
