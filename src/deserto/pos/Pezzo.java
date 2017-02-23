/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deserto.pos;

/**
 *
 * @author FSEVERI\bollettin3412
 */
public class Pezzo {
  private int energia;
  private boolean sabbia;
  /**
   * costruttore parametrico pezzo
   * @param sabbia true se sotto false se sopra
   */
  public Pezzo(boolean sabbia){
   energia=100;
   this.sabbia=sabbia;
   }
  /**
   * funzione che toglie energia al pezzo
   * @return energia restante
   */
  public int colpito (){
      if (sabbia==true)energia-=25;
      if (sabbia==false)energia-=50;
      return energia;
   }
}
