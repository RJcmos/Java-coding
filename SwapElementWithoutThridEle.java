public class SwapElementWithoutThridEle {
    public static void main(String[] arg){
        int a =101;
        int b =212;
        //swap begain
        a=a+b;//313=101+212
        b=a-b;//101 =313-212
        a=a-b;//212= 313-101
        System.out.println(a+" "+b);
        int[][] arr = new int[4][4];
        for(long i=1;i<=4;i++){
            for(long j=1;j<=4;j++){
                long col=0;
                if(i==1 || j==1)
                    col=filter(i,j);
                else{
                    long x=filter((i-1),j);
                    long y=filter(i,(j-1));
                    // System.out.println((i-1)+"^"+j);
                    //b=((i-1)^j);
                    System.out.println(x+"^"+y);
                    col=(x^y);
                }

                System.out.print(col+" ");
            }
            //ans+=a;
            System.out.println();
        }
    }
    public static long filter(long a,long b){
        long ans =0;
        if(a==1 && b>=1)
            ans=1;
        else if(b==1 && a>=1)
            ans= a;
         else{
             ans =(a^b);
         }
        return ans;
    }
}
