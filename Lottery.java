



package segundo_intento;

import java.util.Scanner;
import java.lang.*;

public class Lottery {
      public static void main(String[] args) {
      
        
        int N=0;
        int C=0; 
        int K=0; 
        int aux=1; 
        int random; 
        int [] contador; 
        boolean condicion;
        int contadordeceros=0;
        int [] noceros; 
        int tamaño; 
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
        
         //aquí tengo que validar que los numeros n c y k sean numeros enteros
        // o sea que no sean "not a number"
        // que no sean menor que cero
        // que no sean flotantes 
        //además condiciones a cumplir: 
        // 1<= N <= 1000 ; 1<= C <= 10 y C < K <= 100 
        
        
while (N<=0 || N>1000 || C<=0 || C>10 || C>=K || K >100 ){
          System.out.println("Uno de los valores es invalido o cero ¡y vamos comenzando!, por favor introduce los 3 numeros otra vez ");
           N= reader.nextInt();
           C= reader.nextInt();
           K= reader.nextInt();
      }



          while(N!=0 && C!=0 && K!=0){
            
       while (N<=0 || N>1000 || C<=0 || C>10 || C>=K || K >100 ){
          System.out.println("Uno de los valores es invalido o cero ¡y vamos comenzando!, por favor introduce los 3 numeros otra vez ");
           N= reader.nextInt();
           C= reader.nextInt();
           K= reader.nextInt();
      }
              
             //para verificar que estoy guardando
        System.out.println("N es " +N);
        System.out.println("C es " +C);
        System.out.println("K es " +K);
        int n=K; 
        int M=C+1;
        min=N;
        System.out.println("n es "+n);
        System.out.println("M es "+M);
        
        //necesito un contador, ¿cuántos lugares/espacios puede tener ese contador? voy a utilizar las posiciones
        // como los numeros y los valores en ellos son las veces que se repite, entonces el tamaño del contador
        // debe ser 100-C+1 
        //encontes el contador sería contador= new int[100-C+1]
        
       // contador=new int[100-C+1]; no así no, porque entonces se recorrería C espacios, tiene que ser
       contador = new int[101]; //son 101 para considerar el cero 
       
        for(int i=1; i<=N; i++){
            for(int j=1; j<=C; j++){
                


                random= reader.nextInt();
            
                contador[random]++;
               
                System.out.print(random+" ");
            }
            System.out.println(" ");
        }
        
        System.out.println("Contador: ");
        for(int i=0; i<=K; i++){
            System.out.print(" " +contador[i]);
        }    
            System.out.println(" ");
            
            //no quiero los numeros que estan por debajo de C, quiero los que estan entre C y K
            
            for(int j=(C+1); j<=K; j++){
//            System.out.println("El numero contador[j] es: " +contador[j]);
                if(contador[j]==0){
                    System.out.println("El número " +j+ " no salio");
                    contadordeceros++;
                }
                tamaño= K-contadordeceros-C-1; //¿le tengo que poner +1 o -1? 
                noceros= new int[tamaño]; 
               if(contadordeceros==0){
                   //aqui necesito tener un mínimo con el que poder comparar o que hago? 
                   //minimo será el auxiliar
                   // se puede repetir un numero N veces, entonces con eso lo voy a comparar
                   if(contador[j]<=min){
                       min=contador[j];
                   }
                   
                   
                   
               } else {
                   min=0; 
               }
            }
        
        System.out.println("minimo fue:" +min);
        
        for(int j=(C+1); j<=K; j++){
            if(contador[j]==min){
                System.out.print(" "+j);
            }
        }
        
            System.out.println(" "); 
            
            
            
            N= reader.nextInt();
            C= reader.nextInt();
            K= reader.nextInt();
            
            
        }
           
            
            
            
            
            
            
        }
}
