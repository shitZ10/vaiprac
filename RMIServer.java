import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {
    public static void main(String[] args) {
        try {
            // Start the embedded registry on port 2000 (to avoid 1099 conflict)
            Registry registry = LocateRegistry.createRegistry(2000);

            HelloImpl obj = new HelloImpl();
            registry.rebind("HelloService", obj);

            System.out.println("Embedded RMI Server is ready on port 2000.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
