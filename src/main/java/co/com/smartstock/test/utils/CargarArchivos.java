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

    public static void Administracion() throws IOException {
        properties = new Properties();
        properties.load(new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get("Administracion.properties")), StandardCharsets.UTF_8)));
    }

    public static void Parametros() throws IOException {
        properties = new Properties();
        properties.load(new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get("Parametros.properties")), StandardCharsets.UTF_8)));
    }

    public static void Bodegas() throws IOException {
        properties = new Properties();
        properties.load(new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get("Bodegas.properties")), StandardCharsets.UTF_8)));
    }

    public static void Productos() throws IOException {
        properties = new Properties();
        properties.load(new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get("Productos.properties")), StandardCharsets.UTF_8)));
    }

    public static void NvosRegistros() throws IOException {
        properties = new Properties();
        properties.load(new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get("NvosRegistros.properties")), StandardCharsets.UTF_8)));
    }

}

