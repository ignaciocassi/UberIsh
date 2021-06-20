import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car {

    int id;
    Map<String, Map<String,Integer>> typeCarAccepted;
    
    public UberVan(String license, Account driver) {
        super(license, driver);
    }

}
