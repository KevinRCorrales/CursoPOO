public class Main {
    public static void main(String[] args) {
        // Ejercicio 3.8
        /*  a)  B * A – B ^ 2 / 4 * C
            b)  (A * B) / 3 ^ 2
            c)  (((B + C) / 2 * A + 10) * 3 * B) – 6
        */

        int A = 4;
        int B = 5;
        int C = 1;

        System.out.println("B * A - B ^ 2 / 4 * C");
        System.out.println(B * A - Math.pow(B, 2) / 4 * C + "\n");
        System.out.println("((A * B) / 3 ^ 2)");
        System.out.println((A * B) / Math.pow(3, 2) + "\n");
        System.out.println("(((B + C) / 2 * A + 10) * 3 * B) - 6");
        System.out.println((((B + C) / 2 * A + 10) * 3 * B) - 6);
    }
}