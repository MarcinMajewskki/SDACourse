package org.example.NetworkExercises.SocketWhoIS;

import java.io.*;
import java.net.Socket;

public class SocketWhoIsExample {
    public static void main(String[] args) throws IOException {
    Socket socket = new Socket("whois.internic.net",43);
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream(),true);
        printWriter.println("facebook.com");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
    }
}
