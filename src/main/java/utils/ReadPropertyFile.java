package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.cs.constants.FrameWorkConstant;

public final class ReadPropertyFile {
	
	private static Properties prop = new Properties();
	private static final Map <String,String> CONFIGMAP = new HashMap<>();
	private ReadPropertyFile()  {}
	
	static 
	{
		try
		{
			FileInputStream fis = new
			FileInputStream(FrameWorkConstant.getConfigmapfilepath());
			prop.load(fis);
			for (Map.Entry<Object, Object> entry : prop.entrySet()) 
			{
				CONFIGMAP.put(String.valueOf(entry.getKey()),
				String.valueOf(entry.getValue()).trim());
			}
		} 
		catch(FileNotFoundException e)
		{
		e.printStackTrace();
		} 
		catch(IOException e)
		{
		e.printStackTrace();
		}
	}	
	public static String get(String key) throws Exception
	{
		if (Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key)))
		throw new Exception("problem in reading property" + key + "please check config.properties file");
		return CONFIGMAP.get(key);
	}
	
}
		
//		Properties prop = new Properties();
//		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config/config.properties");
//		prop.load(fis); //Stores key values in memory
//		String value = prop.getProperty(key);
//		if(Objects.isNull(value))
//			throw new Exception("problem in reading property" + key + "please check config.properties file");
//		else
//			return value;
		
		
		
		

