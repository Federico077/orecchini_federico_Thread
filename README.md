Questo progetto simula le principali fasi di produzione dei coperchi di plastica: stampaggio, colorazione e imballaggio. Ogni fase è rappresentata da un thread separato che stampa lo stato della lavorazione e utilizza tempi di attesa per simulare il processo industriale. Il thread principale coordina le fasi usando join().

2️ Project Structure

Il progetto include le seguenti classi:

Classe	Descrizione
FaseProduzione	Classe astratta che rappresenta una fase generica di produzione
Stampaggio	Sottoclasse che simula lo stampaggio dei coperchi
Colorazione	Sottoclasse che simula la colorazione dei coperchi
Imballaggio	Sottoclasse che simula l’imballaggio dei coperchi
ProduzioneCoperchi	Classe principale che avvia e coordina tutte le fasi
3️ Installation Requirements

Clona il repository:
Assicurati di avere Java JDK 8 o superiore installato.

Compila tutti i file .java ed esegui il programma principale.

4️ Usage

Il programma simula la produzione completa dei coperchi, mostrando l’inizio e la fine di ogni fase:

 Avvio del processo di produzione dei coperchi di plastica...

 [Stampaggio dei coperchi] Inizio lavorazione...
 [Stampaggio dei coperchi] Fase completata.
 [Colorazione dei coperchi] Inizio lavorazione...
 [Colorazione dei coperchi] Fase completata.
 [Imballaggio dei coperchi] Inizio lavorazione...
 [Imballaggio dei coperchi] Fase completata.

 Tutte le fasi di produzione dei coperchi sono completate con successo!

5️ Come funziona

Ogni fase di produzione è un thread separato.

sleep() simula il tempo necessario per completare la fase.

Il thread principale utilizza join() per aspettare il completamento dei thread figli prima di passare alla fase successiva.

L’ordine di esecuzione è: Stampaggio → Colorazione → Imballaggio.

6️ Extensions / Improvements

Aggiungere nuove fasi di produzione, come Controllo Qualità o Rifinitura.

Eseguire alcune fasi in parallelo per simulare linee di produzione più complesse.

Personalizzare i tempi di lavorazione per testare diverse configurazioni del processo industriale.
