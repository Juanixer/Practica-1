/*
Copyright [2022] [Juan García-Obregón]

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at:

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,2 software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions
and limitations under the License.
*/

package dominio;

public class Mates {

 /**
  * @author Juan García-Obregón
  * @version java 11
  *
  * @see a traves del metodo montecarlo se genera una aproximación a pi y se
  * crea un parametro que establecerá el número de puntos/lanzamientos generado.
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
