/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amedeo Di Gaetano <digaetano.amedeo@gmail.com>
 */
public class Persona {
    
    private final String nome;
    private final String dataDN;
    private final String sesso;
    
    public Persona(String nome, String dataDN, String sesso){
        this.nome = nome;
        this.dataDN = dataDN;
        this.sesso = sesso;
    }
    
    @Override
    public String toString(){
        return "Persona:\n"+
        "\tNome: "+nome+"\n"+
        "\tData Di Nascita: "+dataDN+"\n"+
        "\tSesso: "+sesso+"\n";
    }
    
}
