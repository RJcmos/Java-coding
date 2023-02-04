
public class SortAlgo {
    public static void main(String[] arg){
      int[] arr = {43,23,12,32,1,2};
        for (int j : arr) System.out.print(j + " ");
        sortingAlgo(arr,arr.length);
        System.out.println();
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int x = 7;
        lenear(arr1,x);
        int ans = binear(arr1,x,0,arr1.length-1);
        System.out.println(ans);
    }
    public static void lenear(int[] arr,int x){
        int ans =-1;
        for(int i=0;i<arr.length;i++){
             if(arr[i]==x){
                 ans= i;
                 break;
             }
         }
         System.out.println(ans);
    }
    public static int  binear(int[] arr,int x,int l, int r){

        if(r>=l){
           // System.out.println("hi");
        int mid = (l+(r-1))/2;
        if(arr[mid] ==x)
            return mid;

        if(arr[mid]>x)
           return binear(arr,x,l,mid-1);

            return binear(arr,x,mid+1,r) ;


        }
        return-1;
    }
    public static void sortingAlgo(int[] arr,int n){
        for(int i=1;i<n-1;i++){
//            int key = arr[i];
//            int j=i-1;
//            while (j>=0 && arr[j]>key){
//                arr[j+1]=arr[j];
//                j=j-1;
//            }
//            arr[j+1]=key;
            for(int j=0;j<n-1;j++){
               if(arr[j]>arr[j+1]){
                   int temp =arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]= temp;
               }
            }
        }
        for(int i=0;i<n;i++)
         System.out.print(arr[i]+" ");
    }
}
