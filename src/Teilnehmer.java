public class Teilnehmer {

    // Klasse Teilnehmer
    // (Bestandteile einer Klasse:
    // 1) Attribute / Eigenschaften)
    // 2) Methoden / Operationen

    // 1) Attribute //////////////////////////////////////////////////////////////////

    public String haarfarbe;

    public double koerpergroeße;

    public String kurs;

    public int noten;

    public int geburtsjahr;

    // Konstruktor (Mehr Konstruktoren = mehr flexibilität)
    public Teilnehmer (String newhaarfarbe, double newkoerpergroeße, String newkurs, int newnoten, int newgeburtsjahr) {
        haarfarbe = newhaarfarbe;
        koerpergroeße = newkoerpergroeße;
        kurs = newkurs;
        noten = newnoten;
        geburtsjahr = newgeburtsjahr;
    }

    public Teilnehmer (String newhaarfarbe, double newkoerpergroeße, String newkurs, int newnoten) {
        this(newhaarfarbe, newkoerpergroeße, newkurs, newnoten, 1992);
    }

    public Teilnehmer (String newhaarfarbe, double newkoerpergroeße, String newkurs) {
        this(newhaarfarbe, newkoerpergroeße, newkurs, 0);
    }

    public Teilnehmer (String newhaarfarbe, double newkoerpergroeße) {
        this(newhaarfarbe, newkoerpergroeße, "none");
    }

    public Teilnehmer (String newhaarfarbe) {
        this(newhaarfarbe, 0.00);
    }

    public Teilnehmer () {
        this("none");
    }

    // 2) Methoden ////////////////////////////////////////////////////////////////////

    //public void Alter () { System.out.println( 2023 - Geburtsjahr); }

    public void KlausurSchreiben () {System.out.println("Name aufschrieben und Aufgaben lösen"); }


}
