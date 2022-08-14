public class Main {
    public static void main(String[] args) {


        // Задание 1
        int i = 1;
        while (i <= 10) {
            System.out.println(" " + i++);

        }
        for (int c = 10; c > 0; c--) {
            System.out.println(" " + c);
        }




        // Задание 2
        for (int b = 2; b <= 31; b = b + 7) {
            System.out.println("Сегодня пятница, " + b + "-е число. Необходимо подготовить отчет.");
        }


        // Задание 3
        for (int z = 79; z >= 2022 - 200; z = z + 79) {
            System.out.println(z);
        }
        for (int x = 79; x <= 2022 + 100; x = x + 79) {
            System.out.println(x);
        }
    }
}
