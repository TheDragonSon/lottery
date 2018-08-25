
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author greym
 */
public class lottery {


    public static void main(String[] args) {
     
      
        
        int N = 0;
        int C = 0; 
        int K = 0; 
       
        int random; 
        int [] contador; 
        
        int contadordeceros=0;
        
        int min; 
        
        
        System.out.println("¡BIENVENIDO A LA BD DE LA LOTERIA");
        System.out.println("Escribe separados por un espacio, 1) El número de sorteos que ya han pasado "
                + "2)cuantos numeros comprenden una apuesta y 3) el valor máximo de los números que pueden"
                + "ser escogidos ");
          System.out.println("Después de esto escribe los valores de cada sorteo y recuerda que no se "
                  + "pueden repetir numeros por sorteo ");
        Scanner reader= new Scanner(System.in);
        N= reader.nextInt();
        C= reader.nextInt();
        K= reader.nextInt();
        
      
        
          while(N!=0 && C!=0 && K!=0){
          
              
          while (N<=0 || N>10000 || C<=0 || C>10 || C>=K || K >100 ){
           System.out.println("Uno de los valores es invalido o cero ¡y vamos comenzando!, por favor introduce los 3 numeros otra vez");
           N= reader.nextInt();
           C= reader.nextInt();
           K= reader.nextInt();
      }
        
        int n=K; 
        int M=C+1;
        min=N;

     
       contador = new int[101]; 
       
        for(int i=1; i<=N; i++){
            for(int j=1; j<=C; j++){
                


                random= reader.nextInt();
            
                contador[random]++;
               
                
            }
            
        }
        
        
        for(int i=0; i<=K; i++){
            
        }    
            System.out.println(" ");
            
         
            
            for(int j=(C+1); j<=K; j++){

                if(contador[j]==0){
                    System.out.print(" "+j);
                    contadordeceros++;
                }
                
               if(contadordeceros==0){
                   
                   if(contador[j]<=min){
                       min=contador[j];
                   }
                   
                   
                   
               } else {
                   min=0; 
               }
            }
        
     
        if(contadordeceros==0){
            for(int j=(C+1); j<=K; j++){
            if(contador[j]==min){
                System.out.print(j+" ");
            }
        }
        }
        
        
            System.out.println(" "); 
            
            
            
            N= reader.nextInt();
            C= reader.nextInt();
            K= reader.nextInt();
            
            
        }
           
            
            
            
            
            
            
        }
    
        
        
        
        
    
    
}
