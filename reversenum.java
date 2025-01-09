// reverse the number//
public class reversenum {
    public static int revnum(int n){
       int ans =0;
       int lastdig=0;
        while(n>0){
          lastdig=n%10;
          n=n/10;
           ans=ans*10+lastdig;
       
        }
       return ans;
    }
public static void main(String args[]){
    int n=123456;
   int finalans=revnum(n);
   System.out.println(finalans);
}
}
