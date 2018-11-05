package com.example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {

    public static void main(final String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        System.out.println("Hello");
        runClass("com.example.Connector");
        runClass("com.example.PluginWrapper");
    }

    private static void runClass(final String name) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        final ClassLoader classLoader = App.class.getClassLoader();
        final Class<?> connectorClass = classLoader.loadClass(name);
        final Method connectorRunMethod = connectorClass.getMethod("run");
        connectorRunMethod.invoke(null);
    }
}
