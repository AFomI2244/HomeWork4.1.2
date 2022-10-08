public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задание 2
        System.out.println("Задание 2");
        int clientDeviceYear = 2020;
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задание 3
        System.out.println("Задание 3");
        int year = 2020;
        int remainder = (year % 4);
        int ostatok = (year % 100);
        int is400year = (year % 400);
        if ((remainder == 0) && (ostatok != 0) || (is400year == 0)) {
            System.out.println( year + " год является високосным");
        } else {
            System.out.println( year + " год не является високосным");
        }

        //Задание 4
        System.out.println("Задание 4");
        int deliveryDistance = 130;
        int deliveryTime = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if ((deliveryDistance >= 20) && (deliveryDistance < 60)) {
            System.out.println("Потребуется дней: " + (deliveryTime + 1));
        } else if ((deliveryDistance >= 60) && (deliveryDistance <= 100)) {
            System.out.println("Потребуется дней: " + (deliveryTime + 2));
        } else {
            System.out.println("По указанному адресу доставка не осуществляется");
        }
        //Задание 5
        System.out.println("Задание 5");
        int monthNumber = 10;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}