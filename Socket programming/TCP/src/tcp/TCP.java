package tcp;

import java.util.Scanner;

public class TCP {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        if (input.equals("server")) {
            Server server = new Server();
        } else {
            Client client1 = new Client();
            Client client2 = new Client();
        }

    }

}
