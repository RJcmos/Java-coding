package Sorting;

public class Mergesort {
    public static void main(String[] args) {
            int[] a ={3,7,4,5,1,2,6};
            int n= a.length;
        //Mergesort obj =new Mergesort();
        Msorting(a,0,n-1);
            printArray(a);
        }
        static void printArray(int arr[])
        {
            int n = arr.length;
            for (int i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
        public static void Msorting(int[] arr,int l,int r){
           // System.out.print(l+" "+h);
            if (l < r) {
                // Find the middle point
                int m = l + (r - l) / 2;

                // Sort first and second halves
                Msorting(arr, l, m);
                Msorting(arr, m + 1, r);

                // Merge the sorted halves
                merge(arr, l,r,m);
            }

        }
        public static void merge(int[] arr,int l,int h, int mid){
            System.out.println(l+" "+h+"  "+mid);
            int leftN = mid - l + 1;
            int rightN=h-mid;
            //System.out.println(leftN+" "+rightN+"  "+arr.length);
            int[] left =new int[leftN];
            int[] right =new int[rightN];

            for(int i=0;i<(leftN);i++)
                left[i]=arr[l+i];
            for(int j=0;j<(rightN);j++)
                right[j]=arr[mid+1+j];


            /* Merge the temp arrays */

            // Initial indexes of first and second subarrays
            int i = 0, j = 0;

            // Initial index of merged subarray array
            int k = l;
            while(i<leftN && j<rightN){
               // System.out.println(leftN+" "+rightN+" "+k+" "+arr.length);
                if(left[i]<=right[j]){
                    arr[k]=left[i];
                    i++;
                }
                else{
                    arr[k]=right[j];
                    j++;
                }
                k++;
            }

            while(i<leftN){
                arr[k]=left[i];
                i++;
                k++;
            }
            while(j<rightN){
                arr[k]=right[j];
                j++;
                k++;
            }
            //int[] ans= new int[]

        }

    }
