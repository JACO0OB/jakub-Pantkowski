// Klasa reprezentująca osobę
public class Osoba {

    // Prywatne pole przechowujące wiek osoby
    private int wiek;

    // Konstruktor klasy Osoba - umożliwia ustawienie wieku w momencie tworzenia obiektu
    public Osoba(int wiek) {
        this.wiek = wiek;
    }

    // Getter - metoda do pobierania wartości prywatnego pola wiek
    public int getWiek() {
        return wiek;
    }

    // Setter - metoda do ustawiania wartości prywatnego pola wiek
    public void setWiek(int wiek) {
        // Sprawdzenie, czy wiek jest większy lub równy zero
        if (wiek >= 0) {
            this.wiek = wiek;
        } else {
            System.out.println("Wiek nie może być ujemny.");
        }
    }

    // Publiczna metoda wyświetlająca informacje o osobie
    public void pokazInformacje() {
        System.out.println("Wiek osoby: " + wiek);
    }

    // Główna metoda programu - punkt startowy aplikacji
    public static void main(String[] args) {
        // Tworzenie obiektu klasy Osoba
        Osoba osoba = new Osoba(25);

        // Wyświetlenie wieku osoby
        osoba.pokazInformacje();

        // Zmiana wieku osoby za pomocą settera
        osoba.setWiek(30);
        osoba.pokazInformacje();

        // Próba ustawienia nieprawidłowego wieku
        osoba.setWiek(-5); // Powinien wyświetlić komunikat o błędzie
    }
}
