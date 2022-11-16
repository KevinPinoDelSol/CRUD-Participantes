/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author Kevin
 */
class ErrorPosicionNoValida extends Exception {
    public ErrorPosicionNoValida(){
        super("Ha introducido una posicion no valida.");
    }
}
