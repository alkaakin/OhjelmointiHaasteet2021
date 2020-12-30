public class tehtava4 {



    public static void main(String[] args) {
        System.out.print(nelio(3));
     }



     public static String nelio(int n) {

for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.print((char) ('a' + Math.min(n - j - 1, Math.min(n - i - 1, Math.min(i, j)))) + " ");
    }
    System.out.println();
}


     }

}