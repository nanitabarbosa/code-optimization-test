public class TaxCalculation {
    public static void main(String[] args) {
        double productPrice1 = 100;
        double productPrice2 = 200;
        final double TAX_RATE_HIGH = productPrice1 * 0.15;
        final double TAX_RATE_LOW = productPrice2 * 0.10;
        final int TAX_THRESHOLD = 50; //estoy cambiando los numeros magicos por constantes 

        double totalTax = TAX_RATE_HIGH + TAX_RATE_LOW;

        int[][] taxes = new int[2][2];
        
        for (int i=0; i < 10; i++){

            if (totalTax > TAX_THRESHOLD) {
                System.out.println("High total tax: " + totalTax);
            } else {
                System.out.println("Low tax");
            }
        }
        productPrice1
        
       
    }
}
