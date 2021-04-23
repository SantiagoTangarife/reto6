
package reto6;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import reto6.MiCuenta;
import java.util.Scanner;
import reto6.CuentaF;


public class FuncionesEx {
    public FuncionesEx(){}
    
    static Scanner sc = new Scanner(System.in); 
    //Se crea un ArrayList para guardar objetos de tipo CuentaF
    static ArrayList<CuentaF> cuentas = new ArrayList();
    
    static ArrayList<MiCuenta> aHistorial=new ArrayList();
    
    public static boolean cuentaExistente(long cuenta){
        for(int i = 0; i < cuentas.size(); i++){
            if(cuentas.get(i).getId()== cuenta){
                
                System.out.println("Este numero de cuenta ya existe.");
                return true;}}
        //System.out.println("La cuenta no existe.");
        return false;
    }
    //----------------------OP1.1----------------------------------
    //Método para leer cuentas e introducirlas en el array
    public static void leerCuentas(){
 
        //Declaración de variables para leer los datos de las cuentas
        long id;
        String pais;
        String tDoc;
        String nDoc;
        String nombre;
        long saldo;
  
        //Variable auxiliar que contendrá la referencia a cada cuenta nueva.
        CuentaF aux;
        
  
        
            
        try{
        System.out.println("# De Cuenta: ");
        sc= new Scanner(System.in);
        String l=sc.nextLine();
        if(l.length()!=11 || (l.charAt(0))!='0' ){
            System.out.println("Cuenta Incorrecta");
            return;
        }
        boolean o=cuentaExistente(Long.parseLong(l));
        if (o==true)
            return;
        id= Long.parseLong(l);  
        
        System.out.println("Pais: ");
        sc= new Scanner(System.in);
        pais = sc.nextLine();
        
        System.out.println("Tipo de Documento:"
                + "\n1) CC"
                + "\n2) PA ");
        
        sc= new Scanner(System.in);
        byte L= sc.nextByte();
        if(L==1)
            tDoc = "CC";
        else {
            tDoc="PA";
        }
        
        System.out.println("# De Documento ");
        sc= new Scanner(System.in);
        nDoc = sc.nextLine();
        
        System.out.println("Nombre Del Titular ");
        sc= new Scanner(System.in);
        nombre = sc.nextLine();
        
        System.out.println("Saldo Disponible ");
        sc= new Scanner(System.in);
        saldo = sc.nextLong();}
        
        catch(Exception e){
            System.out.println("Algunos datos no concuerdan.");
            return;
        }
        
        sc.nextLine(); //limpiar el intro

        aux = new CuentaF(); //Se crea un objeto cuenta y se asigna su referencia a aux                          

        //se asignan valores a los atributos del nuevo objeto
        
        aux.setId(id);
        aux.setNombre(nombre);
        aux.setPais(pais);
        aux.setSaldo(saldo);
        aux.setnDoc(nDoc);
        aux.settDoc(tDoc);

        //se añade el objeto al final del array
        cuentas.add(aux);

    } //fin método leerCuentas()


    //----------------------OP1.2---------------------------------------------

    public static void eliminarCuenta(long cuenta){
        try{
        for(int i = 0; i < cuentas.size(); i++){
            if(cuentas.get(i).getId()== cuenta){
                cuentas.remove(i);
                System.out.println("Cuenta eliminada con exito.");
                return;}}
        System.out.println("La cuenta no existe.");
        }
        catch(Exception e){
            System.out.println("Algunos datos no concuerdan");
            return;
        }
    }

    //----------------------OP2.1------------------------------------------
     public static void consultarSaldo(long cuenta){
        for(int i = 0; i < cuentas.size(); i++){
            if(cuentas.get(i).getId()== cuenta){
                System.out.println("Saldo: "+cuentas.get(i).getSaldo()); 
                return;}}
        System.out.println("La cuenta no existe."); }
         
     
     //#######################################################################################################################################
     //---------------------OP2.2---------------------------------------------
    public static void realizarDepositos(String Fecha){
        System.out.println("Valor a Depositar $"); 
         long valor= sc.nextLong();
        MiCuenta a= new MiCuenta();
        if(valor>0 && valor<9999999){
        a.setSaldo(valor);
        System.out.println("Deposito Exitoso.");
        
        historial("Deposito",valor,Fecha);}
        else{
             System.out.println("Valor invalido.");
        }
    }
     //---------------------OP2.3--------------------------------------------------
     public static void realizarRetiros(String Fecha){
        System.out.println("Valor a Retirar $"); 
                long valor= sc.nextLong();
                MiCuenta a= new MiCuenta();
                long fondo=(long)a.getSaldo();               //FONDOS DISPONIBLES
                if(valor<fondo){
                    a.setSaldo(-valor);
                    System.out.println("Retiro Exitoso.");
                    historial("Retiro",valor,Fecha);
                    return;
                }
                System.out.println("Fondos Insuficientes.");
                return;}
                
