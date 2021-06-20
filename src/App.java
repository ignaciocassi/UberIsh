import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el nombre del conductor: ");
        String drName=sc.nextLine();

        System.out.println("Ingrese el documento del conductor: ");
        String drDocument=sc.nextLine();

        System.out.println("Ingrese la licencia del conductor: ");
        String carLicense=sc.nextLine();
        
        Account driver=new Account(drName,drDocument);
        Car car = new Car(carLicense,driver);

        car.passengers=4;

        System.out.println("Ingrese el nombre del conductor: ");
        String drName2=sc.nextLine();

        System.out.println("Ingrese el documento del conductor: ");
        String drDocument2=sc.nextLine();

        System.out.println("Ingrese la licencia del conductor: ");
        String carLicense2=sc.nextLine();
        sc.close();
        
        Account driver2=new Account(drName2,drDocument2);
        Car car2 = new Car(carLicense2,driver2);

        car2.passengers=5;

        car.printCarData();
        car2.printCarData();
    }
}
