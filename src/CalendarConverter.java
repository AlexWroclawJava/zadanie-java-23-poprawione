
public class CalendarConverter {

    public static int PONIEDZIALEK = 1;
    public static int WTOREK = 2;
    public static int SRODA = 3;
    public static int CZWARTEK = 4;
    public static int PIATEK = 5;
    public static int SOBOTA = 6;
    public static int NIEDZIELA = 7;

    int dayNumber;

    public static String convertDayToString(int dayNumber) {
        switch (dayNumber) {
            case 1:
                return "PONIEDZIALEK";
            case 2:
                return "WTOREK";
            case 3:
                return "SRODA";
            case 4:
                return "CZWARTEK";
            case 5:
                return "PIATEK";
            case 6:
                return "SOBOTA";
            case 7:
                return "NIEDZIELA";
            default:
                return "Taki dzien tygodnia nie istnieje";
        }
    }
}
