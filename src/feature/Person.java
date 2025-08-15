package feature;

public class Person {

    public String nombre;
    String ocupacion;
    String pais;

    public Person() {
    }

    public Person(String nombre, String ocupacion, String pais) {
        this.nombre = nombre;
        this.ocupacion = ocupacion;
        this.pais = pais;
    }

    public void study(){
        System.out.println("Estudiando");
    }

    void eating(){

    }
    public void training(){
        System.out.println("Diplomado");
    }
}
