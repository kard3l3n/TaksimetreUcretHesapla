package taksimetreucrethesapla;
import java.util.Scanner;
import java.math.*;

public class TaksimetreUcretHesapla {

    public static void main(String[] args) {
        double  mesafeucreti = 2.20,totalcost;
        int yol;
        
        Scanner input=new Scanner(System.in);
        System.out.println("musterinin gittiği mesafe:");
        yol=input.nextInt();
        
        totalcost=10+(yol * mesafeucreti);
        
        if(totalcost<=20){
            totalcost=20;
        }
        
        System.out.println("Müşterinin Ödemesi Gereken Tutar:"+totalcost);
        
        
    }
    
}
