import java.util.Scanner;

public class Llamada{

    Scanner entrada = new Scanner(System.in);
    Scanner entradaS = new Scanner(System.in);

    int opcion_menu, opcion;
    String num_telefonico;
    float saldo = 100, apoyo_saldo;
    String cliente;
    int minutos;

    boolean ex1 = true, ex2 = true;


    public void menuLlamada(){

        System.out.println("======================================");
        System.out.println("Bienvenido al menu de atencion JavaCel");
        System.out.println("======================================");
        System.out.println();
        System.out.print("Ingrese su telefono celular:  ");
        num_telefonico = entradaS.nextLine();

        System.out.println();
        System.out.print("Ingrese su nombre:  ");
        cliente = entradaS.nextLine();

        do{
            System.out.println();
            System.out.println("Por favor digame que desea hacer");
            System.out.println();
            System.out.println("1.- Recarga o consulta de saldo");
            System.out.println("2.- Calculo del costo de llamada");
            System.out.println("3.- Cambio de numero o nombre");
            System.out.println("4.- SALIR");
            System.out.println();
            opcion_menu = entrada.nextInt();

            switch (opcion_menu) {
                case 1:
                do{
                    Saldo();
                }while(ex2 == true);
                break;

                case 2: 
                do{
                    Costo();
                }while(ex2 == true);
                break;

                case 3: 
                do{
                    Nombre_Tel();
                }while(ex2 == true);
                break;

                case 4: 

                    System.out.println();
                    System.out.println("==============================");
                    System.out.println("   Gracias por usar JavaCel   ");
                    System.out.println("==============================");
                    System.out.println();
                    ex1 = false;

                break;
        
                default:

                    System.out.println();
                    System.out.println("========================================");
                    System.out.println("Esa opcion no existe, ingresala de nuevo");
                    System.out.println("========================================");
                    System.out.println();

                break;
            }

        }while(ex1 == true);
    }

    public void Saldo(){

        System.out.println();
        System.out.println("1.- Consulta de saldo");
        System.out.println("2.- Recarga de saldo");
        System.out.println();
        opcion = entrada.nextInt();
        System.out.println();

        switch (opcion) {
            case 1:

                System.out.println();
                System.out.println("=========================================================");
                System.out.println("      " + cliente + "  Su saldo total es de:             ");
                System.out.println("                    $ " + saldo );
                System.out.println("=========================================================");
                System.out.println();
                ex2 = false;
                
            break;

            case 2:

                System.out.println();
                System.out.print("Digame de cuanto sera su recarga:    ");
                apoyo_saldo = entrada.nextInt();
                saldo += apoyo_saldo;
                System.out.println();
                System.out.println();
                System.out.println("=========================================================");
                System.out.println("      " + cliente + "  Su nuevo saldo es de:             ");
                System.out.println("                    $ " + saldo );
                System.out.println("=========================================================");
                System.out.println();
                ex2 = false;


            break;
        
            default:

            System.out.println();
            System.out.println("========================================");
            System.out.println("Esa opcion no existe, ingresala de nuevo");
            System.out.println("========================================");
            System.out.println();
            ex2 = true;

            break;
        }



    }

    public void Costo(){

        System.out.println();
        System.out.print("Digame de cuantos minutos fue su llamada:  ");
        minutos = entrada.nextInt();
        System.out.println();

        System.out.println("Elija una opcion");
        System.out.println("1.- Locales Nacionales   ($0.5)");
        System.out.println("2.- Locales Internacionales   ($0.6)");
        System.out.println("3.- Celulares     ($0.2)");
        System.out.println();
        opcion = entrada.nextInt();
        System.out.println();

        switch (opcion) {
            case 1:
                saldo -= (0.5*minutos);
                System.out.println("=========================================================");
                System.out.println("      " + cliente + "  Su nuevo saldo es de:             ");
                System.out.println("                    $ " + saldo );
                System.out.println("=========================================================");
                ex2 = false;

            break;

            case 2:
            saldo -= (0.6*minutos);
            System.out.println("=========================================================");
            System.out.println("      " + cliente + "  Su nuevo saldo es de:             ");
            System.out.println("                    $ " + saldo );
            System.out.println("=========================================================");
            ex2 = false;

            break;

            case 3:
            saldo -= (0.2*minutos);
            System.out.println("=========================================================");
            System.out.println("      " + cliente + "  Su nuevo saldo es de:             ");
            System.out.println("                    $ " + saldo );
            System.out.println("=========================================================");
            ex2 = false;

            break;
        
            default:

            System.out.println();
            System.out.println("========================================");
            System.out.println("Esa opcion no existe, ingresala de nuevo");
            System.out.println("========================================");
            System.out.println();
            ex2 = true;

            break;
        }
    }

    public void Nombre_Tel(){

        System.out.println();
        System.out.println("1.- Cambio de numero celular");
        System.out.println("2.- Cambio de nombre");
        System.out.println();
        opcion = entrada.nextInt();
        System.out.println();

        switch (opcion) {
            case 1:

                System.out.println();
                System.out.print("Ingrese su nuevo numero:  ");
                num_telefonico = entradaS.nextLine();
                System.out.println();
                System.out.println();
                System.out.println(cliente + "  Su nuevo numero de telefono es:  " + num_telefonico);
                System.out.println();
                ex2 = false;

            break;

            case 2:

                System.out.println();
                System.out.print("Ingrese su nuevo nombre:  ");
                cliente = entradaS.nextLine();
                System.out.println();
                System.out.println();
                System.out.println("Ahora su nombre es:  " + cliente);
                System.out.println();
                ex2 = false;

            break;
        
            default:

            System.out.println();
            System.out.println("========================================");
            System.out.println("Esa opcion no existe, ingresala de nuevo");
            System.out.println("========================================");
            System.out.println();
            ex2 = true;

            break;
        }
    }
}