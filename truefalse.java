import java.util.Scanner;

public class truefalse {

    public static void main(String[] args){


        Scanner intro = new Scanner(System.in);

        int lastTrue = 0;
        int l = 1;
        while(intro.hasNextBoolean()){

            
            
            if(intro.nextBoolean()){

                lastTrue = l;

            } 
            l++;

        }
        System.out.println("L'ultim true esta en la línea " + lastTrue);


    }
    
}