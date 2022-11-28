import java.util.Scanner;

public class truefalse {

    public static void main(String[] args){


        Scanner intro = new Scanner(System.in);

        int ultimTrue = 0;  //variable per al ultim true
        int linea = 1;  //variable per a contar la línia

        while(intro.hasNextBoolean()){ //bucle

            if(intro.nextBoolean()){ //mentre hagi un boolean per llegir

                ultimTrue = linea; //actualitzem la variable

            } 
            linea++; // contador

        }
        System.out.println("L'ultim true esta en la línea " + ultimTrue);

    }
    
}