import java.util.Scanner;

public class Arreglos{

    Scanner entrada = new Scanner(System.in);
    Scanner entradaS = new Scanner(System.in);
    boolean exit1 = true, exit2 = true, exit3 = true;
    boolean extra = true;

    public static void main(String[] args){

        Arreglos arreglos = new Arreglos();
        arreglos.menu();

        System.out.println("=============================");
        System.out.println("  EL PROGRAMA HA FINALIZADO  ");
        System.out.println("=============================");
    }
    
    //MENU PRINCIPAL
    public void menu(){

        int op = 0;

        do{

            System.out.println();
            System.out.println("Elige una opcion: ");
            System.out.println("1.- Promedio de positivos y negativos");
            System.out.println("2.- Promedio de pocisiones pares");
            System.out.println("3.- Calificaciones");
            System.out.println("4.- Suma de matriz A + B");
            System.out.println("5.- CERRAR PROGRAMA");
            op = entrada.nextInt();
            System.out.println();

            switch (op) {

                case 1:
                    opc1();
                break;

                case 2:
                    opc2();
                break;

                case 3: 
                    opc3();
                break;

                case 4:
                    opc4();
                break;

                case 5:
                    exit3 = false;
                break;

                default:

                System.out.println();
                System.out.println("Esa opcion no existe, ingresala de nuevo");
                System.out.println();
                exit3 = true;

                break;
            }

        }while(exit3 == true);
    }

