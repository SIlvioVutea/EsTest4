import java.time.OffsetDateTime;

public class Main {
    //    Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//    Ottieni l'anno
//    Ottieni il mese
//    Ottieni il giorno
//    Ottieni il giorno della settimana
//    Stampa i risultati sulla console -Crea dei test per questo esercizio
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int year = getYear(date);
        System.out.println("Year : " + year);

        int month = getMonth(date);
        System.out.println("Month : " + month);

        int dayInTheMonth = getDayOfMonth(date);
        System.out.println("Day in the month : " + dayInTheMonth);

        String dayInTheWeek = getDayOfWeek(date);
        System.out.println("Day in the week : " + dayInTheWeek);

    }

    public static int getYear(OffsetDateTime date) {
        return date.getYear();
    }

    public static int getMonth(OffsetDateTime date) {
        return date.getMonthValue();
    }

    public static int getDayOfMonth(OffsetDateTime date) {
        return date.getDayOfMonth();
    }

    public static String getDayOfWeek(OffsetDateTime date) {
        return date.getDayOfWeek().toString();
    }
}