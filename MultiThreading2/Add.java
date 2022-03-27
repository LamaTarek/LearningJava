
package task3.pkg4;


public class Add extends Thread{
    String name = "Add";
    int sum=0;
    @Override
    public void run(){
        for(int i=1;i<=10;i++){
            sum+=i;
            System.out.println("Thread "+name+", iteration: "+i+", value= "+sum);
        }
        System.out.println("Thread "+name+", Sum= "+sum);
    }
}
