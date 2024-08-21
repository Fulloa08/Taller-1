import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        menu();




    }

    public static void menu(){
        int opcion = 0 ;
        Scanner scanner = new Scanner(System.in);
        do {


            System.out.println("-------- MENU PRINCIPAL ------------");
            System.out.println("1. Iniciar Juego");
            System.out.println("2. Salir");

            System.out.println("digite la opción: ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    jugar();
                    break;
                case 2:
                    System.out.println("Saliendo del juego..");
                    break;
                default:
                    System.out.println("Opción Inválida");
            }
        }while (opcion != 2);
    }

    public static String crearMatrizCartas(){
        String[][] cartas = new String[12][2];

        cartas[0][0] = "As"; cartas[0][1] = "11";
        cartas[1][0] = "Dos"; cartas[1][1] = "2";
        cartas[2][0] = "Tres"; cartas[2][1] = "3";
        cartas[3][0] = "Cuatro"; cartas[3][1] = "4";
        cartas[4][0] = "Cinco"; cartas[4][1] = "5";
        cartas[5][0] = "Seis"; cartas[5][1] = "6";
        cartas[6][0] = "Siete"; cartas[6][1] = "7";
        cartas[7][0] = "Ocho"; cartas[7][1] = "8";
        cartas[8][0] = "Nueve"; cartas[8][1] = "9";
        cartas[9][0] = "Diez"; cartas[9][1] = "10";
        cartas[10][0] = "Jota"; cartas[10][1] = "10";
        cartas[11][0] = "Rey"; cartas[11][1] = "10";

        return cartas;

    }

    //public static String agregarCartas (String nombreCarta, String puntaje){


            }

            }


    public static int[] inicializarCartasJuego (){
        int[] mazo = new int[12]
        Random aleatorio = new Random();
        for (int i = 0; i <= 12; i++){
                mazo[i] = i;
            }
        return mazo;
    }

    public static int[] obtenerCartas(int[] mazo){
        Random aleatorio = new Random();
        int[] seleccionadas = new int[3];

        for (int i = 0; i < 3; i++){
            int indiceAleatorio = aleatorio.nextInt(12);
            seleccionadas[i] = mazo[indiceAleatorio];
        }
        return seleccionadas;
    }

    public static void jugar(){
        String[][] cartas = crearMatrizCartas();
        int[] mazo = inicializarCartasJuego();

        int[] cartasSeleccionadas = obtenerCartas(mazo);

        System.out.println(" Cartas Seleccionadas");
        for(int i = 0; i < cartasSeleccionadas.length; i++) {
            System.out.println("Carta " + cartas[cartasSeleccionadas][i][0] + "- Puntaje" + cartas[cartasSeleccionadas[i][1]]);
        }

    }











}
