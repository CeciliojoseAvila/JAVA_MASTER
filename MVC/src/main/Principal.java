
package main;

import controller.Controlador;
import models.Modelo;
import views.Vista;

public class Principal {
    public static void main(String[] args) {
        Vista vista_prueba = new Vista();
        Modelo modelo_prueba = new Modelo();
        
        Controlador controlador_prueba = new Controlador(vista_prueba, modelo_prueba);
        
        vista_prueba.setVisible(true);
    }
}
