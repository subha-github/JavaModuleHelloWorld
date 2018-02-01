package greetings.client;

import greetings.lib.Greetings;

public class Main {
    public static void main (String arg[]) {

        Greetings greetings = new Greetings();
        System.out.println(greetings.hello());

    }
}
