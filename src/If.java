public class If {
    public static void main(String[] args) {

        {
            int clientOS = 1;
            if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }

        {
            int clientOS = 1;
            int year = 2014;
            if (clientOS == 0 && year < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 0 && year >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1 && year < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientOS == 1 && year >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }

            var appType = clientOS == 1 ? "Android" : "iOS";
            var appYear = year < 2015 ? "облегченную" : "";
            System.out.println("Установите " + appYear + " версию приложения для " + appType + " по ссылке");
        }

        {
            int year = 2024;
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println("Високосный");
            } else {
                System.out.println("Не является високосным");
            }
        }

        {
            int distance = 222;
            int days = 1;
            if (distance > 100) {
                System.out.println("Доставки нет!");
            } else {
                if (distance > 20) {
                    days++;
                }
                if (distance > 60) {
                    days++;
                }
                System.out.println("Потребуется дней: " + days + " срок доставки");
            }
        }

        {
            int month = 12;
            switch (month) {
                case 1, 2, 12 -> System.out.println("Зима");
                case 3, 4, 5 -> System.out.println("Весна");
                case 6, 7, 8 -> System.out.println("Лето");
                case 9, 10, 11 -> System.out.println("Осень");
                default -> System.out.println("Не знаем такой месяц!");
            }

            switch (month) {
                case 1:
                case 2:
                case 12:
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
                    System.out.println("Осень!");
                    break;

                default:
                    System.out.println("Не знаем такой месяц!");
            }
        }

    }
}
