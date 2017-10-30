import java.util.*;
public class Main {
//標準體重換算
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h,s; //h身高 s性別
        h=in.nextInt();
        s=in.nextInt();

        if(s==1){
            System.out.println((h-80)*0.7f);
        }

        else
            System.out.println((h-70)*0.6);
    }
}
