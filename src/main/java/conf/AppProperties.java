package conf;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AppProperties {
   
    public static void initProperty(String filename) {
	if(props == null) {
	    props = new Properties();
	}try {
	    props.loadFromXML(new FileInputStream(filename));
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
    
    private static Properties props;
    
    public static String getProperty(String prop_name) {
	return props.getProperty(prop_name);
    }
}