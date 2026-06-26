package com.demoblaze.utils;

import java.io.*;
import java.util.Properties;

public class PropertiesUtils {

    public static Properties loadProperties(String filePath)
    {
        File file =new File(filePath);
        try {
            InputStream inputStream=new FileInputStream(file);

            Properties properties=new Properties();
            properties.load(inputStream);
            inputStream.close();

            return properties;
        } catch (FileNotFoundException e) {
            //related to InputStream inputStream=new FileInputStream(file);
            throw new RuntimeException("File is not found");
        } catch (IOException e) {
            //related to properties.load(inputStream);
            throw new RuntimeException("error while loading the properties");
        }

    }
}
