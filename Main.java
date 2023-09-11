import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //iniciar el scanner
        Scanner entrada = new Scanner(System.in);
        int arreglo[],numero;
        boolean creciente = true;
        //pedir el arreglo
        arreglo = new int[10];

        do{ //usamo do while si se cumple esto....pasa lo que esta adentro
            System.out.println("Rellene el arreglo. ");
            for(int i=0;i<10;i++) { //guardar datos del usuario en el arreglo
                System.out.println(i+" .Digite un número: ");
                arreglo[i] = entrada.nextInt(); //Guardando datos ingresado en el arreglo mediante el esacnner
            }
            //verificamos si es creciente y ordenado
            for(int i=0;i<9;i++){
                if(arreglo[i]<arreglo[i+1]){
                    creciente = true; //Creciente
                    break;
                }
                if(arreglo[i]>arreglo[i+1]){
                    creciente = false; //False
                    break;
                }
            }
            //volvemos a vereificar para estar seguros de que si es creciente y ordenado para que en caso contrario nos mande al inicio otra vez
            if(creciente == false){ //si creciente es falso....
                System.out.println("El arreglo está desordenado, vuelva a digitar otros numeros.");
            }


        }while(creciente == false); //lo que pasa si el do no se cumple

        //pedimos el numero que queramos buscar en nuestro arreglo
        System.out.println("Digite el numero que quiere buscar: ");
        numero = entrada.nextInt();

        //este while necesita otro iterador por lo que inicializamos otro antes del bucle
        int i=0;
        while(i<10 && arreglo[i]<numero){ // si i es menor a 10, y , la posicion del arreglo i es menor a el numero ingresado entonces...
            i++; //aumentamos i hasta que recorra todo el arreglo
        }

        if(i == 10){ // hemos recorrido todo el arreglo y no encotramos nada
            System.out.println("Numero no encontrado");
        }
         else{
             if(arreglo[i] == numero){ //si se ha encontrado el numero en el arreglo
                 System.out.println("Numero encontrado, en la posición: "+i);
             }
             else{
                 System.out.println("Numero no encontrado");
             }
        }
    }
}