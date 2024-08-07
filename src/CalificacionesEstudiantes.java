public class CalificacionesEstudiantes {
    public static void main(String[] args) {
        // Definimos los datos de los estudiantes
        String[] estudiantes = {"Ana", "Carlos", "Sofía", "David", "Elena"};
        String[] materias = {"Matemáticas", "Física", "Química", "Literatura", "Historia"};
        double[][] notas = {
                {8.5, 7.0, 9.0, 8.0, 7.5},  // Notas de Ana
                {7.0, 6.5, 8.0, 9.0, 8.5},  // Notas de Carlos
                {9.5, 9.0, 9.5, 8.5, 9.0},  // Notas de Sofía
                {6.0, 7.0, 7.5, 8.0, 7.0},  // Notas de David
                {8.0, 8.5, 7.5, 9.0, 8.5}   // Notas de Elena
        };

        // Mostramos la información de los estudiantes
        mostrarInformacionEstudiantes(estudiantes, materias, notas);

        // Calculamos y mostramos los promedios de cada estudiante
        calcularPromedios(estudiantes, notas);

        // Encontramos y mostramos al estudiante con el promedio más alto
        encontrarMejorEstudiante(estudiantes, notas);

        // Encontramos y mostramos la materia con el promedio más alto
        encontrarMejorMateria(materias, notas);
    }

    public static void mostrarInformacionEstudiantes(String[] estudiantes, String[] materias, double[][] notas) {
        System.out.println("Información de los estudiantes:");
        for (String estudiante : estudiantes) {
            System.out.print(estudiante + " ");
        }
        System.out.println();

        for (String materia : materias) {
            System.out.print(materia + " ");
        }
        System.out.println();

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void calcularPromedios(String[] estudiantes, double[][] notas) {
        System.out.println("\nPromedios de los estudiantes:");
        for (int i = 0; i < notas.length; i++) {
            double suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
            }
            double promedio = suma / notas[i].length;
            System.out.println(estudiantes[i] + ": " + promedio);
        }
    }

    public static void encontrarMejorEstudiante(String[] estudiantes, double[][] notas) {
        System.out.println("\nEl mejor de los estudiantes:");
        double [] mejorEstudiante = new double[5];
        for (int i = 0; i < notas.length; i++) {
            double suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
            }
            double promedio = suma / notas[i].length;
            mejorEstudiante[i] =promedio;
        }
        double max = mejorEstudiante[0];
        for (int i = 1; i < mejorEstudiante.length; i++) {
            if (mejorEstudiante[i] > max) {
                max = mejorEstudiante[i];
                System.out.println(estudiantes[i] + ": " + max);
            }
        }
        System.out.println();
    }

    public static void encontrarMejorMateria(String[] materias, double[][] notas) {
        double[] promedios = new double[materias.length];
        // Calcular el promedio de cada materia
        for (int j = 0; j < materias.length; j++) {
            double suma = 0;
            for (int i = 0; i < notas.length; i++) {
                suma += notas[i][j];
            }
            promedios[j] = suma / notas.length;
        }
        // Encontrar la materia con el promedio más alto
        double maxPromedio = promedios[0];
        int indiceMejorMateria = 0;
        for (int j = 1; j < promedios.length; j++) {
            if (promedios[j] > maxPromedio) {
                maxPromedio = promedios[j];
                indiceMejorMateria = j;
            }
        }
        System.out.println("La materia es: " + materias[indiceMejorMateria] + " con un promedio de " + maxPromedio);
    }

}