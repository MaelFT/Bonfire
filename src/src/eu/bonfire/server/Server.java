package eu.bonfire.server;

import eu.bonfire.Main;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private Main main;

    public Server(Main main) {
        this.main = main;
    }

    /**
     *
     * @param port
     */
    public void launchServer(int port) {
        if (checkPort(port)) {
            System.out.println("Port is not available...");
            System.exit(1);
        }
        System.out.println("Starting server...\n");
        System.out.println("Port: " + port);
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            new Thread("Server") {
                public void run() {
                    try {
                        Socket socket;
                        while ((socket = serverSocket.accept()) != null) {
                            System.out.println("Socket: " + socket.toString());
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param port
     * @return boolean
     */
    public boolean checkPort(int port) {
        Socket s = null;
        try {
            s = new Socket("localhost", port);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    /**
     *
     * @param port
     * @return InetAddress
     */
    public InetAddress getIp(int port) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(port);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assert serverSocket != null;
        return serverSocket.getInetAddress();
    }
}
