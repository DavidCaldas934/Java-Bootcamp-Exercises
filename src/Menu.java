import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean continuar=true;

        String[] menu={"CONVERSOR DE MONEDAS","CALCULADORA","SALIR DEL PROGRAMA"};
        String[] moneda= {"Dólares(USD)","Euros(EUR)","Yenes(JPY)","Rublos(RUB)"};
        String[] operaciones= {"SUMA","RESTA","MULTIPLICACIÓN0","DIVISIÓN"};
        double[] tipodecambio= {3.75,4.10,0.026,0.041};


        while (continuar){
            System.out.println("--------------------------------");
            System.out.println("MENÚ GENERAL");
            for (int i=0; i<menu.length; i++){
                System.out.println((i+1)+".- "+menu[i]);
            }
            System.out.println("--------------------------------");

            int opc=0;

            //Válidando la opción
            System.out.println("Ingrese su opción:");
            if (sc.hasNextInt()){
                opc = sc.nextInt();
                sc.nextLine();
                if (opc<1 || opc>3){
                    System.out.println("¡Error! Debe ingresar un número entre 1 y 3.");
                    continue;
                }
            }
            else {
                System.out.println("¡Error!. Vuelva a ingresar una opción");
                sc.nextLine();
                continue;
            }


            switch (opc){
                case 1:
                    System.out.println("--------------------------------");
                    System.out.println("MENÚ DE CONVERSOR DE MONEDAS");
                    for (int i=0; i<moneda.length; i++){
                        System.out.println((i+1)+".- Convertir a "+moneda[i]);
                    }
                    System.out.println("--------------------------------");

                    int convertirmoneda=0;
                    //validar la entrada de la operacion
                    System.out.println("¿A que moneda quieres convertir?");
                    if (sc.hasNextInt()){
                        convertirmoneda = sc.nextInt();
                        sc.nextLine();
                    }
                    else {
                        System.out.println("¡Error!. Vuelva a ingresar una opción");
                        sc.nextLine();
                        break;
                    }

                    if (convertirmoneda<1 || convertirmoneda>moneda.length){
                        System.out.println("Error¡ Opción inválida");
                        break;
                    }

                    System.out.println("Ingrese moneda");
                    double monto=0;
                    if (sc.hasNextDouble()){
                        monto= sc.nextDouble();
                        sc.nextLine();
                    }else {
                        System.out.println("Error. Debe ingresar un monto a convertir");
                        sc.nextLine();
                        break;
                    }

                    double resultado = monto / tipodecambio[convertirmoneda-1];
                    System.out.println("Monto final es: "+ moneda[convertirmoneda-1]+": "+String.format("%.2f",resultado));

                    break;

                case 2:
                    System.out.println("--------------------------------");
                    System.out.println("CALCULADORA");
                    for (int i=0; i<operaciones.length; i++){
                        System.out.println((i+1)+".-" +operaciones[i]);
                    }
                    System.out.println("--------------------------------");

                    System.out.println("¿Qué operación desea realizar?");
                    int operacion,num1,num2=0;


                    //validar la entrada de la operacion
                    if (sc.hasNextInt()){
                        operacion = sc.nextInt();
                        sc.nextLine();
                    }
                    else {
                        System.out.println("¡Error!. Vuelva a ingresar una opción");
                        sc.nextLine();
                        break;
                    }


                    //validar la entrada del primer número
                    System.out.println("Ingrese primer número");
                    if (sc.hasNextInt()){
                        num1 = sc.nextInt();
                        sc.nextLine();
                    }
                    else {
                        System.out.println("¡Error!. Ingrese un número");
                        sc.nextLine();
                        break;
                    }

                    //validar la entrada del segundo número
                    System.out.println("Ingrese segundo número");
                    if (sc.hasNextInt()){
                        num2 = sc.nextInt();
                        sc.nextLine();
                    }
                    else {
                        System.out.println("¡Error!. Ingrese un número");
                        sc.nextLine();
                        break;
                    }




                    switch (operacion){
                        case 1:
                            System.out.println("La SUMA es: " + (num1+num2));
                            break;
                        case 2:
                            System.out.println("La RESTA es: " + (num1-num2));
                            break;
                        case 3:
                            System.out.println("La MULTIPLICACIÓN es: " + (num1*num2));
                            break;
                        case 4:
                            if (num2!=0){
                                System.out.println("La DIVISIÓN es: " + ((double) num1/num2));
                            }else{
                                System.out.println("Debe ingresar un número diferente de 0");
                            }
                            break;
                        default:
                            System.out.println("Opción de operación INVÁLIDA");
                    }
                    break;

                case 3:
                    System.out.println("Gracias por su visita");
                    continuar=false;
                    break;
                default:
                    System.out.println("Ingreso una OPCIÓN INVÁLIDA.");
            }
            if (continuar){
                System.out.println("¿Desea continuar? S/N");
                String rpta = sc.nextLine();

                if (!rpta.equalsIgnoreCase("S")){
                    continuar=false;
                    System.out.println("Programa terminado.Gracias por su visita");
                }
            }
        }
        sc.close();
    }
}
