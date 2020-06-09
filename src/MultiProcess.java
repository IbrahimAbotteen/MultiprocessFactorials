public class MultiProcess extends Thread {

    public long n;
    public int myThread;
    public static long val1,val2;

    public MultiProcess(long x,int fac) {
        this.n = x;
        this.myThread=fac;

    }
        public static long subfac1(long n,int th){
            long v1=n/2;

            for (long i=n/2;i>1;i--){
              v1=v1*(i-1);
            }
            return v1;
        }
        public static long subfac2(long n,int th){
            long v2=n/2+1;
            for (long j=n/2+1;j<n;j++){
                v2=v2*(j+1);

            }
            return v2;
        }

    public static long subFac(long n,int th){

        long v1=n/2;
        long v2=n/2+1;
        long result;
        if (th==1){
            for (long i=n/2;i>1;i--){
                result=v1*(i-1);
            }
            return v1;
        }
        else if(th==2){

            for (long j=(n/2)+1;j<n;j++){
                v2=v2*(j+1);

            }
            v2=v2;
            return v2;
        }
        else {
         return v1*v2;
        }
    }

    @Override
    public void run() {
        if (n<=1){
            if (myThread==3){
                System.out.println("The Factorial of "+n+" is: "+n);
            }

        }
        else{
            if (myThread==1){
                val1=subfac1(n,myThread);
                System.out.println("The first thread result of "+n+" is :"+val1);
            }
            else if (myThread==2){
                val2=subfac2(n,myThread);
                System.out.println("The second thread result of "+n+" is :"+val2);
            }
            else
                System.out.println("The Factorial of "+n+" is: "+val1*val2);

        }

    }

}




