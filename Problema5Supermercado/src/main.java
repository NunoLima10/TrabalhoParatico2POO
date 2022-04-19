import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        ArrayList<String> customerNames;
        ArrayList<String> customerPurchasesString;
        ArrayList<Double> customerPurchases;

        String pathPurchases = "Problema5Supermercado/src/purchases.txt";
        String pathNames = "Problema5Supermercado/src/customers.txt";

        customerNames = readFile(pathNames);

        customerPurchasesString = readFile(pathPurchases);
        customerPurchases = convertToDoubleArray(customerPurchasesString);

        if (customerNames.size() == customerPurchases.size()) {
            String bestCustomerName = nameOfBestCustomer(customerNames, customerPurchases);
            System.out.println("O nome do melhor clinete é " + bestCustomerName);
        }

    }

    public static ArrayList<String> readFile(String path){
        ArrayList<String> lines = new ArrayList<>();
        try {
            File file = new File(path);
            Scanner reader = new Scanner(file);

            while (reader.hasNext()){
                lines.add(reader.nextLine());
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return lines;
    }

    public static ArrayList<Double> convertToDoubleArray(ArrayList<String> arrayList){
        ArrayList<Double> values = new ArrayList<>();

        for (String text : arrayList) {
            double value = Double.parseDouble(text);
            values.add(value);
        }
        return  values;
    }

    public static  String nameOfBestCustomer(ArrayList<String>  customerNames, ArrayList<Double> customerPurchases){
        int bestCustomerIndex = 0;
        for (int i = 0; i < customerPurchases.size(); i++) {
            double purchase = customerPurchases.get(i);
            double bestCPurchase = customerPurchases.get(bestCustomerIndex);

            if (purchase > bestCPurchase) {bestCustomerIndex = i;}
        }
        return customerNames.get(bestCustomerIndex) ;//+ " comprou o equivalnte a " +  customerPurchases.get(bestCustomerIndex);
    }
}
