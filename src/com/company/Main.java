package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while(true)  {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Type no. port to check:");
            int port = scanner.nextInt();
            Portx portx = new Portx();
            portx.setPort(port);
            CheckPort checkPort = new CheckPort();
            checkPort.openPort(portx.getPort());
        }
    }
}
