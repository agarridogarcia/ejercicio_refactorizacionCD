package refactorizacion1;

//public class Refactorizacion1 {
//public static void main(String[] args) {
//package numerosprimos;
/**
 *
 * @author
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    //Codificado por: sAfOrAs
    //LIstar los numeros según el numero de digitos indicado
    //Considero solo hasta numeros menores a 100000 (5 digitos), 
    //por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.
    public static boolean esPrimo = false;

    public static void main(String arg[]) {
        int numDigitos = 0;
        int nDigitos;
        Numeros digitos = new Numeros();
        numDigitos = digitos.pedirNumDigitos();
        
        
        //numDigitos=Integer.parseInt(arg[0]);

        //if (numDigitos <= 0) {
            //System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        
        for (int i = 1; i <= 99999; i++) {
     
            /*int divisionEntera = i;

            int contador = 0;

            while (divisionEntera != 0) {
                divisionEntera = divisionEntera / 10;
                contador++;
            }*/
           
            nDigitos=digitos.calculaDigitos(i);

            if (nDigitos == numDigitos) {
                if (i < 4) {
                    esPrimo = true;
                } else {
                    if (i % 2 == 0) {
                        esPrimo = false;
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int limite = (i - 1) / 2;
                        if (limite % 2 == 0) {
                            limite--;
                        }

                        while (i1 <= limite) {
                            if (i % i1 == 0) {
                                contador1++;
                            }
                            i1 += 2;
                            if (contador1 == 2) {
                                i1 = limite + 1;
                            }
                        }

                        if (contador1 == 1) {
                            esPrimo= true;
                        }
                    }
                }

                if (esPrimo == true) {
                    System.out.println(i);
                }
            }
        }
    }

}