import  java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] arg){
        Scanner in  = new Scanner(System.in);
        int n= in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(in.nextInt());
        }
        System.out.println(getSecondLargest(arr,arr.size()));
    }
    static int getSecondLargest(ArrayList<Integer> arr,int n){
        // remove duplicat
        ArrayList<Integer> arr1 = new ArrayList<>();
        int max= 0;
        //for(int i=0;i<arr.size();i++){
        int i=0;
        while(i<arr.size()){
            for(int j=i;j<arr.size()-1;j++){
                if(arr.get(i)==arr.get(j+1)){
                    //System.out.println(j+" "+arr.get(j));
                    arr.remove(j+1);
                }
            }
            System.out.println(arr);
           i++;
        }
       // System.out.println(arr);
        int Secondmax=0;
        for(int x=0 ; x<arr.size();x++){
             int m= arr.get(x);
            if(m>=max ){
                Secondmax =max;
                max=m;
            }
        }

        return Secondmax;
    }
}
