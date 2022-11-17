package me.imsergioh.configutils.util;

import java.io.File;

public class FileUtil {

    public static void registerFile(File file){
        if(!file.getParentFile().exists()){
            file.mkdirs();
        }

        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (Exception e){e.printStackTrace();}
        }
    }

}
