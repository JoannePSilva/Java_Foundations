package parsing01;

public class Parsing01 {
    public static void main(String[] args) {
       
        String shirtPrice = "15";
        String taxRate = "0.05";
        String gibberish = "887ds7nds87dsfs";

        int valuShirt = Integer.parseInt(shirtPrice);
        double valueRate = Double.parseDouble(taxRate);

        double total = valuShirt * valueRate;
        System.out.println(total);
        System.out.println(gibberish);
        
    }
    
}
