
package reto6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CuentaF {
    CuentaF(){}
    //ATRIBUTOS
    private long id;
    private String pais;
    private String tDoc;
    private String nDoc;
    private String nombre;
    private long saldo;
    
    ArrayList miCuenta= new ArrayList();
    
    //--------------- mostrar cuentas usuarios ------------------------------
     public String toString() {
        StringBuilder sb = new StringBuilder();                                                                   
        sb.append("\n#De La Cuenta: ");
        sb.append(id);
        sb.append("\nPais De La Cuenta:");
        sb.append(pais);
        sb.append("\nTipo De Documento ");
        sb.append(tDoc);
        sb.append("\n#De Documento: ");
        sb.append(nDoc);  
        sb.append("\nNombre Del Titular: ");
        sb.append(nombre); 
        sb.append("\nSaldo Disponible: ");
        sb.append(saldo);  
        
        return sb.toString();
    }   

     
     //-------------------EVALUADOR DE FECHA------------------------------¿es valido?
     public boolean evaluarfecha(String fecha){
         try{
         String[] lista=fecha.split("/");
         List<Integer> de31 = Arrays.asList(1,3,5,7,8,10,12);
         List<Integer> de30 = Arrays.asList(4,6,9,11);
             
         if(Integer.parseInt(lista[2])>2099 || Integer.parseInt(lista[2])<2000 ){
             System.out.println("Fecha invalida");
                return false;}
         //System.out.println("----------");
         //MES DE 31 DIAS VALIDO---------------------------
         if(Integer.parseInt(lista[0])<=31 && (de31.contains(Integer.parseInt(lista[1]) ))  && Integer.parseInt(lista[0])>0){
             return true;
         }
         
         if(Integer.parseInt(lista[0])<=30 && (de30.contains(Integer.parseInt(lista[1]) ))  && Integer.parseInt(lista[0])>0){
             return true;
         }
         if(Integer.parseInt(lista[0])<=29 && (Integer.parseInt(lista[1]))==2  && Integer.parseInt(lista[0])>0){
             return true;
         }
         System.out.println("Formato no admitido");
         return false;
         }
         catch(Exception e){
            System.out.println("Formato invalido");
            return false;
        }
     }
     
     
   
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
        this.saldo = saldo;
    }
    
    
}
