package eu.bonfire.user;

import eu.bonfire.Main;

public class Client {

    private Main main;

    public Client(Main main) {
        this.main = main;
    }

    public void connect() {
        System.out.println("Connexion to the server...\n");
    }
}
