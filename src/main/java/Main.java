import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] Cartas = String[][];
        String[][] Puntajes = String[][];




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
                    break;
                default:
                    System.out.println("Opción Inválida");
            }
        }while (opcion != 2);
    }

    public static String crearMatrizCartas(String Cartas [][]){

    }








}
