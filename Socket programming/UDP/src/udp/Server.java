package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {

    public Server() throws SocketException {
        //Create server socket
        DatagramSocket server = new DatagramSocket(1500);

        try {
            //Receive data from the client 
            byte[] buffer1 = new byte[1024];
            DatagramPacket request = new DatagramPacket(buffer1, buffer1.length);
            server.receive(request);
            String msg = new String(request.getData(), 0, request.getLength());
            System.out.println(msg);

            //Send data to the client 
            int port = request.getPort();
            InetAddress ip = request.getAddress();
            msg = "Connected successfully";
            byte[] buffer2 = msg.getBytes();
            DatagramPacket reply = new DatagramPacket(buffer2, buffer2.length, ip, port);
            server.send(reply);
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
