public class Main {
    public static void main(String[] args) {

        Teilnehmer t1 = new Teilnehmer("Braun", 1.81, "2322", 6, 1990);
        System.out.println(t1.geburtsjahr);

        Teilnehmer t2 = new Teilnehmer ();
        System.out.println(t1.koerpergroeße);
        System.out.println(t2.noten);
    }
}