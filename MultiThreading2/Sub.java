
package task3.pkg4;


public class Sub extends Thread {
    String name = "Sub";
    int sub=100;
    @Override
    public void run(){
        for(int i=1;i<=10;i++){
            sub-=i;
            System.out.println("Thread "+name+", iteration: "+i+", value= "+sub);
        }
        System.out.println("Thread "+name+", Sum= "+sub);
    }
}
