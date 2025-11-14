// Classe astratta che rappresenta una generica fase di produzione
public abstract class FaseProduzione extends Thread {

    private String nomeFase;
    private int durata; // durata in millisecondi

    // Costruttore
    public FaseProduzione(String nomeFase, int durata) {
        this.nomeFase = nomeFase;
        this.durata = durata;
    }
///
    @Override
    public void run() {
        try {
            // Stampa l’inizio della fase
            System.out.println("🔹 [" + nomeFase + "] Inizio lavorazione...");

            // Simula il tempo di lavorazione
            Thread.sleep(durata);

            // Stampa la fine della fase
            System.out.println(" [" + nomeFase + "] Fase completata.");
        } catch (InterruptedException e) {
            System.out.println(" [" + nomeFase + "] Errore: " + e.getMessage());



        }
    }
}
