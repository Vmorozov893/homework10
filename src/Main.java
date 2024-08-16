import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void leapYearM(int year) {
        boolean leapYear = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && year > 1584;
        if (leapYear) {
            System.out.println(year + " год является високосным.\n");
        } else {
            System.out.println(year + " год не является високосным.\n");
        }
    }

    public static void applicationVersion(int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке\n");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке\n");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке\n");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке\n");
        }
    }

    public static void deliveryTime(int distance) {
        if (distance <= 20) {
            System.out.println("Потребуется дней: 1.\n");
        } else if (distance <= 60) {
            System.out.println("Потребуется дней: 2.\n");
        } else if (distance <= 100) {
            System.out.println("Потребуется дней: 3.\n");
        } else {
            System.out.println("Доставки нет.\n");
        }
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("1 Задание.\n");

        int year = 2021;
        leapYearM(year);
        year = 2000;
        leapYearM(year);

        System.out.println("\n2 Задание.\n");

        int clientDeviceYear = 2014;
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Год выпуска: " + clientDeviceYear + "\nOS: Android");
        } else if (clientOS == 0) {
            System.out.println("Год выпуска: " + clientDeviceYear + "\nOS: IOS");
        }
        applicationVersion(clientOS, clientDeviceYear);

        clientOS = 0;
        clientDeviceYear = LocalDate.now().getYear();
        if (clientOS == 1) {
            System.out.println("Год выпуска: " + clientDeviceYear + "\nOS: Android");
        } else if (clientOS == 0) {
            System.out.println("Год выпуска: " + clientDeviceYear + "\nOS: IOS");
        }
        applicationVersion(clientOS, clientDeviceYear);

        System.out.println("\n3 Задание.\n");

        int deliveryDistance = 95;
        System.out.println("Расстояние до клиента: " + deliveryDistance);
        deliveryTime(deliveryDistance);
        deliveryDistance = 56;
        System.out.println("Расстояние до клиента: " + deliveryDistance);
        deliveryTime(deliveryDistance);
    }
}