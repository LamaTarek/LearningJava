package tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {

    public Server() {
        try {
            //Create a server socket and bind it to a specific port number
            int port = 1500;
            ServerSocket welcomeSocket = new ServerSocket(1500);
            System.out.println("Server is listening on port " + port);
            Socket connectionSocket;
            while (true) {
                //Listen for a connection from the client and accept it. 
                connectionSocket = welcomeSocket.accept();
                //Create thread to handel each client
                new clientHandler(connectionSocket).start();
            }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
