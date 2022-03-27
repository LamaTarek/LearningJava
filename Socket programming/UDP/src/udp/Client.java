package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {
    
    public Client() {
        try {
            DatagramSocket client = new DatagramSocket();
            //send request to server
            String msg = "Establish connection";
            byte[] buffer1 = msg.getBytes();
            InetAddress ip = InetAddress.getLocalHost();
            DatagramPacket request = new DatagramPacket(buffer1, buffer1.length, ip, 1500);
            client.send(request);

            //Receive reply from server
            byte[] buffer2 = new byte[1024];
            DatagramPacket reply = new DatagramPacket(buffer2, buffer2.length);
            client.receive(reply);
            msg = new String(reply.getData());
            System.out.println(msg);
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
