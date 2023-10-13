/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop2;

/**
 *
 * @author Joseph Gael Urbano Meza
 */
public class POOP2 {

    
    public static void main(String[] args) {
        
        /**
         * Creamos nuestro primer programa el cual imprimira en la terminal el mensaje que 
         * hayamos decidido escribir dentro de los parentesis, conocidos como argumentos
         */
        
        System.out.println("Hola querido compañero programador o programadora");
    
        System.out.println("-------- if --------\n");
        int a;
        a = 15;
        int b = 10;
        if (a<b) {
            System.out.println("a es menor que b");
        } else if (a==b){
            System.out.println("a es igual a b");
        }else{
            System.out.println("a es mayor que b");
        }
        
        /**
         * Declaramos un if para ver como funciona y de la forma 
         * mas basica le asignamos dos valores enteros.
         */
        System.out.println("-------- if --------");
        if(menor(a,b)){
            System.out.println("metodo menor retorna true");
        }else{
            System.out.println("metodo menor retorna false");
        }

        
        
        System.out.println("-------- Switch --------\n");
        int mes = 3;
        switch (mes) {
            case 1: 
                System.out.println("Enero"); 
                break;
            case 2: System.out.println("Febrero"); break;
            case 3: System.out.println("Marzo"); break;
            case 4: System.out.println("Abril"); break;
            case 5: System.out.println("Mayo"); break;
            case 6: System.out.println("Junio"); break;
            case 7: System.out.println("Julio"); break;
            case 8: System.out.println("Agosto"); break;
            case 9: System.out.println("Septiembre"); break;
            case 10: System.out.println("Octubre"); break;
            case 11: System.out.println("Noivembre"); break;
            case 12: System.out.println("Diciembre"); break;
            default:
                System.out.println("Mes Incorrecto");
                
        }
        
        /**
         * En esta parte declaramos un switch y hicimos un ejemplo para ver
         * como funciona en java, ya que no es lo mismo en C que en Java a la
         * hora de declarlos
         */
        System.out.println("-------- Switch --------");
        char vocal = '9';
        switch (vocal) {
            case 'a': System.out.println("Seleccionó numero 1"); break;
            case 'e': System.out.println("Seleccionó numero 2"); break;
            case 'i': System.out.println("Seleccionó numero 3"); break;
            case 'o': System.out.println("Seleccionó numero 4"); break;
            case 'u': System.out.println("Seleccionó numero 5"); break;
            default:
                System.out.println("No existe el numero seleccionado");
                System.out.println("\n");
        }
        
        /**
         * En esta parte se uso un while, do-while y un for para poder ver como se usaban y 
         * de igual forma ver como se declaraban en java.
         */
        System.out.println("-------- While --------\n");
        int n=0;
        while (n<10) {
            System.out.println("Contando hacia arriba n="+n);
            n++;
        }
        while (n>0) {
            System.out.println("Contando hacia abajo n="+n);
            n--;
        }
        System.out.println("n="+n);
        
        System.out.println("-------- Do-While --------\n");
        do {            
            System.out.println("Contando hacia abajo");
            n--;
        } while (n>0);
        System.out.println("n="+n);
        
        System.out.println("-------- For --------\n");
        for (int i = 0; i < 10; i++) {
            System.out.println("Contando hacia arriba "+i);  
        }
        
        for (int i = 10; i > 0; i--) {
            System.out.println("Contando hacia abajo " + i);
        }
        
       /**
        * En esta parte hicimos un ejemplo de como funcion un for y un for-each
        */
        System.out.println("-------- For --------\n");
        int[] miArreglo = {1,2,3,4,5, 6, 7, 8, 9, 10};
        int numElementos = miArreglo.length;
        System.out.println("miArreglo tiene "+numElementos+" elementos");
        int[] miArreglo2 = new int[10];
        numElementos = miArreglo2.length;
        System.out.println("miArreglo2 tiene "+numElementos+" posiciones");
        for (int i = 0; i < miArreglo2.length; i++) {
            miArreglo2[i] = i*10;
        }
        for (int i = 0; i < miArreglo2.length; i++) {
            System.out.println("miArreglo2["+i+"]="+miArreglo2[i]);
            System.out.println("\n");
        }
        for (int i = 0; i < miArreglo2.length; i++) {
            int j = miArreglo2[i];
            System.out.println("Mapeo en porcentaje "+j+"%\n");
        }
        
        System.out.println("-------- For-each --------");
        for (int i : miArreglo2) {
            System.out.println("Sustraccion de datos completado "+i+"%");
        }
    }

    private static boolean menor(int x, int y) {
        return x<y;
    }
    
} 


