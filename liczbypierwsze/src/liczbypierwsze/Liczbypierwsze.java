/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liczbypierwsze;

/**
 *
 * @author Filip
 */
public class Liczbypierwsze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        int podzielnosc;
        
        for (int i=1;i<=1000000;i++) {
            
            podzielnosc = 0;
            
            for (int x=2;x<=i/2;x++) {
                if(i%x == 0){
                    
                    podzielnosc++;
                    x=i;   
                    
                }
            }
            
            if (podzielnosc == 0){
                System.out.println("Liczba pierwsza: "+i);
            }
        }
    }  
}
