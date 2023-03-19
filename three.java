package training;
import java.util.*;
public class three {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        for(int i = 0; i < start ; i++){
            for(int j = i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
