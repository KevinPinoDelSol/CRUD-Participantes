package Excepciones;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
 public class ErrorDeTipoDeDato extends NullPointerException {
     public ErrorDeTipoDeDato(){
         super("Ha ocurrido un error al entrar algun dato. Al parecer no era un numero.");
     }
     
     public ErrorDeTipoDeDato(String msg){
         super(msg);
     }
    
}
