/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logika;

/**
 *
 * @author Laura
 */
public class Exit {
    //c�lszer�bb lenne clear-nek h�vni
    //Legyen singleton
    //Ne sz�rmazzon bel�le semmi
     public void exit() {
        for (int i = 0; i < 20; i++) {
            System.out.println();
        }
    }
    
}
