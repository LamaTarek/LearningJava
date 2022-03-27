package multithreading;
public class MultiThreading {

    
    public static void main(String[] args) {
        print1 p1=new print1();
        print2 p2=new print2();
        Thread t1=new Thread(p1);
        Thread t2=new Thread(p2);
        t1.start();
        t2.start();
    }
    
}
