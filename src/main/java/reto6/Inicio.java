
package reto6;

import java.util.Scanner;
import reto6.CuentaF;
import reto6.FuncionesEx;        
import static reto6.FuncionesEx.sc;


public class Inicio {

    public static void main(String[] args) {
    FuncionesEx c= new FuncionesEx();    
    CuentaF a= new CuentaF();
    MiCuenta mi= new MiCuenta();
    boolean z=true;
    Scanner lector= new Scanner(System.in);
    
    while(z==true){
        try{
        System.out.println(" \n   MENU PRINCIPAL"
                + "\n 1) Agregar y eliminar cuentas de ahorros."
                + "\n 2) Realizar transacciones."
                + "\n 3) Realizar transferencias."
                + "\n 4) Mostrar Cuentas."
                + "\n 5) Mostrar Transferencias."
                + "\n 6) Salir.");
        lector= new Scanner(System.in);
        byte op=lector.nextByte();
        
        if(op==1){
            //System.out.println("        --------"+op);
            //long num= 3125824929L;
            System.out.println("    "
                + "\n 1) Agregar cuentas de ahorros."
                + "\n 2) Eliminar cuentas de ahorros.."
                + "\n ");
        lector= new Scanner(System.in);
        byte op1=lector.nextByte();
            System.out.println("");
        
        if(op1==1){
             c.leerCuentas();}
        if(op1==2){
            System.out.println(""
                    + "\n # De la cuenta a Eliminar.");
            try{
            lector=new Scanner(System.in);
            String l=lector.nextLine();
            if(l.length()!=11 || (l.charAt(0))!='0' ){
                System.out.println("Cuenta Incorrecta");
            l="khkjhkjhkhu";}
            long num=Long.parseLong(l);
            c.eliminarCuenta(num);
            }
            catch(Exception e){
            System.out.println("Algunos datos no concuerdan");
            
        }
        }
        }
        
        if (op==2){System.out.println(" \n" +
                "1) Consultar saldo.\n" +
                "2) Realizar depósitos.\n" +
                "3) Realizar retiros.\n");
                lector= new Scanner(System.in);
                byte op2=lector.nextByte();
                System.out.println("");
        
        if(op2==1){
            System.out.println("mi saldo disponible es:"+(mi.getSaldo()));
            
        }
        else if(op2==2){
            try{
            System.out.println("Ingrese la fecha de la siguiente manera DD/MM/YYYY");
            lector= new Scanner(System.in);
            String fecha=lector.nextLine();
            boolean eva= a.evaluarfecha(fecha);
            if (eva==true){
                boolean eva1=c.retirosDiarios(fecha);
                if(eva1==false){
                    c.realizarDepositos(fecha);}}
            
            }
            catch(Exception e){
            System.out.println("Algunos datos no concuerdan");
            
        }
        }
        
        else if(op2==3){
            try{
            System.out.println("Ingrese la fecha de la siguiente manera DD/MM/YYYY");
            lector= new Scanner(System.in);
            String fecha=lector.nextLine();
            boolean eva= a.evaluarfecha(fecha);
            if (eva==true){
                boolean eva1=c.retirosDiarios(fecha);
                if(eva1==false){
                    c. realizarRetiros(fecha);}}
            }
            catch(Exception e){
            System.out.println("Algunos datos no concuerdan");
            return;
        }
        }
        

            
            
            
            
        }
        if (op==3){ 
            try{
            System.out.println("Ingrese el numero de la cuenta a la cual va a transferier");
            lector= new Scanner(System.in);
             
            String l=lector.nextLine();
            if(l.length()!=11 || (l.charAt(0))!='0' ){
                //System.out.println("Cuenta Incorrecta");
                l="yguygiuguigu";
        }
        
            long num= Long.parseLong(l);
            c.realizarTransferencias(num);}
            catch(Exception e){
            System.out.println("Cuenta incorrecta");
             
            }
        }
        
        
        if (op==4){
            c.mostrarCuentas();
        }
        if(op==5){
            c.mostrarTransferencias();
        }
        if(op==6){
            z=false;
        }
            
           //c.consultarSaldo(num);
            
            
        
        
    
        
        
        
        
        
        
        
        
        
        /*CuentaF a= new CuentaF();
        a.inicio();
        System.out.println(a.miCuentaE(5));
        a.miCuentaCargar(10000);
          System.out.println(a.miCuentaE(5));
         a.miCuentaCargar(15000);
          System.out.println(a.miCuentaE(5));*/
        
    }
    catch(Exception e){
            System.out.println("Valores Invalidos.");
    }
    }}}
    
    
         
         
     
    

