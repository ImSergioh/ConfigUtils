package me.imsergioh.configutils.bungeecord;

import me.imsergioh.configutils.util.FileUtil;
import net.md_5.bungee.config.Configuration;
import net.md_5.bungee.config.ConfigurationProvider;
import net.md_5.bungee.config.YamlConfiguration;

import java.io.File;

public class PluginConfigBungee {

    private final File file;
    private Configuration config;

    public PluginConfigBungee(String filePath, String fileName){
        this.file = new File(filePath, fileName);
        FileUtil.registerFile(file);
        reloadConfig();
    }

    public void set(String path, Object value){
        config.set(path, value);
    }

    public void saveConfig(){
        try {
            ConfigurationProvider.getProvider(YamlConfiguration.class).save(config, file);
        } catch (Exception e){e.printStackTrace();}
    }

    public void reloadConfig(){
        try {
            config = ConfigurationProvider.getProvider(YamlConfiguration.class).load(file);
        } catch (Exception e){e.printStackTrace();}
    }

    public Configuration config(){return config;}

}
