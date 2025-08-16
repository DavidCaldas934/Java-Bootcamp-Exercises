import java.util.*;

public class CollectionsGuide {
    public static void main(String[] args){
        List<String> languages = new ArrayList<>();
        languages.add("Kotlin");
        languages.add("java");
        languages.add("C#");
        languages.add("python");
        languages.add("typescript");

        //Recorrer la lista

        for (String language:languages){
            System.out.println(language);
        }
        System.out.println("El elemento Java esiste? " + languages.contains("java"));

        System.out.println("El elemento del indice 0 " + languages.get(1));

        System.out.println("El elemento del indice 1" + languages.get(1));
        languages.set(3, "Golang");

        System.out.println("Removiendo el último language");
        languages.remove(4);

        //Sistema de calificaciones usando una LIST

        List<Double> calificaciones = new ArrayList<>();

        calificaciones.add(11.4);
        calificaciones.add(19.33);
        calificaciones.add(18.67);
        calificaciones.add(11.33);
        calificaciones.add(15.00);
        calificaciones.add(13.4);

        //Calcular promedio
        double suma = 0;
        for(double calificacion: calificaciones){
            suma+= calificacion;
        }

        double promedio = suma/calificaciones.size();
        System.out.println("Promedio"+promedio);

        //Encontrando min y max
        double min = Collections.min(calificaciones);
        double max = Collections.max(calificaciones);
        System.out.println("Nota más alta" + max+", "+min);

        //Buscar elemento
        System.out.println("La nota de 18.0 existe en mi lista?"+ calificaciones.contains(18.0));

        //sets NO se puede agregar un archivo mas
        Set<String> paises =new HashSet<>();
        paises.add("Perú");
        paises.add("Brasil");
        paises.add("Colombia");
        paises.add("Chile");

        for (String pais :paises){
            System.out.println(pais);
        }

        //List SI se puede agregar un archivo mas
        List<String> colores =new ArrayList<>();
        colores.add("Rojo");
        colores.add("Negro");
        colores.add("Negro");
        colores.add("Blanco");

        for (String color :colores){
            System.out.println(color);
        }

        //Maps --> tipo clave valor
        //No necesitas el orden -->HashMap
        //Si necesitas el orden por insericion o LRU simple --> LikendHashMap
        //Orden por comparador -->TreeMap

        Map<String,Integer> edades = new HashMap<>();
        edades.put("Pepito",28);
        edades.put("Micaela",18);
        edades.put("Raul",34);

        System.out.println("La edad de Raul es: "+ edades.get("Raul"));
        System.out.println("La persona Micaela existe? "+ edades.containsKey("Micaela"));

        for (var e : edades.entrySet()){
            String nombre = e.getKey();
            Integer edad =e.getValue();
            System.out.println(nombre+"->"+edad);
        }
        //Streams nueva forma de iterar
        edades.forEach((clave,valor)-> System.out.println(clave+" tiene "+valor));

        //QueQue
        Queue<Integer> q1 = new ArrayDeque<>();


    }
}
