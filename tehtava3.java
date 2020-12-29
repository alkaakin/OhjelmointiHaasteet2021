import java.util.HashMap;

public class tehtava3 {


    public static void koskaLoppuu(int n) {
        
    //n = kuinka monta numeroa käytössä
    //jos n = 2; 1 --> 2 --> 3 --> 10 on viimeinen

    //for (int i = 0; i < n; i++) {

        HashMap<Integer, Integer> yllapito = new HashMap<>();

        int luku = 0;

        while (true) {


            if (!yllapito.containsKey(luku)) {
                yllapito.put(luku, 1);
            }
            else {
                int tarkistettava = yllapito.get(luku);
                if (tarkistettava+1==n) {
                    break;
                }
                else {
                yllapito.put(luku, tarkistettava+1);
                }
                
            }

            luku++;

        }

        System.out.print(luku);


        //Alla koodia, jolla digitit mahdollista erottaa

/* int number; // = and int
LinkedList<Integer> stack = new LinkedList<Integer>();
while (number > 0) {
    stack.push( number % 10 );
    number = number / 10;
}

while (!stack.isEmpty()) {
    print(stack.pop());
}
   */ 
    
    
        }
        
        
    
    public static void main(String[] args) {
       
    }
}