import java.rmi.Remote;
import java.rmi.RemoteException;
import java.io.IOException;

public interface Interface extends Remote {
                    public String Menu() throws RemoteException;
                   
                    public String Dao(String s) throws RemoteException;
                    public String Disconnect() throws RemoteException, IOException;
}
