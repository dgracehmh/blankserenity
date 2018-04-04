package com.hmhco.hmhqe.utility;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Properties;

public class PropertiesUtil {

    private static Properties properties = null;

    public PropertiesUtil(final String file) {
        try {
            properties = new Properties();
            Reader reader = new InputStreamReader(getClass().getResourceAsStream("/" + file), "UTF-8");
            properties.load(reader);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getValue(final String propertyKey) {
        return properties.getProperty(propertyKey);
    }

    public String setValue(final String propertyKey, final String propertyValue) {
        return (String) properties.setProperty(propertyKey, propertyValue);
    }

}
