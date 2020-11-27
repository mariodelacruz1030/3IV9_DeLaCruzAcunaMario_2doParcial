import java.util.*;

public class menuPrincipal{


    char opcMenu;

    Scanner entrada = new Scanner(System.in);

    public static void main(String [] args){

        menuPrincipal menuP = new menuPrincipal();

        System.out.println();
        System.out.println("================");
        System.out.println("   BUSCAMINAS   ");
        System.out.println("================");
        System.out.println();

        menuP.menu();

        

    }

    public void menu(){

        boolean cerrar = true;

        System.out.println();
        System.out.println("================");
        System.out.println("   BIENVENIDO   ");
        System.out.println("================");
        System.out.println();


        do{
        System.out.println("Dime que deseas hacer");
        System.out.println("a.  PRINCIPIANTE    7x7    6 minas");
        System.out.println("b.  INTERMEDIO     16x20  18 minas");
        System.out.println("c.  AVANZADO       30X40  30 minas");
        System.out.println("d.  EXPERTO        45X45  60 minas");
        System.out.println("e.  MODO COSMICO ULTRA IMPOSIBLE 45X120 400 MINAS!!!!!");
        System.out.println();
        System.out.println("F.  CERRAR PROGRAMA");
        System.out.println();

        
        opcMenu = entrada.next().charAt(0);


        switch (opcMenu) {
            case 'a':

                Jugador juegoA = new Jugador(7, 7, 6);
                juegoA.tableroPrincipal();
                juegoA.juego();

            break;

            case 'b':
            
                Jugador juegoB = new Jugador(16, 20, 18);
                juegoB.tableroPrincipal();
                juegoB.juego();

            break;

            case 'c':
            
            Jugador juegoC = new Jugador(30, 40, 30);
            juegoC.tableroPrincipal();
            juegoC.juego();

            break;

            case 'd':
            
            Jugador juegoD = new Jugador(45, 50, 60);
            juegoD.tableroPrincipal();
            juegoD.juego();

            break;

            case 'e':
            
            Jugador juegoE = new Jugador(45, 120, 400);
            juegoE.tableroPrincipal();
            juegoE.juego();

            break;

            case 'f':

            cerrar = false;

            break;
        
            default:

            break;
        }
      }while(cerrar == true);
    }
}