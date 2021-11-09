package com.company;


import java.net.InetSocketAddress;
import java.net.Socket;

public class CheckPort {

    public void openPort(int port) {

            try {
                Socket socket = new Socket();
                socket.connect(new InetSocketAddress("localhost", port), 1000);
                socket.close();
                System.out.println("Port " + port + " is open");
            } catch (Exception ex) {
                System.out.println("Port " + port + " isn't open!");
            }





    }
}