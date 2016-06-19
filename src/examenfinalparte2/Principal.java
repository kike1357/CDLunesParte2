
package examenfinalparte2;
/**
 * Programa que mostrara por pantalla todos los numeros primos que cumplan con los requisitos.
 * Tendremos que introducir un numero mayor a 0 
 * Y este por pantalla nos muestra los numeros primos con los numeros de digitos que indicamos.
 + */
public class Principal {

    public static boolean p = false;
    
    public static void main(String arg[])
            
        {
            
        int digitos=2;
        int numeroDigitos=0;
        /**
        * Condicion que se le asigna al bucle, para ingresar un valor mayor a cero 
        */
        if(digitos<=0)
        System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        /**
        * Tenemos un bucle for que recorre la variable i mientras esta sea menor o igual a 99999.
        * Cada vez que se recorra una vuelta esta sumara al contador.
        */
        for(int i = 1; i <= 99999; i++ )
        {
            
            int contador = calcular(i);
        numeroDigitos=contador;
            
            
            comparar(numeroDigitos, digitos, i);
        }
        }
    /**
    *
    *
    * compara el numero introducido con el numero de digitos
    * si es igual a true se visualiza si es false no visualiza nada
    * @param numeroDigitos numero de digitos que se asignan
    * @param digitos numero introducido por el usuario
    * @param i coloca el metodo en el bucle
    */
    public static void comparar(int numeroDigitos, int digitos, int i) {
        if(numeroDigitos==digitos){
            if (i < 4) p = true;
            else
            {
                if (i % 2 == 0) p = false; 
                else
                {
                    int contador1 = 0;
                    int i1 = 1;
                    int k = (i - 1) / 2;
                    if  (k % 2 == 0) k--;
                    
                    while(i1 <= k)
                    {
                        if (i % i1 == 0) contador1++;
                        i1 += 2;
                        if (contador1 == 2) i1 = k + 1;
                    }
                    
                    if (contador1 == 1) p = true;
                }    
            }
            
            if (p == true)
                System.out.println(i);
        }
    }
    /** 
    * @param i coloca el metodo en el bucle
    * @return devuelta el numero de vueltas y estan aumentan y el contador recoge el numero de digitos
    */
    public static int calcular(int i) {
        int aux = i;
        int contador=0;
        while (aux != 0)
        {
            aux = aux / 10;
            contador++;
        }
        return contador;
    }
 
       
 
    
}
