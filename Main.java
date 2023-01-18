import java.util.*;
public class Main {
            public static void main (String[] args) {
            // Your code here
            Scanner in = new Scanner(System.in);
            int N = in.nextInt();
            int K = in.nextInt();

            String kth_perm_seq = findKthPermutation(N, K);

            // function call
            System.out.println(kth_perm_seq);
        }
        static char[] swap(String s, int i, int j)
        {
            char[] ch = s.toCharArray();
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            return ch;
        }

        static void generate_permutations(String str, int idx,
                                          List<String> result)
        {
            // base case
            if (idx == str.length()) {
                result.add(str);
                return;
            }

            // traverse string from idx to end
            for (int i = idx; i < str.length(); i++) {
                str = new String(swap(str, i, idx));
                generate_permutations(str, idx + 1, result);
                str = new String(swap(str, i, idx));
            }
        }

        // Function to find the
        // kth permutation of n numbers
        static String findKthPermutation(int n, int k)
        {
            String str = "";
            List<String> result = new ArrayList<String>();

            // Insert all natural number
            // upto n in string
            for (int i = 1; i <= n; i++) {
                str += i;
            }
            generate_permutations(str, 0, result);

            // sort the generated permutations
            Collections.sort(result);

            // make k 0-based indexed to point to kth sequence
            return result.get(k - 1);
        }

}
