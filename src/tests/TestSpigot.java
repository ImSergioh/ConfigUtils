package tests;

import me.imsergioh.configutils.spigot.PluginConfigSpigot;

public class TestSpigot {

    public static void main(String[] args) {
        PluginConfigSpigot pluginConfig = new PluginConfigSpigot("C:\\Users\\muner\\OneDrive\\Documentos\\test", "testSpigot.yml");
        pluginConfig.set("asdf", "Testing path!");
        pluginConfig.saveConfig();
    }

}
