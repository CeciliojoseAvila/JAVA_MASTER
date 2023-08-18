
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Modelo;
import views.Vista;

public class Controlador implements ActionListener{
   private Vista view;
   private Modelo model;

    public Controlador(Vista view, Modelo model) {
        this.view = view;
        this.model = model;
        
        this.view.btn_suma.addActionListener(this);
        this.view.btn_resta.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.setNumero_uno(Integer.parseInt(view.cajatxt_uno.getText()));
        model.setNumero_dos(Integer.parseInt(view.cajatxt_dos.getText()));
        
        if (e.getSource() == view.btn_suma) {
            model.sumar();
            view.cajatxt_resultado.setText(String.valueOf(model.getResultado()));
            
        }else if(e.getSource() == view.btn_resta){
            model.restar();
            view.cajatxt_resultado.setText(String.valueOf(model.getResultado()));
        }
    }
   
   
}
