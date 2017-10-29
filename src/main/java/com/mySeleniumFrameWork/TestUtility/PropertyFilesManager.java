package com.mySeleniumFrameWork.TestUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFilesManager {















private static String configFilePath;

public static Properties config = new Properties();

private static File  file;
private static FileInputStream fis;




public static String getConfigFilePath() {
		return configFilePath;
	}
	public static void setConfigFilePath(String configFilePath) {
		PropertyFilesManager.configFilePath = configFilePath;
	}
	
	
	
	
	public static Properties loadConfigFile()
	{
		file = new File(getConfigFilePath());
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			config.load(fis);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		return config;
	}




	
	
	






}
