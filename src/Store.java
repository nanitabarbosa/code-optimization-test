public class Store {

    public static void main(String[] args) {
        final int RICE = 15;
        final int COFFEE = 10;
        final int MEAT = 5; //Se esta cambiando los numeros magicos, por constantes
        int [] price = {RICE, COFFEE, MEAT};

        final int AMOUNT_RICE= 2;
        final int AMOUNT_COFFEE= 3;
        final int AMOUNT_MEAT= 4; //se esta cambiando los numero magicos, por constantes
        int [] products = {AMOUNT_RICE, AMOUNT_COFFEE, AMOUNT_MEAT};
        
        final int SALES = 50;
        int totalSales=0; //se inicializo un sumador en 0
        

        for (int i=0; i < products.length; i++){ //se inicializo un for para correr los precios y los productos en posicion i, 
            //y que su muktiplicacion ve vaya sumando en la variable totalSales

            totalSales += price[i] * products[i];
        }

        if (totalSales > SALES) { //Si suma que recolecto totalSales
            //es mayor a 50 se imprime el primer mensaje, y si no lo es, se imprime el segundo
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low s performance");
        }
    }
}
