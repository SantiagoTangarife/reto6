/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto6;

import java.util.ArrayList;

/**
 *
 * @author saxss
 */
public class MiCuenta {
    public MiCuenta(){}
    
    //ATRIBUTOS
    
    private long id=1234567890;
    private String pais="Colombia";
    private String tDoc="CC";
    private String nDoc="1234567";
    private String nombre="Santiago Tangarife";
    public static long saldo;
    public long valor;
    //---------------MOSTRAR MIS TRANSFERENCIAS--------------------
     public String toString() {
        StringBuilder sb = new StringBuilder();                                                                   
        sb.append("\n#De La Cuenta: ");
        sb.append(id);
        sb.append("\nPais De La Cuenta:");
        sb.append(pais);
        sb.append("\nTipo De Transaccion ");
        sb.append(tDoc);
        sb.append("\nFecha de Transaccion: ");
        sb.append(nDoc);  
        sb.append("\nNombre Del Titular: ");
        sb.append(nombre); 
        sb.append("\nValor Transaccion: ");
        sb.append(valor);  
        
        return sb.toString();
    }   

    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }
    
    
    
    
    //---------------------------------------

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String gettDoc() {
        return tDoc;
    }

    public void settDoc(String tDoc) {
        this.tDoc = tDoc;
    }

    public String getnDoc() {
        return nDoc;
    }

    public void setnDoc(String nDoc) {
        this.nDoc = nDoc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = this.saldo +saldo;
        //System.out.println(getSaldo());
      
        
    }
}
    
   
