public class tehtava3 {


    private static Integer koskaLoppuu(int n) {
        
        int numero = 0;
        int laskuri = 0; 
            if (n == 0) {
                return null;
                        }
            if (n == 1) {
                return 0;
                    }
            
            while (true) {
                String pilkottava = String.valueOf(numero);
                String[] splitti = pilkottava.split("");
                for (int i = 0; i < splitti.length; i++) {
                if (splitti[i].equals("1")) {
                    laskuri++;
                        }
                    }

            if (laskuri == n) {
                return numero;
                
            }    
            else {
                numero++; 
            }
        }
        
    //return laskuri;
        }
        
        
    
    public static void main(String[] args) {
       System.out.print(koskaLoppuu(5));
    }
}