public class checkPrime {
    public static boolean chprime(int n){
      int cnt=0;
      for(int i=1; i<=n; i++){
        if(n%i==0){
            cnt++;
        }
      }
      if(cnt==2){
        return true;
      }else{
        return false;
      }
    }
    public static void main(String args[]){
        int n=15;
        System.out.println(chprime(n));

    }
}
