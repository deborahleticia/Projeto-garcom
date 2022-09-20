import java.util.Scanner;

public class garcom{
    static int meuMetodo(int quantL, int quantC, int quantCQ){    
        if(quantL > quantC){
            quantCQ += quantC;
        }
        return quantCQ;
    }
public static void main(String[] args){
   Scanner A = new Scanner(System.in);
    int quantB = A.nextInt();
    int quantCQ = 0;
        for(int i=0; i<quantB; i++){
            int quantL = A.nextInt();
            int quantC = A.nextInt();
            quantCQ = meuMetodo(quantL, quantC, quantCQ); 
        }
        System.out.println(quantCQ);
    }
}