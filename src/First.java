/**
 *
 * @author Amedeo Di Gaetano <digaetano.amedeo@gmail.com>
 */
public class First {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fattura fattura;
        Persona io;
        String temp;
        String temp2;
        String temp3;
        double prezzo;
        int quantita;
        
        System.out.println("Chi sei?");
        System.out.print("Inserisci il nome: ");
        temp = Input.readString();
        System.out.print("Inserisci la data di nascita: ");
        temp2 = Input.readString();
        System.out.print("Inserisci il sesso: ");
        temp3 = Input.readString();
        
        io = new Persona(temp, temp2, temp3);
        
        System.out.println("Creo la fattura...");
        
        fattura = new Fattura(io);
        
        System.out.println("Insersci le informazioni dei prodotti:");
        
        for(int i=0; i < Fattura.N; i++){
            System.out.print("Inserisci il nome del prodotto: ");
            temp = Input.readString();
            System.out.print("Inserisci il prezzo: ");
            prezzo = Input.readDouble();
            System.out.print("Inserisci la quantita': ");
            quantita = Input.readInt();
            
            fattura.aggiungiProdotto(new Prodotto(temp, prezzo, quantita));
        }
        
        System.out.println("Stampo la fattura...");
        
        System.out.println(fattura.toString());
    }
    
}
