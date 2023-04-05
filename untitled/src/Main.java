import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> countryCapitalCatalog = new ArrayList<>(20);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputCountry;
        String inputCapital;
        String inputProgramOption = null;
        boolean flag = true;

        countryCapitalCatalog.add("Ukraine");
        countryCapitalCatalog.add("Kyiv");
        countryCapitalCatalog.add("Spain");
        countryCapitalCatalog.add("Madrid");
        countryCapitalCatalog.add("Germany");
        countryCapitalCatalog.add("Berlin");
        countryCapitalCatalog.add("Shri Lanka");
        countryCapitalCatalog.add("Colombo");
        countryCapitalCatalog.add("Australia");
        countryCapitalCatalog.add("Canberra");

        while (flag)
        {
            System.out.println("Enter the option of program");
            System.out.println("Option '0'  - exit the program");
            System.out.println("Option '1'  - search the item");
            System.out.println("Option '2'  - insert new record");
            System.out.println("Option '3'  - delete item");
            System.out.println("Option '4'  - review the map");
            inputProgramOption = br.readLine();
            switch (inputProgramOption){

                case "0":
                    flag = false;
                    break;
                case "1":
                    System.out.println("To search the item enter the name of country: ");
                    inputCountry = br.readLine();
                    if(countryCapitalCatalog.contains(inputCountry)) {
                        int j = countryCapitalCatalog.indexOf(inputCountry) + 1;
                        System.out.println("Searched item " + inputCountry + " " + countryCapitalCatalog.get(j));
                    }
                    else
                        System.out.println("Sorry,but we do not have such item");
                    break;
                case "2":
                    System.out.println("Enter the name of country you want to insert: ");
                    inputCountry = br.readLine();
                    countryCapitalCatalog.add(inputCountry);
                    System.out.println("Enter the name of capital you want to insert: ");
                    inputCountry = br.readLine();
                    countryCapitalCatalog.add(inputCountry);
                    break;
                case "3":
                    System.out.println("In order to delete an item you need to enter the country");
                    inputCountry = br.readLine();
                    if (countryCapitalCatalog.contains(inputCountry)) {
                        int j = countryCapitalCatalog.indexOf(inputCountry);
                        System.out.println("Item " + inputCountry + " " + countryCapitalCatalog.get(j + 1) + " was removed");
                        countryCapitalCatalog.remove(j);
                        countryCapitalCatalog.remove(j);
                    }
                    else
                        System.out.println("Sorry,but we do not have such item");
                    break;
                case "4":
                    for(int i = 0;i < countryCapitalCatalog.size();i++)
                        if(i % 2 ==0)
                            System.out.print("Item: " + countryCapitalCatalog.get(i) + " ");
                        else
                            System.out.println(countryCapitalCatalog.get(i));
                    break;
                default:
                    System.out.println("There is no such option");
                    break;
            }
        }
    }
}