import java.util.ArrayList;

public class mvAllZeroToEnd {
    public static int[] moveZeros(int n, int a[]){
        ArrayList<Integer>temp=new ArrayList<>();
        for(int i=0; i<n; i++){
            if(a[i]!=0){
                temp.add(a[i]);
            }
        }

        int nz=temp.size();

        for(int i=0; i<nz; i++){
            a[i]=temp.get(i);
        }

        for(int i=nz; i<n; i++){
            a[i]=0;
        }
        return a;
    }
    public static void main(String[] args) {
        int []arr={1, 0, 3, 5, 0, 7};
        int n=6;
        int []ans=moveZeros(n, arr);
        for(int i=0; i<n; i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
}
