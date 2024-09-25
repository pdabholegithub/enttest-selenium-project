package ent_utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class constant {
	public static String BASE_URL= "";
	public static String FIRST_NAME= "";
	public static String LAST_NAME= "";
	public static String EMAIL= "";
	public static String COMPANY= "";
	public static String PHONE_NUMBER= "";
	public static String UNIT_COUNT= "";
	public static String JOB_TITLE= "";
	public static String SELECT_PERSON= "";
	
	public constant() throws IOException {
		Properties properties= new Properties();
	    String configFilePath= "src/test/resource/ent_utility/configuration.properties";
	    
	    InputStream input= new FileInputStream(configFilePath);
	    properties.load(input);

	    BASE_URL= properties.getProperty("BASE_URL");
	    FIRST_NAME= properties.getProperty("FIRST_NAME");
	    LAST_NAME= properties.getProperty("LAST_NAME");
	    EMAIL= properties.getProperty("EMAIL");
	    COMPANY= properties.getProperty("COMPANY");
	    PHONE_NUMBER= properties.getProperty("PHONE_NUMBER");
	    UNIT_COUNT= properties.getProperty("UNIT_COUNT");
	    JOB_TITLE= properties.getProperty("JOB_TITLE");
	    SELECT_PERSON= properties.getProperty("SELECT_PERSON");
	}
}
