/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amedeo Di Gaetano <digaetano.amedeo@gmail.com>
 */
public class Prodotto {
    
    private final String nome;
    private final double prezzo;
    private final int quantita;
    
    public Prodotto(String nome, double prezzo, int quantita){
        this.nome = nome;
        this.prezzo = prezzo;
        this.quantita = quantita;
    }
    
    @Override
    public String toString(){
        return "Prodotto:\n"+
               "\tNome: "+nome+"\n"+
               "\tPrezzo: "+prezzo+"\n"+
               "\tQuantita': "+quantita+"\n";
    }
}
