/*16.	WAP to create TCP/IP Socket on both client and server side . and after socket creation perform the Operation
 as done in chat server . */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        try {
            new client();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class client {
    static Socket s;

    client() throws Exception {
        s = new Socket("localhost", 1080);
        System.out.println("Connected to the server");
        new clientinp().start();
        new clientout().start();
    }
}

class clientinp extends Thread {
    public void run() {
        try {
            DataInputStream d = new DataInputStream(client.s.getInputStream());
            while (true) {
                String ipfs = d.readUTF();
                if (ipfs == null) {
                    continue;
                }
                System.out.println("Server> " + ipfs);
                if (ipfs.equals("bye")) {
                    break;
                }
            }
            System.out.println("Connection closed");
            client.s.close();
            System.exit(0);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

class clientout extends Thread {
    public void run() {
        try {
            DataOutputStream d = new DataOutputStream(client.s.getOutputStream());
            Scanner sc = new Scanner(System.in);
            String msgfc;
            while (true) {
                msgfc = sc.next();
                d.writeUTF(msgfc);
                if (msgfc.equals("bye")) {
                    break;
                }
            }
            System.out.println("Connection closed");
            client.s.close();
            sc.close();
            System.exit(0);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


/*server-->
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Q16s {
    public static void main(String[] args) {
        try {
            new server();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

class server {
    static Socket s;
    static ServerSocket ss;

    server() throws Exception {
        ss = new ServerSocket(1080);
        System.out.println("Waiting for the client");
        s = ss.accept();
        System.out.println("Connected to the client");
        new serverinp().start();
        new serverout().start();
    }
}

class serverinp extends Thread {
    public void run() {
        try {
            DataInputStream d = new DataInputStream(server.s.getInputStream());
            while (true) {
                String ipfc = d.readUTF();
                if (ipfc == null) {
                    continue;
                }

                System.out.println("Client> " + ipfc);
                if (ipfc.equals("bye")) {
                    break;
                }
            }
            System.out.println("Connection closed");
            server.s.close();
            System.exit(0);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class serverout extends Thread {
    public void run() {
        try {
            DataOutputStream d = new DataOutputStream(server.s.getOutputStream());
            Scanner sc = new Scanner(System.in);
            String msgfs;
            while (true) {
                msgfs = sc.next();
                d.writeUTF(msgfs);

                if (msgfs.equals("bye")) {
                    break;
                }
            }
            System.out.println("Connection closed");
            server.s.close();
            System.exit(0);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

*/