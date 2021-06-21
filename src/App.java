import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Account acc = new Account("Ignacio Cassi","40454481","nacho.cassi97@gmail.com","password");
        UberX uberx = new UberX("KXV178",acc,"Renault","Duster");
        uberx.setPassengers(4);
        uberx.printCarData();

    }
}
