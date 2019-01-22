/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Pauessa
 */
 public class Profesor implements Serializable  {
      private int id;
      private Nombre nombre;
 
      public Profesor(){
      }

    public Profesor(Nombre nombre) {
        this.nombre = nombre;
    }
 
  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }
    


    
 }