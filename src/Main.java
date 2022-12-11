import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    private final static int CURRENTYEAR = LocalDate.now().getYear();

    public static void main(String[] args) {
        printLeapOrNotLeapYear(CURRENTYEAR);
        printVersionOS(2018, 1);
        printCalculateTimeDelivery(45);
        printCalculateTimeDelivery(86);
        printCalculateTimeDelivery(128);
        printCalculateTimeDelivery(35600);
        printCalculateTimeDelivery(445);
        printCalculateTimeDelivery(50);
        printCalculateTimeDelivery(-8);
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

    public static void printCalculateTimeDelivery(int distance) {
        if (distance > 0 && distance < 3000) {
            System.out.println("Расчетное время доставки " + (1 + (distance + 19) / 40) + " дней.");
            return;
        }
        System.out.println("Доставка неваозможна");


    }

}