package paquete05;

import java.util.ArrayList;
import java.util.Scanner;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de docentes. 
        El usuario decide cuando terminar el proceso
        
         */
        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        // inicio de solución
        boolean bandera = true;

        while (bandera) {
            //PROCESO PARA CONOCER QUE TIPO DE ESTUDIANTE QUIERE
            //INGRESAR EL USUARIO
            System.out.println("Tipo de Estudiante a ingresar\n"
                    + "Ingrese (1) para Estudiante Presencial"
                    + "\nIngrese (2) para Estudiante Distancia");
            tipoEstudiante = entrada.nextInt();
            entrada.nextLine();

            System.out.println("Ingrese los nombres del estudiante");
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese los apellidos del estudiante");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese la identificación del estudiante");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edadEst = entrada.nextInt();

            if (tipoEstudiante == 1) {

                EstudiantePresencial estudianteP = new EstudiantePresencial();
                
                //PROCESO PARA LLENAR LOS METODOS CORRESPONDIENTES DE ESTUDIANTES PRESENCIAL
                System.out.println("Ingrese el número de créditos");
                numeroCreds = entrada.nextInt();
                System.out.println("Ingrese el costo de cada créditos");
                costoCred = entrada.nextDouble();
                entrada.nextLine();
                
                // Mediante los metodos establecer se designan los debidos atributos
                // que necesita el objeto estudiantes
                estudianteP.establecerNombresEstudiante(nombresEst);
                estudianteP.establecerApellidoEstudiante(apellidosEst);
                estudianteP.establecerIdentificacionEstudiante(identificacionEst);
                estudianteP.establecerEdadEstudiante(edadEst);
                estudianteP.establecerNumeroCreditos(numeroCreds);
                estudianteP.establecerCostoCredito(costoCred);
                estudiantes.add(estudianteP);

            } else {


                // SE DECLARA Y SE INICIALIZA EL OBJETO DE TTIPO ESTUDIANTEDISTANCIA
                EstudianteDistancia estudianteD = new EstudianteDistancia();
                
                //PROCESO PARA LLENAR LOS METODOS CORRESPONDIENTES DE ESTUDIANTES A DISTANCIA
                System.out.println("Ingrese el número de asignaturas");
                numeroAsigs = entrada.nextInt();
                System.out.println("Ingrese el costo de cada cada asignatura");
                costoAsig = entrada.nextDouble();
                entrada.nextLine();

                // Mediante los metodos establecer se designan los debidos atributos
                // que necesita el objeto estudiantes
                estudianteD.establecerNombresEstudiante(nombresEst);
                estudianteD.establecerApellidoEstudiante(apellidosEst);
                estudianteD.establecerIdentificacionEstudiante(identificacionEst);
                estudianteD.establecerEdadEstudiante(edadEst);
                estudianteD.establecerNumeroAsginaturas(numeroAsigs);
                estudianteD.establecerCostoAsignatura(costoAsig);

                // SE AGREGA A LA LISTA DE TIPO ARRAYLIST UN OBJETO DE TIPO ESTUDIANTE
                // LO QUE SERIA SU SUBCLASE ESTUDIANTE DISTANCIA
                estudiantes.add(estudianteD);
            }
            
            //PROCESO QUE PERMITE SABER SI EL USUARIO YA QUIERE SALIR DEL PROGRAMA
            System.out.print("\nSi No Desea seguir Agregando Más Estudiantes ¡Pulse La tecla X!: ");
            String seguir = entrada.nextLine();
            System.out.println("");
            
            if (seguir.equals("X") || seguir.equals("x")) {
                bandera = false;
            }
        }

        // ciclo que permite comprobar el polimorfismo
        // este código no debe ser modificado.
        for (int i = 0; i < estudiantes.size(); i++) {
            // 1.  
            estudiantes.get(i).calcularMatricula();

            System.out.printf("Datos Estudiante\n"
                    + "%s\n",
                    estudiantes.get(i));

        }

    
    }
    
}
    
