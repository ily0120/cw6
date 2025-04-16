public class MediaBiblioteczne {

    protected String tytul;
    protected int rokWydania;
    protected boolean dostepny;

    public MediaBiblioteczne(String tytul, int rokWydania) {
        this.tytul = tytul;
        this.rokWydania = rokWydania;
        this.dostepny = true;
    }

    public void wypozycz() {
        if (dostepny) {
            dostepny = false;
            System.out.println("Wypożyczono: " + tytul);
        } else {
            System.out.println(tytul + " jest już wypożyczone.");
        }
    }

    public void zwroc() {
        if (!dostepny) {
            dostepny = true;
            System.out.println("Zwrócono: " + tytul);
        } else {
            System.out.println(tytul + " nie było wypożyczone.");
        }
    }

    public void wyswietlInformacje() {
        System.out.println("Tytuł: " + tytul + ", Rok wydania: " + rokWydania + ", Dostępność: " + (dostepny ? "Dostępne" : "Wypożyczone"));
    }
}
