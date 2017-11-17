public class ISBN2 {
    private String ISBN;

    public ISBN2(String ISBN) {
        this.ISBN = ISBN;
    }

    public Integer suma() {
        int suma = 0;
        for (int i = 0; i < isbnArr().length; i++) {
            suma += Integer.parseInt(isbnArr()[i]);
        }
        return suma;
    }

    public void odd() {
        for (int i = 0; i < (isbnArr().length) - 1; i++) {
            int liczba1 = Integer.parseInt(isbnArr()[i]);
            int liczba2 = Integer.parseInt(isbnArr()[i + 1]);
            int wynik = liczba2 + liczba1;
            if (wynik % 2 != 1) {
                System.out.println(wynik + " Parzysta");
            } else
                System.out.println(wynik + " Nieparzysta");
        }
    }

    private String[] isbnArr() {

        return clearISBN().split("");
    }

    private String clearISBN() {

        return ISBN.replaceAll("\\D+", "");
    }
}

