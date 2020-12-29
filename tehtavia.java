
    import java.util.*;
public class tehtavia {

public static void main(String[] args) {


int rivilaskuri = 0;
int merkkilaskuri = 0;
String [] Saippuakauppias = new String []{"S","A","I","P","P","U","A","K","A","U","P","P","I","A","S"};


while (rivilaskuri<47) {
    int i = 0;
    if (merkkilaskuri + 15 > 47) {
    int erotus = 47 - merkkilaskuri;
  
    while(i<erotus) {
        System.out.print(Saippuakauppias[i]);
        i++;
    }

    System.out.println();
    rivilaskuri++;
    merkkilaskuri = 0;

    while (i<Saippuakauppias.length) {
        System.out.print(Saippuakauppias[i]);
        merkkilaskuri++;
        i++;
    }
    }

else {
    System.out.print("SAIPPUAKAUPPIAS");
    merkkilaskuri += 15;
    }

    i = 0;
}

}

}
