import java.io.*;
import java.net.*;

public class Exercise15_Client {
    public static void main(String[] args) {
        Socket socket = null;
        PrintWriter out = null;
        BufferedReader in = null;
        try {
            socket = new Socket("localhost", 8080);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
            String userInput;
            System.out.println("Enter text to send to the server:");
            while ((userInput = stdIn.readLine()) != null) {
                System.out.println(userInput);
                System.out.println("Message from server: " + in.readLine());
            }
        } catch (UnknownHostException e) {
            System.out.println("Don't know about host: localhost");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Couldn't get I/O for the connection to: localhost");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (out != null) out.close();
                if (in != null) in.close();
                if (socket != null) socket.close();
            } catch (IOException e) {
                System.out.println("Exception caught when trying to close resources");
                System.out.println(e.getMessage());
            }
        }
    }
}
