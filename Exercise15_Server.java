import java.io.*;
import java.net.*;

public class Exercise15_Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        PrintWriter out = null;
        BufferedReader in = null;

        try {
            serverSocket = new ServerSocket(8080);
            System.out.println("Server started. Waiting for a client...");
            clientSocket = serverSocket.accept();
            System.out.println("Client connected.");
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println("Received from client: " + inputLine);
                System.out.println("Echo: " + inputLine);
            }
        } catch (IOException e) {
            System.out.println("Exception caught when trying to listen on port 8080 or listening for a connection");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (out != null) out.close();
                if (in != null) in.close();
                if (clientSocket != null) clientSocket.close();
                if (serverSocket != null) serverSocket.close();
            } catch (IOException e) {
                System.out.println("Exception caught when trying to close resources");
                System.out.println(e.getMessage());
            }
        }
    }
}
