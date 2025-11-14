// Classe principale che coordina tutte le fasi di produzione
public class ProduzioneCoperchi {

    public static void main(String[] args) {

        System.out.println("Avvio del processo di produzione dei coperchi di plastica...\n");

        // Creazione delle fasi
        FaseProduzione stampaggio = new Stampaggio();
        FaseProduzione colorazione = new Colorazione();
        FaseProduzione imballaggio = new Imballaggio();


        //  Avvio dello stampaggio
        stampaggio.start();
        //

        try {
            // Attendo che la fase di stampaggio termini prima di passare alla successiva
            stampaggio.join();
        } catch (InterruptedException e) {
            System.out.println(" Errore durante lo stampaggio: " + e.getMessage());
        }

        //Avvio della colorazione
        colorazione.start();

        try {
            colorazione.join();
        } catch (InterruptedException e) {
            System.out.println(" Errore durante la colorazione: " + e.getMessage());
        }

        //Avvio dell’imballaggio
        imballaggio.start();

        try {
            imballaggio.join();
        } catch (InterruptedException e) {
            System.out.println(" Errore durante l’imballaggio: " + e.getMessage());
        }

        //  FINE DEL PROCESSO
        System.out.println("\n Tutte le fasi di produzione dei coperchi sono completate con successo!");
    }
}

