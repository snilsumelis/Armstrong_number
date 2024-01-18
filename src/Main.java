import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int basnumber=0;
        int temp =number;
        int basvalue;
        int result =0;
        int baspow;

        while (temp!=0){
            temp /=10;
            basnumber++;
        }
        temp =number;
        while (temp!=0){
            basvalue= temp%10;
            baspow=1;
            for (int i =1; i<= basnumber; i++){
                baspow *=basvalue;
            }
            result+= baspow;
            temp/=10;
        }
        System.out.print(result);
    }
}