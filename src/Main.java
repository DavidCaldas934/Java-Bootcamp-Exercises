import feature.Car;
import feature.Person;

import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //Este objeto es una instancia de la clase Car
        Car lamborghini = new Car();
        lamborghini.acelerate();
        lamborghini.stop();

        //
        Person usuario = new Person("David","Ingeniero","Peru");
        System.out.println(usuario.nombre);
        usuario.study();
        usuario.training();

        //

        Scanner scanner =   new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstnumber = scanner.nextInt();

        System.out.println("Enter second number: ");
        int secondtnumber = scanner.nextInt();

        int sum = firstnumber + secondtnumber;
        int subtraction = firstnumber - secondtnumber;
        int multiplication = firstnumber * secondtnumber;
        double division = (double)firstnumber / (double)secondtnumber;

        System.out.println("The sum is: " + sum);
        System.out.println("The subtraction is: " + subtraction);
        System.out.println("The multiplication is: " + multiplication);
        System.out.println("The division is: " + division);
        System.out.println("===============================================0");

        scanner.close();

    }
}