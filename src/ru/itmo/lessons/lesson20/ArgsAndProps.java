package ru.itmo.lessons.lesson20;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ArgsAndProps {
    public static void main(String[] args) {


        for (String arg:args){
            System.out.println(arg);
        }
        Properties properties =new Properties();

        properties.setProperty("key2","value");
        System.out.println(properties.getProperty("key2"));
        properties.clear();

        try(InputStream input = ArgsAndProps.class
                .getClassLoader()
                .getResourceAsStream("lesson20.properties")) {
            properties.load(input);

        }catch (IOException e){
            throw new RuntimeException(e);
        }
        properties.forEach((key, value) -> System.out.println(key + " " + value));




    }
}
