public class aybabtu {


        
            public static void taytto(String s, int n) {
                //tehdään erillinen taulukko, jossa oikea määrä 
                char[][] twoD = new char[n][n];
                int m = s.length();
                int k = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        twoD[i][j]=(s.charAt(k%m));
                        k++;
                    }
                }
                    for (int r = 0; r < n; r++) {
                        for (int p = 0; p < n; p++) {
                            System.out.print(twoD[p][r]);
                        }
                        System.out.println();
                    }
                }
            
            public static void main(String[] args) {
                //taytto("TESTI", 3);
                //taytto("AYBABTU", 6);
                taytto("SAIPPUAKAUPPIAS", 47);
            }
        }
        



