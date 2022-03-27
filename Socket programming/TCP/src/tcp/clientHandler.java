/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class clientHandler extends Thread {
    
    private Socket newClient;
    
    clientHandler(Socket newClient) {
        this.newClient = newClient;
    }
    
    @Override
    public void run() {
        try {
            //Read data from the client via an InputStream obtained from the client socket.
            DataInputStream input = new DataInputStream(newClient.getInputStream());
            String msg = input.readUTF();
            System.out.println(msg);
            //Send data to the client via the client socket’s OutputStream.
            DataOutputStream output = new DataOutputStream(newClient.getOutputStream());
            output.writeUTF("Connected successfully");
            //Print any message from the user until he enters "exit"
            while (true) {
                msg = input.readUTF();
                if (msg.equals("exit")) {
                    break;
                }
                System.out.println("Server received " + msg);
            }
            newClient.close();
            input.close();
            output.close();
        } catch (IOException ex) {
            Logger.getLogger(clientHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
