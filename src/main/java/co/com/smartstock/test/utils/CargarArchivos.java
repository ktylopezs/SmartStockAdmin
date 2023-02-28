package co.com.smartstock.test.utils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class CargarArchivos {

    public static Properties properties;

    public static void datoslogin() throws IOException {
        properties = new Properties();
        properties.load(new FileReader("Login.properties"));
    }

    public static void OrdenEntrada() throws IOException {
        properties = new Properties();
        properties.load(new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get("OrdenEntrada.properties")), StandardCharsets.UTF_8)));
    }


}
