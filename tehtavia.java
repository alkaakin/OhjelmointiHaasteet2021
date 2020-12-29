
    import java.util.*;
public class tehtavia {
   
public static void main(String[] args) {
    
    //toistetaan stringiä neliön muodossa annetut rivit (SAIPPUAKAUPPIAS, 47x47)
    //kaksi laskuria, i= sananpituus, i2 = viimeinen rivi
    // i = 14 (SAIPPUAKAUPPIAS.length), i2 = 46 

    


int rivilaskuri = 0;
int merkkilaskuri = 0;
String [] Saippuakauppias = new String []{"S","A","I","P","P","U","A","K","A","U","P","P","I","A","S"};

while (true) {
if (merkkilaskuri + 14 > 47) {
int erotus = 47 - merkkilaskuri;
int i = 0;
    while(i<erotus) {
        System.out.print(Saippuakauppias[i]);
        i++;
    }

//Vaihda riviä
merkkilaskuri = 1;
System.out.println("");
//Jatka printtaamista




}
System.out.print("SAIPPUAKAUPPIAS");
merkkilaskuri += 14;
//System.out.print(Saippuakauppias[i]);
//i++;
}


}



}
