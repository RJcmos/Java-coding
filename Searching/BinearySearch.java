package Searching;

public class BinearySearch {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6,7};
        int n= a.length;
        int target= 7;
        System.out.print(search(a,target,0,n-1));
    }

    public static int search(int[] arr,int x,int l,int r){
        if(l>r)
            return -1;
        int mid = (l+r)/2;
        //System.out.println(mid+" "+arr[mid]);
        if(arr[mid]==x)
            return mid;

        if(x>arr[mid]){
            //  System.out.println((mid+1)+" "+r+" rigth" );
            return search(arr,x,mid+1,r);

        }
        else{
            // System.out.println(l+" "+(mid-1)+" left" );
            return search(arr,x,l,mid-1);

        }
    }
}
