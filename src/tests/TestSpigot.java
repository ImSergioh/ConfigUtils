package tests;

import me.imsergioh.configutils.spigot.PluginConfigSpigot;

public class TestSpigot {

    public static void main(String[] args) {
        PluginConfigSpigot pluginConfig = new PluginConfigSpigot("C:\\Users\\muner\\OneDrive\\Documentos\\test", "testSpigot.yml");
        System.out.println(pluginConfig.config().get("asdf"));
        //pluginConfig.config().getConfigurationSection("").getKeys(true).forEach(System.out::println);
        pluginConfig.saveConfig();
    }

}
