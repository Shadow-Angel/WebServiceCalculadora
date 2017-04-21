/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AGC.Android;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Laptop
 */
@WebService
@Stateless
@LocalBean
public class Calculadora {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CalculadoraBasica")
    public String CalculadoraBasica(@WebParam(name = "Operacion") String Operacion, @WebParam(name = "Numero1") String Numero1, @WebParam(name = "Numero2") String Numero2) {
        //TODO write your implementation code here:
        double N1 = Double.parseDouble(Numero1);
        double N2;
        String res = "";
        if (Numero2.equals("")) {
            N2 = Double.parseDouble(Numero2);
        } else {
            N2 = 0.0;
        }
        if (Operacion.equals("Suma")) {
            res = "" + (N1 + N2);
        } else if (Operacion.equals("Resta")) {
            res = "" + (N1 - N2);
        } else if (Operacion.equals("Mult")) {
            res = "" + (N1 * N2);
        } else if (Operacion.equals("Div")) {
            res = "" + (N1 / N2);
        } else if (Operacion.equals("Sen")) {
            res = "" + Math.sin(N1);
        } else if (Operacion.equals("Cos")) {
            res = "" + Math.cos(N1);
        } else if (Operacion.equals("Resi")) {
            res = "" + (N1 % N2);
        } else if (Operacion.equals("Raiz")) {
            res = "" + Math.pow(N1, 1.0 / N2);
        } else if (Operacion.equals("Potencia")) {
            res = "" + Math.pow(N1, N2);
        }
        return res;
    }
}
