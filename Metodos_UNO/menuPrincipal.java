import java.util.Scanner;

public class menuPrincipal{

    Scanner entrada = new Scanner(System.in);
    //el 1 es para salir del metodo Salida, el 2 es para cada programa y el 3 es para cerrar todo el programa
    boolean exit1 = true, exit2 = true, exit3 = true;

    //objetos para las clases
    Edad edad = new Edad();
    Figuras figuras = new Figuras();
    Llamada llamada = new Llamada();


    public static void main(String[] args){

        menuPrincipal principal = new menuPrincipal();

        principal.menu();
    }


    //Este es el metodo para salir del bucle 
    public void Salida(){

        String salida = "";
        Scanner entradaS = new Scanner(System.in);

        do{
        System.out.println();
        System.out.println("Si desea cerrar el programa escriba 'X' ");
        System.out.println("Si desea volver al menu inicial escriba 'S' ");
        System.out.println("Si desea repetir el proceso presione 'enter' ");
        salida = entradaS.nextLine();
        System.out.println();

        if(salida.equalsIgnoreCase("X") || salida.equalsIgnoreCase("x")){
            exit1 = false;
            exit2 = false;
            exit3 = false;
        }else{
            if(salida.equalsIgnoreCase("S") || salida.equalsIgnoreCase("s")){
                exit1 = false;
                exit2 = false;
                exit3 = true;
            }else{
                if(salida.equalsIgnoreCase("")){
                    exit1 = false;
                    exit2 = true;
                    exit3 = true;
                }else{
                    System.out.println();
                    System.out.println("==========================================");
                    System.out.println(" Esa opcion no existe, ingresala de nuevo ");
                    System.out.println("==========================================");
                    System.out.println();
                    exit1 = true;
                    }
                }
            }

        }while(exit1 == true);

    }

    //Metodo para el menu
    public void menu(){

        char opcion_menu;

        do{

            System.out.println("Bienvenido al programa, elige una opcion");
            System.out.println("a.- Calculo de edad");
            System.out.println("b.- Calculo para figuras");
            System.out.println("c.- Calculo de costo de llamadas");
            System.out.println("d.- CERRAR PROGRAMA");
            opcion_menu = entrada.next().charAt(0);

            switch (opcion_menu) {
                case 'a':
                do{
                    edad.Datos();
                    edad.calcularEdad();
                    Salida();
                }while(exit2 == true);

                break;

                case 'b':
                do{
                    figuras.menuFiguras();
                    Salida();
                }while(exit2 == true);
                break;

                case 'c':
                do{
                    llamada.menuLlamada();
                    Salida();
                }while(exit2 == true);
                break;

                case 'd': 

                    System.out.println();
                    System.out.println("FINALIZANDO PROGRAMA");
                    System.out.println(".");
                    System.out.println(".");
                    System.out.println(".");
                    System.out.println(".");
                    System.out.println(".");
                    System.out.println(".");
                    System.out.println(".");
                    System.out.println();
                    exit3 = false;

                break;
            
                default:

                    System.out.println();
                    System.out.println("==========================================");
                    System.out.println("  Opcion inexistente, ingresala de nuevo  ");
                    System.out.println("==========================================");
                    System.out.println();

                break;
            }

        }while(exit3 == true);

    }
}