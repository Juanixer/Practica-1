package dominio;
import java.util.Scanner ;

public class Mates {

 /**
  * @author Juan García-Obregón
  * @version java 11
  *
  * @see a traves del metodo montecarlo se genera una aproximación a pi y se
  * crea un parametro que establecerá el numero de puntos/lanzamientos generado.
  */

 public static double generarPi(int lanzos){


  double  c = 0;
  for(int i = 0; i <= lanzos ; i++){
   double x = Math.random();
   double y = Math.random();
   if ( Math.sqrt((x*x) + (y*y)) <= 1){
    c++;
   }
  }
   double pi = 4 * (c / lanzos );
   return pi;
 }

}
