import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n!=2 && n%2==0){
            if(n>7){
                System.out.println("31");
            }else{
                System.out.println("30");
            }
        }else if(n%2!=0){
            if(n>7){
                System.out.println("30");
            }else{
                System.out.println("31");
            }
            
        }else if(n==2){
            System.out.println("28");
        }
    }
}