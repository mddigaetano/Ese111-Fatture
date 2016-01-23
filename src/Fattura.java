/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amedeo Di Gaetano <digaetano.amedeo@gmail.com>
 */
public class Fattura {
    
    public static final int N = 5;
    private final Persona intestatario;
    private final Prodotto [] elenco;
    private int nProdotti;
    
    public Fattura(Persona intestatario){
        this.intestatario = intestatario;
        elenco = new Prodotto[N];
        nProdotti = 0;
    }
    
    public String getIntestatario(){
        return intestatario.toString();
    }
    
    public void aggiungiProdotto(Prodotto p){
        elenco[nProdotti] = p;
        nProdotti++;
    }
    
    @Override
    public String toString(){
        String ritorno = "Fattura: \n";
        ritorno += intestatario.toString();
        for(int i=0; i<nProdotti; i++)
            ritorno += elenco[i].toString();
        
        return ritorno;
    }
    
}
