public class PrintNTimes {
    static int cnt = 0;
    static void print(){
        
         // Base Condition.
         if(cnt == 45 ) return;
         System.out.println(cnt);

         // Count incremented.
         cnt++;
         print();

    }
    public static void main(String[] args) {
        print();
    }
}
