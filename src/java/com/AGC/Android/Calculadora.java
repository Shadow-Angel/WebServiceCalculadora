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
        double N2 = Double.parseDouble(Numero2);
        String res = "";
        if (Operacion.equals("Suma")) {
            res = "" + (N1 + N2);
        } else if (Operacion.equals("Resta")) {
            res = "" + (N1 - N2);
        } else if (Operacion.equals("Multiplicacion")) {
            res = "" + (N1 * N2);
        } else if (Operacion.equals("Divicion")) {
            res = "" + (N1 / N2);
        } else {
            res = "no prr";
        }
        return res;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    /**
     * Web service operation
     */
    @WebMethod(operationName = "CalculadoraCient")
    public String CalculadoraCient(@WebParam(name = "Numero1") String Numero1, @WebParam(name = "Numero2") String Numero2, @WebParam(name = "Resultado") String Resultado, @WebParam(name = "Operacion") String Operacion) {
        double N1 = Double.parseDouble(Numero1);
        double N2 = Double.parseDouble(Numero2);
        String res = "";
        if (Operacion.equals("Suma")) {
            res = "" + (N1 + N2);
        } else if (Operacion.equals("Resta")) {
            res = "" + (N1 - N2);
        } else if (Operacion.equals("Multiplicacion")) {
            res = "" + (N1 * N2);
        } else if (Operacion.equals("Divicion")) {
            res = "" + (N1 / N2);
        } else {
            res = "no prr";
        }
        return res;        
    }
}
