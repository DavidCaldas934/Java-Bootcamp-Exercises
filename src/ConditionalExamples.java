import java.util.Scanner;

public class ConditionalExamples {
    //psvm me da el public stt void
    public static void main(String[]args){

        System.out.println("=============================");
        System.out.println("Ejercicio 1");
        System.out.println("=============================");
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = sc.nextDouble(); // -1

        System.out.print("Ingrese el segundo número: ");
        double num2 = sc.nextDouble(); // 2

        System.out.print("Ingrese operación (+, -, *, /): ");
        char operacion = sc.next().charAt(0); // -

        double resultado = 0;
        boolean operacionValida = true; // flag para saber si una operacion es valida -1 - 2 = -3

        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2; // -3
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) { // if-else para validar
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: División por cero no permitida.");
                    operacionValida = false;
                }
                break;
            default:
                System.out.println("Operación no válida.");
                operacionValida = false;
        }

        // if (true)
        if (operacionValida) {
            // -3
            String tipoResultado = (resultado >= 0) ? "Positivo" : "Negativo"; // ternario
            // String = Negativo
            System.out.println("Resultado: " + resultado + " (" + tipoResultado + ")");
        }

        System.out.println("=============================");
        System.out.println("Ejercicio 2");
        System.out.println("=============================");

        // Paso 1: pedir el monto
        System.out.println("Ingrese el monto en dolares");
        double monto = sc.nextDouble();

        // Paso 2: validar el monto positivo
        if (monto <= 0) {
            System.out.println("Error: El monto debe ser mayor que cero.");
        } else {
            // Paso 3: mostrar el menu
            System.out.println("Selecciona la moneda a convertir: ");
            System.out.println("1. Euros");
            System.out.println("2. Pesos Mexicanos");
            System.out.println("3. Soles");
            int opcion = sc.nextInt();

            double montoConvertido = 0;
            boolean opcionValida = true;

            // Paso 4 Usar el switch de conversion
            switch (opcion) {
                case 1:
                    montoConvertido = monto * 0.92;
                    break;
                case 2:
                    montoConvertido = monto * 17.0;
                    break;
                case 3:
                    montoConvertido = monto * 3.55;
                    break;
                default:
                    System.out.println("Error: Opcion invalida.");
                    opcionValida = false;
            }

            if (opcionValida) {
                String clasificacion = (montoConvertido < 1000) ? "Bajo" : "Alto";
                System.out.println("Monto Convertido: " + montoConvertido + " (" + clasificacion + ")");
            }

        }

        int numero= sc.nextInt();

        System.out.println("Ingre");

        sc.close();
    }
}