    //################################################################################################################################################         
     
     
     
     public static void realizarTransferencias(long destino){       
         
        for(int i = 0; i < cuentas.size(); i++){
            if(cuentas.get(i).getId()== destino){
                System.out.println("Valor a transferir $"); 
                long valor= sc.nextLong();
                MiCuenta a= new MiCuenta();
                long fondo=(long)a.getSaldo();               //FONDOS DISPONIBLES
                if(valor<fondo){
                    long t=(long)cuentas.get(i).getSaldo();
                    t+=fondo;
                    cuentas.get(i).setSaldo(t);
                    a.setSaldo(-fondo);
                    System.out.println("Transferencia Realizada");
                    return;
                }
                System.out.println("Fondos Insuficientes.");
                return;
            }}
         System.out.println("La cuenta no existe.");
         return;
        
        
    }
    
     public static void historial(String TdTrans, long monto,String Fecha){
         
        long id;
        String pais;
        String tTrans;
        String nFe;
        String nombre;
        long saldo;
  
        
        MiCuenta aux;
        MiCuenta a= new MiCuenta();
        
        //Date fechaActual = new Date();
        //DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        //String fecha=formatoFecha.format(fechaActual);
        //System.out.println(formatoFecha.format(fechaActual));
        
            
       
        
        id=(long)a.getId();
        //System.out.print("Pais: ");
        pais = (String)a.getPais();
        
        //System.out.print("Tipo de Transaccion ");     //para historias seria tDoc=Tipo de transaccion
        tTrans = TdTrans;
        
        
        //System.out.print("# De Documento ");      //para historias seria nDoc=Fecha
        nFe = Fecha;
        
        
        //System.out.print("Nombre Del Titular ");
        nombre = (String)a.getNombre();
        
        
        //System.out.print("saldo");
        saldo = monto;                                  //para el historial, monto seria el valor de la transaccion
        
        

        aux = new MiCuenta(); //Se crea un objeto cuenta y se asigna su referencia a aux                          

        //se asignan valores a los atributos del nuevo objeto
        
        aux.setId(id);
        aux.setNombre(nombre);
        aux.setPais(pais);
        aux.setValor(saldo);
        aux.setnDoc(nFe);
        aux.settDoc(tTrans);

        //se añade el objeto al final del array
        aHistorial.add(aux);
        

     }
     
     public static boolean retirosDiarios(String Fecha) throws ParseException{           //¿supere el limite?
         
         int N=5, j=0, i=0;     //5 maxima cantidad de Retiros
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
         
         Date fecha2 = sdf.parse(Fecha); 
         
            
            while(j<N && i<aHistorial.size()){
                 //System.out.println("-7-7-7-7");
                Date fecha1 = sdf.parse(((String)aHistorial.get(i).getnDoc()));
                if( (fecha1.compareTo(fecha2))==0 ){    //EVALUO LA POCICION I Y LA POCISION I+1(FECHAS)
                    j++;
                }
               
                i++;
         }
           if(j>=N){
                System.out.println("No se Pueden Realizar mas transacciones en este dia.");
               return true;} 
               
         
            return false;
     }
     
     public static void mostrarCuentas(){      
        for(int i = 0; i< cuentas.size(); i++)
            System.out.println(cuentas.get(i));  //se invoca el método toString de la clase Coche                  
    }
     
     
     
     public static void transferenciasOrdenadas() throws ParseException{
        int i, j;
        MiCuenta aux;
        for(i = 0; i < aHistorial.size()-1; i++)
            for(j=0; j < aHistorial.size()-i-1; j++){
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
         
            Date fecha1 = sdf.parse(((String)aHistorial.get(j).getnDoc())); 
            Date fecha2 = sdf.parse(((String)aHistorial.get(j+1).getnDoc()));
            if((fecha2.compareTo(fecha1))<0){
            
                    aux = aHistorial.get(j+1);
                    aHistorial.set(j+1, aHistorial.get(j));
                    aHistorial.set(j, aux);                
                }
}
     }
     
      public static void mostrarTransferencias() throws ParseException{   
        transferenciasOrdenadas();
        for(int i = 0; i< aHistorial.size(); i++)
            System.out.println(aHistorial.get(i));  //se invoca el método toString de la clase Coche                  
    }
     
     
}

