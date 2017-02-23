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
    public ArrayList<Pezzo> carro;
    
    /**
     * Costruttore
     * @param pos Posizione carro
     * @param npezzi Numero di pezzi da cui è composto il carro
     */
    public CarroCantiere (Posizione pos, int npezzi){
        this.pos=pos;
        this.npezzi=npezzi;
        carro = new ArrayList<Pezzo>(npezzi);
    }
    /**
     * Stato del carro
     * @return Stato del carro
     */
    public abstract String stato();
    
    /**
     * Controllo se distrutto o no
     * @return True se distrutto, false altrimenti
    */
    public abstract boolean distrutto();
    
    /**
     * Date le coordinate del colpo, restituisce un esito
     * @param pos Posizione dove si è sparato
     * @return Esito del colpo
     */
    public abstract String fuoco(Posizione pos);
}
