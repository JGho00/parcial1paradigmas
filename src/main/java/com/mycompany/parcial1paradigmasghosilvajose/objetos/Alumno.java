/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcial1paradigmasghosilvajose.objetos;

public class Alumno extends Persona {
    private String Matricula;

    public Alumno(String Matricula) {
        this.Matricula = Matricula;
    }



    public Alumno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /*metodos*/

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }
    
}
