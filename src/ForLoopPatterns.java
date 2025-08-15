public class ForLoopPatterns {
    public static void main(String[] args) {
        System.out.println("============");
        System.out.println("Ejemplo 5");
        System.out.println("============");
        System.out.println("=============================");
        System.out.println("Patrones desde abajo hacia arriba");
        System.out.println("=============================");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("=============================");
        System.out.println("Patrones invertidos");
        System.out.println("=============================");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
