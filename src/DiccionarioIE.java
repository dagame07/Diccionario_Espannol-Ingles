import java.util.*;

/*Diccionario Inglés-Español con un HasMap
* Se seleccionan al azar 5 palabras y evalúa la traducción del usuario*/
public class DiccionarioIE {
    public static void main(String[] args) {
        //Realizamos el HashMap
        //Se realiza estructura Español -> Inglés
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("casa", "house");
        dictionary.put("limonada", "lemonade");
        dictionary.put("jengibre", "ginger");
        dictionary.put("muro", "wall");
        dictionary.put("cielo", "sky");
        dictionary.put("silla", "chair");
        dictionary.put("servicio de entrega", "delivery service");
        dictionary.put("mango", "mango");
        dictionary.put("aguacate", "avocado");
        dictionary.put("agua", "water");
        dictionary.put("perro", "dog");
        dictionary.put("pato", "duck");
        dictionary.put("mar", "sea");
        dictionary.put("ciudad", "city");
        dictionary.put("puerta", "door");
        dictionary.put("ventana", "window");
        dictionary.put("flor", "flower");
        dictionary.put("hora", "hour");
        dictionary.put("fuego", "fire");
        dictionary.put("cigarra", "cicada");
        dictionary.put("luna", "moon");
        dictionary.put("tiempo", "time");
        dictionary.put("gato", "cat");
        dictionary.put("malvavisco", "marshmallow");
        dictionary.put("bota", "boot");


        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        //Pedimos al usuario la traduccion de la palabra
        while(running) {

            int correct = 0;
            int wrong = 0;

            System.out.println("=== Quiz de traducción Español -> Inglés ===");
            System.out.println("***********************************************");
            System.out.println("=== MENÚ ===");
            System.out.println(" 1. Empezar Quiz");
            System.out.println(" 2. Salir");
            System.out.println("***********************************************");

            int option;
            try {
                option = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("\n[Error] Debes escribir un número (1 o 2).\n");
                continue;
            }
            switch (option) {
                case 1:
                    //Seleccionar 5 palabras al azar, sin repetir
                    List<String> keys = new ArrayList<>(dictionary.keySet()); //Guardamos en nueva variable
                    List<String> question = new ArrayList<>(); //Creamos una lista vacia para poder agregar datos mas adelante
                    Random random = new Random(); //Llamamos la libreria random para escoger una palabra al azar

                    //Escogemos las palabras aleatorias y lo limitamos a 5 palabras
                    while (question.size() < 5) {
                        String word = keys.get(random.nextInt(keys.size()));
                        if (!question.contains(word)) { //Para evitar repetir alguna palabra en la lista
                            question.add(word);
                        }
                    }

                    System.out.println("Escribe la traducción al inglés de cada palabra.\n");

                    for (int i = 0; i < question.size(); i++) {
                        String palabraEspanol = question.get(i);
                        String correctAnswer = dictionary.get(palabraEspanol);

                        System.out.print((i + 1) + ") " + palabraEspanol + " -> ");
                        String userAnswer = scanner.nextLine().trim();

                        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                            System.out.println("   ¡Correcto!\n");
                            correct++;
                        } else {
                            System.out.println("   Incorrecto. La respuesta correcta es: " + correctAnswer + "\n");
                            wrong++;
                        }
                    }

                    // 4. Mostrar resultados finales
                    System.out.println("=== Resultados ===");
                    System.out.println("Respuestas correctas:   " + correct);
                    System.out.println("Respuestas incorrectas: " + wrong);
                    break;
                case 2:
                    System.out.println("\nSaliendo del programa... ¡Gracias por participar!");
                    running = false;
                    break;

                default:
                    System.out.println("\n[Error] Opción no válida. Por favor, intenta de nuevo.");
                    break;
            }

        }
        scanner.close();
    }
}
