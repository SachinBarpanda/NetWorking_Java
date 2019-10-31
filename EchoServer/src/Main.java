import java.io.IOException;
import java.net.ServerSocket;

public class Main {
    public static void main(String[] args) {

        try (ServerSocket socket = new ServerSocket(5000)) {
            while (true) {
                new Echoer(socket.accept()).start();
            }
        } catch (IOException e) {
            System.out.println("Server Exception : " + e.getMessage());
        }
    }
}
