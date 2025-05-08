import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    public static void main(String[] args) {
        try {
            // Connect to the embedded registry on port 2000
            Registry registry = LocateRegistry.getRegistry("localhost", 2000);

            Hello stub = (Hello) registry.lookup("HelloService");

            String response = stub.sayHello();
            System.out.println("Response from Server: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
