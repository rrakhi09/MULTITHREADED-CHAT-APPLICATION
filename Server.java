package server;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

   
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(5000);
        while(true)
        {
        Socket s=ss.accept();
        System.out.println("Connection Established...");
        PrintStream ps=new PrintStream(s.getOutputStream());
        ps.print("Hello from Codetech Intern");
        s.close();
        } 
    }
}
