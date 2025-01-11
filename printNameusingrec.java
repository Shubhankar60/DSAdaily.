public class printNameusingrec {
    public static void printName(int n, int i){
     if(i>n) return;
     System.out.println("Shubhankar das");
     printName(n, i+1);
    }
    public static void main(String args[]){
        int n=10;
        int i=1;
        printName(n,i);
    }
}
