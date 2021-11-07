import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.Remote;  
public class Implement extends UnicastRemoteObject implements Interface {

    protected Implement() throws RemoteException {super();
    }

    public String Menu() {

        return "\n1. Đảo chuỗi \n 2. Ngắt kết nối";
    }

    //Hàm đảo chuỗi
    public String Dao(String s) {
        String tempS = new StringBuffer(s).reverse().toString();
        return tempS.toUpperCase();
    }
    //Ngắt kết nối
    public String Disconnect () throws IOException {
        return "Đã ngắt kết nối!";
    }

    
}
