package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigFile {
	
	private static Properties prop;
	
	static {
		try{
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/Config.properties");
			prop=new Properties();
			prop.load(fis);
			fis.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}

}
