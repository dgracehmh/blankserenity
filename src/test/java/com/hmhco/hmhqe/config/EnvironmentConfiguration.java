package com.hmhco.hmhqe.config;

import com.hmhco.hmhqe.utility.PropertiesUtil;

/**
 * Created by graced on 22/12/2016.
 */
public final class EnvironmentConfiguration {

    private static PropertiesUtil propertiesUtil = new PropertiesUtil("environment.properties");

    private EnvironmentConfiguration() {

    }

    public static String getValue(final String key) {
        return propertiesUtil.getValue(key);
    }
}
