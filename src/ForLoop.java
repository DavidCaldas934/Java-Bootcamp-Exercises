public class ForLoop {
    public static void main(String[]args) {
        System.out.println("==========");
        System.out.println("Ejemplo 4");
        System.out.println("==========");

        //Blucles anidados
        for (int i=1; i<=5; i++){
            if (i==1){
                for (int k=1; k<=5; k++){
                    System.out.print("Tabla "+k+"\t\t");
                }
                System.out.println("|");
            }
            for (int j=1; j<=5; j++){
                    System.out.print(i + " x " + j + " = " + (i*j) + "\t");
            }
            System.out.println("|");
        }
        System.out.println("=========");
        for (int j =1; j<=10; j++){
            System.out.print("Tabla del "+j+"\t");
        }
        System.out.println("");

        for (int i=1; i<=10; i++){
            for (int j=1; j<=10; j++){
                System.out.print(i + " x " + j + " = " + (i*j) + "\t");
            }
            System.out.println("|");
        }
    }
}
