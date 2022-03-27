
package task3.pkg4;


public class Mul extends Thread{
    String name = "Mul";
    int mul=1;
    @Override
    public void run(){
        for(int i=1;i<=10;i++){
            mul*=i;
            System.out.println("Thread "+name+", iteration: "+i+", value= "+mul);
        }
        System.out.println("Thread "+name+", Sum= "+mul);
    }
}
