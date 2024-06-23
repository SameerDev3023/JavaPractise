public class Arrays {
    
    public static void main(String args[]){

        // NOTE  :- Arrays indexing always starts with zero..
        /*                        0      1      2        3        4          5          6 */
        String[]  CarsBrands = {"BMW","AUDI","VOLVO","JAGUAR","MARCEDES","PORSCHE","ROLLS ROYS"};
        // Access Array elements ;

        System.out.println(CarsBrands[0]); // output BMW

        // Access Array of elements through the loops

        // -=-=-=-=-=-=-=--=-=-= First For Loop -=--=-=-=-=-=-=-=-=-=-=-=-=-=;
        System.out.println("-=-=-=-=-=-=-=-=-=-FOR LOOP-=-=-=-=-=-=-=--=-=-");
        for (int i = 0;i<CarsBrands.length;i++){
            System.out.println(CarsBrands[i]);  // Print all cars name..
        }

        //-=-=-=-=-=-=-=-=-=-=-=-=-=-- For Each Loop -=-=-=-=--=-=-=-=--=-=-=-=--=-

        System.out.println("-=-=-=-=-=-=-=--=-=FOREACH LOOP-=-=-=--=-=--=");
        for(String CarsName : CarsBrands){

           
            System.out.println(CarsName);

        }
    }
}
