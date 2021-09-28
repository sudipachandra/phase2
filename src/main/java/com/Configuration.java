package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {
    final static String PROJECT_PROPERTY_FILE = "project.properties";
    static Properties properties = null;

    static void loadProperties() throws Throwable{
        if (properties == null) {
            properties = new Properties();
            String propFilePath = System.getProperty("user.dir") + "/src/test/resources/features/" + PROJECT_PROPERTY_FILE;
            //System.out.println(propFilePath);
            File file = new File(propFilePath);
            InputStream ins = new FileInputStream(propFilePath);
            properties.load(ins);
        }
    }

    public static void main(String[] args) throws Throwable{
        String propFilePath = System.getProperty("user.dir")+"/src/test/resources/features/"+PROJECT_PROPERTY_FILE;
        System.out.println(propFilePath);
        File file = new File(propFilePath);
        System.out.println(file.exists());
        InputStream ins = new FileInputStream(propFilePath);
        properties.load(ins);
        System.out.println(properties.getProperty("browserType"));
    }

    public static String getProperty(String name) throws Throwable{
        loadProperties();
        return properties.getProperty(name);
    }

}
