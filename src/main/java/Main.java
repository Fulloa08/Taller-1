import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        String[] Cartas = String[];
        int[][] Puntajes = String[][];

        menu();




    }

    public static void menu(){
        int opcion = 0 ;
        do {
            Scanner scanner = new Scanner(System.in);

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

    public static String crearMatrizCartas(String Cartas [][]){
        String[][] Cartas = new String[12][2];

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






    }

    public static String agregarCartas (String nombreCarta, String puntaje){


            }

            }
        }
    }

    public static void inicializarCartasJuego (){
        int[] mazo = String[12]
        Random aleatorio = new Random();
        for (int i = 1; i <= 11; i++){
                mazo[i] = aleatorio.nextInt(11);
            }
        return mazo;
    }

    public static void obtenerCartas(int[] mazo){
        int[] mazo;
        random = random.sample(mazo,3)

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










}
