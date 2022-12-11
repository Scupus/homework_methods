import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    private final static int CURRENTYEAR = LocalDate.now().getYear();

    public static void main(String[] args) {
        printLeapOrNotLeapYear(CURRENTYEAR);
        printVersionOS(2018, 1);
    }

    public static void printSeparator() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public static boolean isLeapYear (int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void printLeapOrNotLeapYear(int year) {
        if (isLeapYear(year)) {
            System.out.println("Текуший " + year + " год является високосным.");
        }else{
            System.out.println("Текуший " + year + " год не является високосным.");
        }
        printSeparator();
    }

    public static boolean isNowYear(int year) {
        return year == CURRENTYEAR;
    }
    public static String getVersionOS(int versionOS){
            if (versionOS == 0) {
                return "IOS";
            }
        return "Android";
        }

    public static void printVersionOS(int year, int versionOS) {
        if (isNowYear(year)) {
            System.out.println("Установите полную версию приложения для " + getVersionOS(versionOS) + " по ссылке.");
            } else {
            System.out.println("Установите облегченную версию приложения для " + getVersionOS(versionOS) + " по ссылке.");
            }
            printSeparator();
        }



}