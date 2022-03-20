package synchronization;
    public class Table {
    
    synchronized public void printTable(int n){
        for(int i=1;i<=5;i++){
            System.out.println(i*n);
        }
    }
    
}
    
