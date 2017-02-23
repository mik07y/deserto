/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deserto.carri;

import deserto.pos.Pezzo;
import deserto.pos.Posizione;
import java.util.ArrayList;
/**
 *
 * @author FSEVERI\bollettin3412
 */
public abstract class CarroCantiere {
    private int npezzi;
    private Posizione pos;
    private ArrayList<Pezzo> carro;
    
    public CarroCantiere (Posizione pos, int npezzi){
        this.pos=pos;
        this.npezzi=npezzi;
        carro = new ArrayList<Pezzo>(npezzi);
    }
    public abstract int stato();
    public abstract boolean distrutto();
    public abstract void fuoco(Posizione pos);
}
