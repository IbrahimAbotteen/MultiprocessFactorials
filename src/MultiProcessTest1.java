import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MultiProcessTest1 {

    @Test
    void run() {
        Date start1=new Date();
        long startTime1=start1.getTime();
        //System.out.println(startTime1);
        MultiProcess p11=new MultiProcess(5,1);
        MultiProcess p12=new MultiProcess(5,2);
        MultiProcess p13=new MultiProcess(5,3);
        p11.start();
        try {
            p11.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        p12.start();
        try {
            p12.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        p13.start();

        try {
            p13.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Date end1=new Date();
        long exec1=end1.getTime()-startTime1;
       //System.out.println(end1.getTime());
        System.out.println("The execution time for this thread is: "+exec1+" ms");

        System.out.println("\n");
        Date start2=new Date();
        //System.out.println(start2.getTime());
        long startTime2=start2.getTime();
        MultiProcess p21=new MultiProcess(15,1);
        MultiProcess p22=new MultiProcess(15,2);
        MultiProcess p23=new MultiProcess(15,3);
        p21.start();
        try {
            p21.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        p22.start();
        try {
            p22.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        p23.start();
        try {
            p23.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Date end2=new Date();
        //System.out.println(end2.getTime());
        long exec2=end2.getTime()-startTime2;
        System.out.println("The execution time for this thread is: "+exec2+" ms");

        System.out.println("\n");
        Date start3=new Date();
        long startTime3=start3.getTime();
        MultiProcess p31=new MultiProcess(19,1);
        MultiProcess p32=new MultiProcess(19,2);
        MultiProcess p33=new MultiProcess(19,3);
        p31.start();
        try {
            p31.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        p32.start();
        try {
            p32.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        p33.start();
        try {
            p33.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Date end3=new Date();
        long exec3=end3.getTime()-startTime3;
        System.out.println("The execution time for this thread is: "+exec3 +" ms");

        System.out.println("\n");
        MultiProcess p41=new MultiProcess(10,1);
        MultiProcess p42=new MultiProcess(10,2);
        MultiProcess p43=new MultiProcess(10,3);
        p41.start();
        try {
            p41.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        p42.start();
        try {
            p42.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        p43.start();

        try {
            p43.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n");
        MultiProcess p51=new MultiProcess(17,1);
        MultiProcess p52=new MultiProcess(17,2);
        MultiProcess p53=new MultiProcess(17,3);
        p51.start();
        try {
            p51.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        p52.start();
        try {
            p52.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        p53.start();

        try {
            p53.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n");
         Date end=new Date();
         long endTime=end.getTime();
         long execTime=endTime-startTime1;
         System.out.println("The whole program execution time is: "+execTime+" ms");
    }

}