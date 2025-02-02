package org.example;
import com.google.gson.Gson;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class SimpleHTTPServer {
    public static void main(String[] args) throws IOException {
        final ServerSocket server = new ServerSocket(8080);
        System.out.println("Listening for connection on port 8080...");
        while(true){

//            Read all the request headers from browser client
//            final Socket client = server.accept();
//            InputStreamReader isr = new InputStreamReader(client.getInputStream());
//            BufferedReader reader = new BufferedReader(isr);
//            String line = reader.readLine();
//            while(!line.isEmpty()){
//                System.out.println(line);
//                line = reader.readLine();
//            }

            try(Socket socket = server.accept()){

//                Simple server with time as response;
//                Date today = new Date();
//                String res = "HTTP/1.1 200 OK\r\n\r\n" + today ;
//                socket.getOutputStream()
//                        .write(res.getBytes("UTF-8"));

              //Simple server with json parsing using gson library.
                Gson json = new Gson();
                String jsonResponse = json.toJson("{\"message\": \"Hello, client!\"}");
                OutputStream output = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(output, true);
                writer.println("HTTP/1.1 200 OK");
                writer.println("Content-Type: application/json");
                writer.println("Content-Length: " + jsonResponse.length());
                writer.println();
                writer.println(jsonResponse);
            }
        }
    }
}
