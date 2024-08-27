package Utilities;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import java.io.File;

public class configProvider  {
    static String path="src/main/resources/config";
    static String prefix="/application";
    static String extension=".conf";

    static String configFileName=path+prefix+extension;

    static File configFile= new File(configFileName);

    static Config c= ConfigFactory.parseFile(configFile);

     static Config conf = ConfigFactory.load(c);

    public static Config config(){
        return conf;
    }
}