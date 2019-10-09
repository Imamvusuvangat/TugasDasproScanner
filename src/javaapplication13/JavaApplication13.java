
package javaapplication13;

import java.util.Scanner;
public class JavaApplication13 {

    public static void main(String[] args) {
        
     String s = "hallo.";  
         
          Scanner scan = new Scanner(s);  
          
          System.out.println("String: " +scan.nextLine());  
          scan.close();           
                  
          System.out.println("--------masukan perintah berikut-------- ");  
          Scanner in = new Scanner(System.in);  
          System.out.print("User: ");    
          String user = in.next();   
          
         
          System.out.print("Password: ");
          String password = in.next();
          
          System.out.print("Email: ");
          String email = in.next();
          
          System.out.print("usia: ");  
          int i = in.nextInt();  
           
          System.out.print("nomor hendphone: ");  
          double d = in.nextDouble();  
          
          System.out.println("--------------- ");  
         
          
          System.out.print("Alamat: "); 
          String alamat = in.next();
          
          System.out.print("Pekerjaan: "); 
          String pekerjaan = in.next();
          
          System.out.print("Universitas: "); 
          String universitas = in.next();
          
          
                 
          in.close();           
          
          
          }    
}  
