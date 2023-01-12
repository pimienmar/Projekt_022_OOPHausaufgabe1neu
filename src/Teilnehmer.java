public class Teilnehmer {

    // Klasse Teilnehmer
    // (Bestandteile einer Klasse:
    // 1) Attribute / Eigenschaften)
    // 2) Methoden / Operationen

    // 1) Attribute //////////////////////////////////////////////////////////////////

    public String Haarfarbe;

    public double Koerpergroeße;

    public String Kurs = "Reha";

    public int Noten;

    public int EnergieInMinuten;

    public int Geburtsjahr;

    // 2) Methoden ////////////////////////////////////////////////////////////////////

    public void Alter () { System.out.println( 2023 - Geburtsjahr); }

    public void KlausurSchreiben () {System.out.println("Name aufschrieben und Aufgaben lösen"); }




    /*

    public void Lernen (int Lernen) {
        if (EnergieInMinuten > LernenInMinuten) {
            int EnergieInMinuten = EnergieInMinuten - LernenInMinuten;
        }
    }

    public void KaffeeTrinken (int Kaffee) {
                EnergieInMinuten = EnergieInMinuten + KaffeeTrinken;
    }

     //   Lesen
      //  Schreiben
      //          Melden
    //Lernen
    */

}
