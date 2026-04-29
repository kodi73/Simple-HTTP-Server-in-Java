import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleHTTPServer {
    public static void main(String[] args) throws Exception {
        // Create a server object that listens for incoming connections on port 8080.
        final ServerSocket server = new ServerSocket(8080);
        System.out.println("Listening for connection on port 8080...");

        // Infinite loop because we don't want the server to open and close.
        while (true) {
            // Create a Socket object which represents the connection and is used to read incoming HTTP request and send HTTP response.
            final Socket clientSocket = server.accept();
            
            // Read the incoming HTTP request
            InputStreamReader isr = new InputStreamReader(clientSocket.getInputStream());
            BufferedReader reader = new BufferedReader(isr);
            
            // Read the first line of the request
            String line = reader.readLine();
            // Print all the lines of the request
            while (!line.isEmpty()) {
                System.out.println(line);
                line = reader.readLine();
            }

        }
    }
}