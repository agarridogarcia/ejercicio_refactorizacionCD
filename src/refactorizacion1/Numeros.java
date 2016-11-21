
package refactorizacion1;

import javax.swing.JOptionPane;


public class Numeros {
    public static int pedirNumDigitos(){
        int numDigitos=0;
        while (numDigitos<=0 || numDigitos>5){
        numDigitos=Integer.parseInt(JOptionPane.showInputDialog("Introduce numeros enteros"));
        
    }
    return numDigitos;
    }
    public static int calculaDigitos(int numero){
        int divisionEntera = numero;
        int contador = 0;

            while (divisionEntera != 0) {
                divisionEntera = divisionEntera / 10;
                contador++;}
            return contador;
    }
        
}


