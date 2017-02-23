/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deserto.pos;

import static java.lang.Math.random;

/**
 *
 * @author FSEVERI\bollettin3412
 */
public class posizione {
    private int x;
    private int y;
    
    /**
     * Costruttore
     */
    public posizione (){
        x=(int) Math.random()*10;
        y=(int) Math.random()*10;
    }
    
    /**
     * Metofo getter di x
     * @return Il valore di x
     */
    public int getX() {
        return x;
    }
    /**
     * Getter di y
     * @return Il valore di y
     */
    public int getY() {
        return y;
    }
    /**
     * Metodo equals della classe
     * @param obj Oggetto da confrontare
     * @return True se sono uguali, false altrimenti
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final posizione other = (posizione) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }
    
}
