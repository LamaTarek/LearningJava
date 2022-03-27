
package task3.pkg4;


public class Task34 {

   
    public static void main(String[] args) {
        Add thread1 = new Add();
        Sub thread2 = new Sub();
        Mul thread3 = new Mul();
        thread1.start();
        thread2.start();
        thread3.start();
    }
    
}
