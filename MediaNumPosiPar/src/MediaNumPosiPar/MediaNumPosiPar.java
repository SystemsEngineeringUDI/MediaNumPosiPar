/* 
@autor:
 * Cesar Villalobos
 * Jhon Velasco
 * @frediv0406
 * Estudiante: Ing.Sistemas UDI

Programa que lee 10 numeros e imprime la media de los numeros que están en las posiciones pares del vector
*/
package ejemplo2;
import javax.swing.*;
public class MediaNumPosiPar {
    public static void main(String[] args) {
        int i,acup=0,x=0;
        int num[]=new int[10];//Se declara el vector
        for(i=0;i<10;i++){
            num[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));//Se llena el vector
            if ((i%2)==0){//Se saca el modulo de la posición
                acup+=num[i];//Se acumula el numero ubicado en la posicion
                x+=1;//Se acumula un contador
            }
        }
        acup/=x;//Se calcula la media
        JOptionPane.showMessageDialog(null, " La media de los números que estén en las posiciones pares es: "+acup);
        // TODO code application logic here
    }
    
}
