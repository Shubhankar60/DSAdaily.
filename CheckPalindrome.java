public class CheckPalindrome {
    public static boolean chpalin(int n){
        int dup=n;
        int ld=0;
        int ans =0;
        while(n>0){
            ld=10%n;
           ans=ans*10+ld; 
            n=n/10;
        }
        if(ans==dup){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        int n=12321;
        boolean finalans=chpalin(n);
        if(finalans==true){
            System.out.println("number is palindrome");
        }else{
            System.out.println("number is not palindrome");
        }
        
    }
}
