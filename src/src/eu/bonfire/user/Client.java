package eu.bonfire.user;

import eu.bonfire.Main;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

    private Main main;

    public Client(Main main) {
        this.main = main;
    }

    public void client(InetAddress server , int port) {
        System.out.println("Connexion to the server...\n");
        System.out.println("connexion faite fin du projet...");
//        InputStream in = socket.getInputStream();
//        OutputStream out = socket.getOutputStream();
        try
        {
            Socket socket = new Socket(server, port);

//            outputStream = socket.getOutputStream();
//            objectOutputStream = new ObjectOutputStream(outputStream);

//            String line = in.readLine();
//            while( line != null )
//            {
//                System.out.println( line );
//                line = in.readLine();
//            }

            // Close our streams
//            in.close();
//            out.close();
            socket.close();
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
    }
}