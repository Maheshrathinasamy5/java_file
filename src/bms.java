import java.util.Arrays;
import java.util.Scanner;

public class bms {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input1=sc.nextInt();
        int input2=sc.nextInt();
        int input3=sc.nextInt();
        System.out.println(findkey(input1,input2,input3));
    }

    public static int findkey(int input1,int input2,int input3) {
        String s="";
       for(int i=0;i<4;i++){
           int min=Math.min(Math.min(Integer.toString(input1).charAt(i)-'0',Integer.toString(input2).charAt(i)-'0'),
                   Integer.toString(input3).charAt(i)-'0');
           System.out.println(min);
           s+=min;
       }
        return Integer.parseInt(s);
    }
}
