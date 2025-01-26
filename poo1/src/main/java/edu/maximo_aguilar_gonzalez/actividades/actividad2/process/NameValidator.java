package edu.maximo_aguilar_gonzalez.actividades.actividad2.process;

import edu.maximo_aguilar_gonzalez.actividades.actividad2.data.Data;

public class NameValidator {

    public static boolean isNameValid(String name) {
        return Data.getNames().stream().anyMatch(storedName -> storedName.equalsIgnoreCase(name));
    }
}




