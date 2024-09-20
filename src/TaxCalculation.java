public class TaxCalculation {
    public static void main(String[] args) {
        double productprice1 = 100;
        double productprice2= 200;
        final double TAX_RATE_HIGH = 0.15;
        final double TAX_RATE_LOW =  0.10;
        final int TAX_THRESHOLD = 50; //estoy cambiando los numeros magicos por constantes 

        double [] price = {productprice1, productprice2};
        double [] taxs = {TAX_RATE_HIGH, TAX_RATE_LOW};

        double totalTax = 0;
        
        for (int i=0; i < price.length; i++){

            totalTax += price[i] * taxs[i];
        }

        if (totalTax > TAX_THRESHOLD) {
            System.out.println("High total tax: " + totalTax);
        } else {
            System.out.println("Low tax");
        }

       
    }
}
