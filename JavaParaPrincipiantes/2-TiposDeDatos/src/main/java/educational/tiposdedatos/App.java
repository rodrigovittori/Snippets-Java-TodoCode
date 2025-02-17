package educational.tiposdedatos;

/** Actividad práctica del curso "Java para Principiantes" de TODO CODE ACADEMY
 * 
 * Clase Nº 2 - "Tipos de Datos en Java"
 * 
 * Link video: https://www.youtube.com/watch?v=l2mLP7P3jx4
 * 
 * ----------------------------------------------------------------------------
 * 
 * @author rodrigovittori // github.com/rodrigovittori
 */

public class App {

    public static void main(String[] args)
    {
        int miEntero = 7;
        String miCadena = "Ejemplo Lorem Ipsum";
        char letra = 'R';
        double temperaturaEnCelsius = 41.4; // Nº con parte decimal
        boolean isDead = false;
        long poblacionMundialActual = 8057236243L; // 17-FEB-25'
        
        // Extrañamente se omitieron algunos... comencemos con float
        float numeroFlotante = Float.POSITIVE_INFINITY; // +∞
        
        // Se vale revisar la doc en caso de no recordar cosas:
        // docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
        
        // Veamos byte (que toma un valor int acotado a 8 bits)
        
        byte minByte = Byte.MIN_VALUE;
        
        // Queda short que ocupa 2 bytes yendo de -32768 a 32767
        // Nota: revisar modificadores (un)/signed
        short edad = 29; // Se acercan los 30...
    }
}