package DSA;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sd= new Scanner(System.in);
        int n=sd.nextInt();
        if(n%2==0){
            System.out.println("it is even no."+n);
        }
        else {
            System.out.println("it is odd no."+n);
        }
    }
}
