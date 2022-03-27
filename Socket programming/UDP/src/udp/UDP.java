package udp;

import java.net.SocketException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UDP {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        try {
            if (input.equals("server")) {
                Server server = new Server();
            } else {
                Client client = new Client();
            }
        } catch (SocketException ex) {
            Logger.getLogger(UDP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
