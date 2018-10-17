package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static int sumaCifara(int  n){
        int suma=0;
        do{
            suma+=n%10;
            n/=10;
        }while(n!=0);
        return suma;
    }

    public static boolean daLiJe(int x,int y){
        return x%y==0;
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Unesite broj n: ");
        Scanner ulaz=new Scanner(System.in);
        n=ulaz.nextInt();
        for(int i=1;i<=n;i++){
            if (daLiJe(i, sumaCifara(i))) System.out.println(i);
        }
        System.exit(0);
    }
}
