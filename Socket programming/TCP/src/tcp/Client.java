package tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {

    public Client() {

        try {
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println("Client ip is " + ip);
            Socket clientSocket = new Socket(ip, 1500);
            //Send data to the server
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
            out.writeUTF("Establish connection");
            //Read data from the server via an InputStream
            DataInputStream in = new DataInputStream(clientSocket.getInputStream());
            System.out.println(in.readUTF());
            Scanner s = new Scanner(System.in);
            String msg;
            while (true) {
                msg = s.nextLine();
                out.writeUTF(msg);
                if (msg.equals("exit")) {
                    break;
                }
            }
            clientSocket.close();
            in.close();
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
