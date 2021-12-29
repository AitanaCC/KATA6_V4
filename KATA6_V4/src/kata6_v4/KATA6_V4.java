package kata6_v4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproduct.Toy;
import toyproduct.models.CarToy;
import toyproduct.models.HelicopterToy;
import toys.SerialNumberGenerator;
import toys.ToyBusiness;

public class KATA6_V4{

    public static void main(String[] args) {
        
        ToyBusiness business = new ToyBusiness();
        ArrayList<Toy> toys =  new ArrayList<>();
        
        Scanner in =  new Scanner(System.in);
        String line =  "";
        while(!line.equals("exit")){
            line =  in.nextLine();
            
            switch (line) {
                case "car":
                case "helicopter":
                    toys.add(business.createToy(line));
                    System.out.println(
                            "Built toys: "+toys.stream()
                                    .map(c -> c.toString())
                                    .collect(Collectors.joining(", ")));
                    break;
                
                case "exit":
                    System.out.println("Exiting...");
                    break;
                    
                default:
                    System.out.println("Command unknown!");
                
            }
        }
    }
    
}
