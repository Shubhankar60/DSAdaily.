import java.util.Scanner;
public class CountDigit{
    public static int countdig(int n){
        int cnt=0;
        while(n>0){
            n=n/10;
            cnt++;
        }
        return cnt;
    }
    public static void main(String args[]){
        int n=56749928;
        System.out.println(n);
        int ans=countdig(n);
        System.out.println(ans);
    }
}