    //METODO PARA SALIR O REPETIR EL PROGRAMA
    public void Salida(){

        String salida = "";

        do{
        System.out.println();
        System.out.println("Si desea cerrar el programa escriba 'X' ");
        System.out.println("Si deseavolver al menu inicial escriba 'S' ");
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
                    System.out.println("Esa opcion no existe, ingresala de nuevo");
                    System.out.println();
                    exit1 = true;
                    }
                }
            }

        }while(exit1 == true);
    }
    
    //PROMEDIO NUMEROS + -
    public void opc1(){

        do{
            double num[] = new double[10];
            double negativos = 0.00, positivos = 0.00;
            int contador = 0;


        for( int i = 0; i<num.length; i++){
            System.out.println("Dame el valor #" + (i+1));
            num[i] = entrada.nextDouble();
        }

        for( int i = 0; i<num.length; i++){
            if(num[i] > 0 ){
                contador++;
                positivos += num[i];
            }else{
                negativos+= num[i];
            }
        }

        positivos /= contador;
        negativos /= (10-contador);

        System.out.println();
        System.out.println("El promedio de los numeros positivos es de:  " + positivos);
        System.out.println("El promedio de los numeros negativos es de:  " + negativos);
        System.out.println();
        
        Salida();
        }while(exit2 == true);
    }

    //PROMEDIO EN POSICION PAR
    public void opc2(){
        do{
            int num = 0;
            double promed  = 0.00;

            System.out.println();
            System.out.print("Dime cuantos numeros deseas ingresar: ");
            num = entrada.nextInt();
            System.out.println();

            int valores[] = new int[num];
            //IGUALO A NUM CON 0 PARA USARLA EN EL PROMEDIO
            num = 0;

            for(int i = 0; i<valores.length; i++){

                System.out.print("Dame el valor de posicion #" + i + ":  ");
                valores[i] = entrada.nextInt();
                System.out.println();

                if(i%2 == 0 || i == 0){
                    promed += valores[i];
                    num++;
                }
            }
            promed /= num;

            System.out.println("El promedio de los numeros en posiciones pares es de:  " + promed);
            System.out.println();
            Salida();

        }while(exit2 == true);
    }

    //CALIFICACIONES
    public void opc3(){
        do{
            //CANTIDAD DE ALLUMNOS
            int n = 0;
            int aprobados = 0, reprobados = 0;
            double mayor = 0, menor = 0;
            double prom = 0;

            System.out.println();
            System.out.print("Primero dime cuantas calificaciones deseas ingresar: ");
            n = entrada.nextInt();
            System.out.println();
                //CALIFICACIONES
                double calif[] = new double[n];

            for(int i = 0; i<calif.length; i++){

                do{
                System.out.println();
                System.out.print("Dame la calificacion #" + (i+1) + ":  ");
                calif[i] = entrada.nextDouble();
                System.out.println();

                if(calif[i] > 10 || calif[i] < 0){
                    System.out.println("La calificacion no puede ser menor a 0 ni mas de 10");
                    System.out.println("Ingresala nuevamente");
                    extra = true;
                }else{
                    extra = false;
                }
                }while(extra == true);
                extra = true;
            }
            mayor = menor = calif[0];
            
            for(int i = 0; i<calif.length; i++){
                if(calif[i] > mayor) {
                    mayor = calif[i];
                }
                if(calif[i]<menor) {
                    menor = calif[i];
                }
            }
            System.out.println();
            System.out.println("CALIFICACIONES");
            System.out.println();
            for(int i = 0; i<calif.length; i++){
                System.out.println("  #" + (i+1) + ":   " + calif[i]);
                if(calif[i]<6){
                    reprobados++;
                }
                if(calif[i]>=6){
                    aprobados ++;
                }
                prom += calif[i];
            }

            prom = prom/n;
            System.out.println();
            System.out.println("El promedio total es de:  " + prom);
            System.out.println("Hay en total " + aprobados + " aprobados");
            System.out.println("Hay en total " + reprobados + " reprobados");
            //igualo a 'n' con 0 para usarla
            n = 0;
            for(int i = 0; i<calif.length; i++){

                if(calif[i]>=prom){
                    //TOMO A 'N' PARA CONTAR CUANTOS FUERON SUPERIORES AL PROMEDIO
                    n++;
                }
            }
            System.out.println(n + " Alumnos superaron el promedio");
            System.out.println("La calificacion mayor fue:  " + mayor);
            System.out.println("La calificacion menor fue:  " + menor);
            System.out.println();
            Salida();

        }while(exit2 == true);
    }

    //SUMA DE MATRICES
    public void opc4(){
        do{

            double A[][] = new double[3][3];
            double B[][] = new double[3][3];
            double S[][] = new double[3][3];

            System.out.println();
            System.out.println("PRIMERA MATRIZ");

            for(int i = 0; i<A.length; i++){
                for(int j = 0; j<A.length; j++){
                    System.out.print("Dame el valor en fila #" + (i+1) + ", Columna #" + (j+1) + ":  ");
                    A[i][j] = entrada.nextInt();
                    System.out.println();
                }
            }

            System.out.println();
            System.out.println("SEGUNDA MATRIZ");
            for(int i = 0; i<B.length; i++){
                for(int j = 0; j<B.length; j++){
                    System.out.print("Dame el valor en fila #" + (i+1) + ", Columna #" + (j+1) + ":  ");
                    B[i][j] = entrada.nextInt();
                    System.out.println();
                }
            }

            System.out.println("La suma de la matriz 'A' : ");

            for(int i = 0; i<A.length; i++){
                System.out.print(" | ");
                for(int j = 0; j<A.length; j++){
                    System.out.print(A[i][j] + " | ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println(" Y la matriz 'B' : ");

            for(int i = 0; i<B.length; i++){
                System.out.print(" | ");
                for(int j = 0; j<B.length; j++){
                    System.out.print(B[i][j] + " | ");
                }
                System.out.println();
            }

            //AQUI SE SUMAN LAS MATRICES
            for(int i = 0; i<S.length; i++){
                for(int j = 0; j<S.length; j++){
                    S[i][j] = (A[i][j]+B[i][j]);
                }
            }

            System.out.println();
            System.out.println("Es igual a la matriz:  ");
            System.out.println();
            for(int i = 0; i<S.length; i++){
                System.out.print(" | ");
                for(int j = 0; j<S.length; j++){
                    System.out.print(S[i][j] + " | ");
                }
                System.out.println();
            }
            System.out.println();

            Salida();
        }while(exit2 == true);
    }

}