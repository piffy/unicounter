package contatoreuniversale;

/**
 *Questa classe dovrebbe fornire tutte le funzionalità per 
 * il funzionamento di un contatore universale da usare in tutti i possibili
 * cicli.
 * 
 * @author Piffy
 */

//TODO Implementare Comparable-> Task 1

public class ContatoreUniversale {

    int x;

    //TODO Contatore con Inizializzatore -> Task 2   
    
    //TODO Incrementa() -> Task 3
    
    //TODO Incrementa(int incremento) -> Task 4
    
    //TODO ResetToInitialvalue (richiede nuovo attributo) -> Task 5
    
    //TODO toString -> Task 6
    
    public static void main(String args[]) {
    //TODO Test of counter
        ContatoreUniversale c = new ContatoreUniversale();
        System.out.println("Valore (dovrebbe essere 0):"+c);
    //TODO Test di Incrementa -> Task 7

    //TODO Test di Incrementa con quantità di incremento  -> Task 8   
        
    //TODO Test di Contatore con Inizializzatore -> Task 9
        
    //TODO Test di Comparable interface -> Task 10
        
    //TODO Test di ResetToInitialvalue() -> Task 11  
    
    
    }
    //TODO Rendere x privato, creando costruttore getter e setter () -> Task 12
    
    //TODO Aggiungere costruttore() -> Task 14
    
    //TODO toString con output in binario -> Task 15
    
    //TODO toString con output in esadecimale -> Task 16
    
    //TODO toString con output in ottale -> Task 17
    
    //TODO Decrementa() -> Task 17
    
    //TODO Decrementa(int decremento) -> Task 18
    
    //TODO SetTetto(int tetto) - se diverso da zero, il contatore non puo aumentare oltre tale limite -> Task 19
    
    //TODO SetCircolare() - se presento un tetto, un ulteriore incremento azzera il contatore. -> Task 20
    
}
