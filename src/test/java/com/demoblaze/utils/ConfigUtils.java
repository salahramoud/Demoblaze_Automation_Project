package com.demoblaze.utils;

import java.util.Properties;

public class ConfigUtils {

    private static  Properties properties;

    private static ConfigUtils configUtils;

    private ConfigUtils()
    {
        properties =PropertiesUtils.loadProperties("src/test/java/com/demoblaze/config/production.properties");

    }

    public static ConfigUtils getInstance()
    {
        if (configUtils == null)
        {
            configUtils = new ConfigUtils();
        }
        return configUtils;
    }

    public String getBaseUrl()
    {
        String prop = properties.getProperty("baseUrl");
        if(prop != null) return prop;
        throw new RuntimeException("not find the base URL in property file");

    }

    public String getEmail()
    {
        String prop = properties.getProperty("email");
        if(prop != null) return prop;
        throw new RuntimeException("not find the email in property file");

    }

    public String getPassword()
    {
        String prop = properties.getProperty("password");
        if(prop != null) return prop;
        throw new RuntimeException("not find the password in property file");

    }


}
