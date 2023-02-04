import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Kthpermutation {
    public static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    static StringBuilder sb = new StringBuilder();
    public static void helper(ArrayList<Integer> a1, int kth){
        if(a1.isEmpty()){
            return;
        }
        int n = a1.size();
        int permutationOfEachDigit = factorial(n)/n;
        int target = (kth-1)/permutationOfEachDigit;
        sb.append(a1.get(target));
        a1.remove(target);
        kth= kth-permutationOfEachDigit*target;
        helper(a1,kth);
    }



    public static void main (String[] args) throws IOException {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int idx=1;
        for(idx =1; idx<=n;idx++){
            if(factorial(idx)>=k){
                break;
            }
        }
        int i=1;
        for(; i<=n-idx; i++){
            sb.append(i);
        }
        ArrayList<Integer> a1 = new ArrayList<>();
        for(int j=i;i<=n;i++){
            a1.add(i);
        }
        helper(a1,k);
        System.out.print(sb);

    }
}
