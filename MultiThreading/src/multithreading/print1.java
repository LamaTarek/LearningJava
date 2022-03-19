/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

/**
 *
 * @author user
 */
public class print1 implements Runnable {
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("1");
        }
    }
}
