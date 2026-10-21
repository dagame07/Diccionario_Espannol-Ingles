# Diccionario Español-Inglés (Diccionario)

Programa de consola en Java para practicar traducciones. Es un **código de prueba**
para ejercitar colecciones (`HashMap`, `List`), `Scanner` y control de flujo.

## ¿Qué hace?

1. Guarda un diccionario Español -> Inglés en un `HashMap`.
2. Muestra un menú con dos opciones: empezar el quiz o salir.
3. En cada partida elige **5 palabras al azar, sin repetir**.
4. Pide la traducción al inglés de cada una (sin distinguir mayúsculas/minúsculas).
5. Muestra al final el número de respuestas correctas e incorrectas.

## Requisitos

- Java 8 o superior (JDK)

## Cómo ejecutarlo

```bash
javac DiccionarioIE.java
java DiccionarioIE
```

O directamente desde el IDE (IntelliJ: clic derecho sobre el archivo -> *Run*).

## Ejemplo de uso

```
=== MENÚ ===
 1. Empezar Quiz
 2. Salir
1
1) casa -> house
   ¡Correcto!
...
=== Resultados ===
Respuestas correctas:   4
Respuestas incorrectas: 1
```

## Conceptos que practica

- `HashMap<String, String>` para guardar pares clave-valor
- `Collections.shuffle` y `subList` para selección aleatoria sin repetidos
- Lectura de entrada con `Scanner` y validación con `try/catch`
- Ciclo con bandera booleana y `switch`

## Posibles mejoras

- Aceptar varias traducciones válidas por palabra (`Map<String, Set<String>>`)
- Ignorar acentos al comparar
- Elegir cuántas palabras tendrá cada partida
- Cargar el diccionario desde un archivo en lugar de dejarlo en el código
- Refactoriar para agregar pruebas unitarias
