import it.epicode.be.dipendente.Dipartimento;
import it.epicode.be.dipendente.Dipendenti;
import it.epicode.be.dipendente.Livello;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       Dipendenti dipendeteUno = new Dipendenti("U5TG5",1000,10,Livello.OPERAIO, Dipartimento.PRODUZIONE);
       Dipendenti dipendeteDue = new Dipendenti("U5TG6",1000,10,Livello.OPERAIO, Dipartimento.PRODUZIONE);
       Dipendenti dipendeteTre = new Dipendenti("U5TG7",1000,10,Livello.OPERAIO, Dipartimento.PRODUZIONE);
       Dipendenti dipendeteQuattro = new Dipendenti("U5TG8",1500,10,Livello.IMPIEGATO, Dipartimento.VENDITE);
       Dipendenti dipendeteCinque = new Dipendenti("U5TG9",2000,10,Livello.DIRIGENTE, Dipartimento.AMMINISTRAZIONE);
       dipendeteUno.stampaDatiDipendente();
       dipendeteUno.promuovi();
       dipendeteUno.stampaDatiDipendente();
       dipendeteUno.promuovi();
       dipendeteUno.stampaDatiDipendente();
       dipendeteUno.promuovi();
       dipendeteUno.stampaDatiDipendente();

       System.out.println(Dipendenti.getPaga(dipendeteUno,10));


        Dipendenti sommaStipendi[] = {dipendeteDue, dipendeteDue, dipendeteTre, dipendeteQuattro};

        double totaleStip = 0.0;

        for (Dipendenti dipendente : sommaStipendi) {
            totaleStip += dipendente.getStipendio();
        }

        System.out.println("Totale degli stipendi: " + totaleStip);






    }


}