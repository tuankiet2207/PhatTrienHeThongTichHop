import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.Remote;
import java.rmi.RemoteException;
public class Server {
    protected final static int port = 12;
    public static void main(String[] args) {
        try {
            Implement n = new Implement();
            LocateRegistry.createRegistry(port);
            Registry reg = LocateRegistry.getRegistry(port);
            reg.bind("", n);
            System.out.println("Tạo Server thành công");
         
        }
         catch (Exception e) {
            
        }
    }
}
