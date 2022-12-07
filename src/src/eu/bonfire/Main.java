package eu.bonfire;

import eu.bonfire.inter.*;
import eu.bonfire.server.*;
import eu.bonfire.user.*;

import java.util.Objects;

public class Main {

    private static Main instance;

    private static Server server;

    private static Inter inter;

    private static Client client;

    public static void main(String[] args)
    {
        System.out.println("\nStarting program...\n");

        switch (args[0]) {
            case "Server":
                server = new Server(Main.instance);
                server.launchServer(Integer.parseInt(args[1]));
                break;
            case "Client":
                client = new Client(Main.instance);
                client.client(server.getIp(Integer.parseInt(args[1])), Integer.parseInt(args[1]));
                break;
        }

        inter = new Inter(Main.instance);
        inter.launchInter();
    }
}