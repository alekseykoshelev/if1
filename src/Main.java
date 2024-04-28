public class Main {
    public static void main(String[] args) {

        {
            int age = 19;
            if (age >= 18) {
                System.out.println("Совершеннолетний");
            } else {
                System.out.println("Не достиг совершеннолетия");
            }
        }

        int temp = 6;
        if (temp <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        int speed = 60;
        if (speed > 60) {
            System.out.println("придется заплатить штраф");
        } else {
            System.out.println("можно ездить спокойно");
        }

        {
            int age = 1;
            if (age >= 2 && age <= 6) {
                System.out.println("нужно ходить в детский сад");
            }
            if (age >= 7 && age <= 17) {
                System.out.println("нужно ходить в школу");
            }
            if (age >= 18 && age <= 24) {
                System.out.println("нужно ходить в университет");
            }
            if (age > 24) {
                System.out.println("нужно ходить на работу");
            }
        }

        {
            int age = 14;
            if (age < 5) {
                System.out.println("не может кататься на аттракционе");
            }
            if (age >= 5 && age <= 14) {
                System.out.println("может кататься только в сопровождении взрослого");
            }
            if (age > 14) {
                System.out.println("может кататься без сопровождения взрослого");
            }
        }

        {
            int total = 120;
            int seats = 60;
            int place = 86;

            if (place > total) {
                System.out.println("Места нет!");
            } else {
                if (place > seats) {
                    System.out.println("Стоим");
                } else {
                    System.out.println("Сидим");
                }
            }
        }


        {
            int one = 1;
            int two = 2;
            int three = 3;
            if (one > two && one > three) {
                System.out.println(one);
            } else {
                if (two > three) {
                    System.out.println(two);
                } else {
                    System.out.println(three);
                }
            }
        }

    }
}
