import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
public class Client {
    public static void main(String[] args) {
        final int port = 12;
        Registry reg;
        try {
            reg = LocateRegistry.getRegistry(port);
            Interface s = (Interface) reg.lookup("");
            Scanner sc = new Scanner(System.in);
            String temps = "", temp1 = "Information Technology";
            while(!temps.equalsIgnoreCase("2")) {
                temps = s.Menu();
                System.out.println(s.Menu());
                temps = sc.nextLine();
                switch(temps) {
                    case "1": {
                        System.out.println(s.Dao(temp1));
                        break;
                    }
                    
                    case "2": {
                        System.out.println(s.Disconnect());
                        break;
                    }
                }
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
