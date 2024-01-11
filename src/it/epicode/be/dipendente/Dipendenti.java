package it.epicode.be.dipendente;

public class Dipendenti {
    public static double stipendioBase = 1000;
    private String matricola;
    private double stipendio;
    private double importoOrarioStraordinario;

    private Livello livello;
    private Dipartimento dipartimento;

    public Dipendenti(String matricola,double stipendio,double importoOrarioStraordinario,Livello livello,Dipartimento dipartimento){
      this.matricola = matricola;
      this.stipendio = stipendio;
      this.importoOrarioStraordinario = importoOrarioStraordinario;
      this.livello = livello;
      this.dipartimento = dipartimento;
    }

    public Dipendenti(String matricola,Dipartimento dipartimento){
        this.matricola = matricola;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.livello = Livello.OPERAIO;



    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public Livello getLivello() {
        return livello;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public void stampaDatiDipendente(){
        System.out.println("Matricola : "+ this.matricola+ "" + "Stipendio : "+ this.stipendio+ "" + "Import Straordinari: "+ this.importoOrarioStraordinario+ "" + "Livello: "+ this.livello +"" + "Dipartimento: " + this.dipartimento);
    }

    public Livello promuovi() {
        switch (this.livello) {
            case OPERAIO:
                this.livello = Livello.IMPIEGATO;
                this.stipendio = Dipendenti.stipendioBase *1.2;
                break;
            case IMPIEGATO:
                this.livello = Livello.QUADRO;
                this.stipendio = Dipendenti.stipendioBase*1.5;
                break;
            case QUADRO:
                this.livello = Livello.DIRIGENTE;
                this.stipendio = Dipendenti.stipendioBase* 2;
                break;

        }
        return this.livello;
    }

   public static double getPaga(Dipendenti dipendente){
        double stipendio = dipendente.stipendio;
        return stipendio;

    }

    public static double getPaga(Dipendenti dipendente,double oreStraordinario){
        double stipendioStro = dipendente.stipendio + dipendente.importoOrarioStraordinario* oreStraordinario;
        return stipendioStro;
    }
}


