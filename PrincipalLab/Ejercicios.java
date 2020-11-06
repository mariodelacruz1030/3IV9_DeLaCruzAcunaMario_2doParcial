//aqui es donde debemos descubrir el tipo de asociacion entre clases

import java.util.Scanner;

public class Ejercicios{

    //objeto scanner
    Scanner entrada = new Scanner(System.in);

    /*
    Vamos a crear un programa para tener una calculadora
    asi mismo que pueda realizar conversion de unidades
    creacion de cuadritos y movimiento en cuadro
    */

    //vamos a crear el menu
    public void menu(){

        char op;

        System.out.println("Bienvenidos a este programa :3");
        System.out.println("a.- Calculadora");
        System.out.println("b.- Conversion de unidades");
        System.out.println("c.- Creacion de cuadros");
        System.out.println("d.- Movimiento en cuadro");
        System.out.println("Elija la opcion deseada");
        // cuando es caracter si se ocupar charAt(posicion del caracter)
        op = entrada.next().charAt(0);

        //vamos a crear las opciones del menu anterior

        switch(op){

            case 'a':
                //vamos a crear un metodo para la calculadora
                Calculadora();
                break;

            case 'b':
                //vamos a crear un metodo para la conversion de unidades
                Conversion();
                break;

            case 'c':
                //vamos a crear un metodo para la creacion de cuadros
                CreaCuadros();
                break;

            case 'd':
                //vamos a crear un metodo para movimiento en cuadro
                MoviCuadros();
                break;
        }
    }

    //vamos a crear el metodo de la calculadora
    public void Calculadora(){

        //variables
        double numero = 0.00, suma = 0.00, resta = 0.00, multi = 0.00, divi = 0.00;
        char operacion;

        //instrucciones
        System.out.println("Seleccione la operacion deseada");
        System.out.println("a.- Suma");
        System.out.println("b.- Resta");
        System.out.println("c.- Multiplicacion");
        System.out.println("d.- Division");

        operacion = entrada.next().charAt(0);

        switch(operacion){
            case 'a':
                //que sume y sume y sume
                do{
                    System.out.println("Para parar la operacion presione '0'");
                    System.out.println("Ingresa el valor a sumar");
                    numero = entrada.nextDouble();

                    //operacion

                        suma += numero;
                   
                }while((numero!=0));

                System.out.println("La suma de los numeros es de: " +suma);
                break;

            case 'b':
                 //que reste
                 do{
                    System.out.println("Para parar la operacion presione '0'");
                    System.out.println("Ingresa el valor a restar");
                    numero = entrada.nextDouble();

                    //operacion
                        resta -= numero;

                }while((numero!=0));

                System.out.println("La resta de los numeros es de: " +resta);
                break;

            case 'c':
                //multiplicacion
                do{
                    System.out.println("Para parar la operacion presione '0'");
                    System.out.println("Ingresa el valor a multiplicar");
                    numero = entrada.nextDouble();

                    //operacion
                    if(numero >0){
                        multi *= numero;
                    }else{
                        if(numero < 0){
                            System.out.println("Solo positivos");
                        }
                    }

                   
                }while((numero!=0));

                System.out.println("La multiplicacion de los numeros es de: " +multi);
                break;

                case 'd':
                //division
                do{
                    System.out.println("Para parar la operacion presione '0'");
                    System.out.println("Ingresa el valor a dividir");
                    numero = entrada.nextDouble();

                    //operacion
                    if(numero >0){
                        divi /= numero;
                    }else{
                        if(numero < 0){
                            System.out.println("Solo positivos");
                        }
                    }

                    System.out.println("La division de los numeros es de: " +divi);
                   
                }while((numero!=0));

                break;
        }
    }

    public void Conversion(){
        //porque soy chiquito *w*
        /*
        quiero conversiones de:
        metros a cm
        metros a pulgadas
        kilogramos a libras
        kilogramos a onzas
        m/s a KM/s
        */ 


        //variables
        double valor1 = 0.00, valor2 = 0.00;
        char op;

        System.out.println("Elige una opcion: ");
        System.out.println("a.- Metros a Centimetros");
        System.out.println("b.- Metros a pulgadas");
        System.out.println("c.- Kilogramos a Libras");
        System.out.println("d.- Kilogramos a Onzas");
        System.out.println("e.- m/s a KM/s");
        op = entrada.next().charAt(0);

        switch(op){

            case 'a':
            //  m -- cm
                System.out.println("Ingresa el valor en metros");
                valor1 = entrada.nextDouble();

                    valor1 *= 100;

            System.out.println("El valor en centimetros es:  "+ valor1);

            break;

            case 'b':
            //   m -- pulgadas

                System.out.println("Ingresa el valor en metros");
                valor1 = entrada.nextDouble();

                    valor1 *= 39.37;
                
            System.out.println("El valor en pulgadas es:  "+ valor1);
            break;

            case 'c':
            //kilogramos -- libras

                System.out.println("Ingresa el valor en kilogramos");
                valor1 = entrada.nextDouble();

                    valor1 *= 2.205;

            System.out.println("El valor en libras es:  " +valor1);
            break;

            case 'd':
            //kilogramos -- onzas
                System.out.println("Ingresa el valor en kilogramos");
                valor1 = entrada.nextDouble();


                    valor1 *= 350274;

            System.out.println("El valor en onzas es:  " +valor1);

            break;

            case 'e':
            // m/s -- KM/s
                System.out.println("Ingresa el valor de m/s");
                valor1 = entrada.nextDouble();

                    valor1 /= 1000;

            System.out.println("El valor en km/s:  " +valor1);

            break;
        }
    }

    public void CreaCuadros(){
        //porque soy chiquito *w*
        //yo lo hago wiiiiiiii
    }

    public void MoviCuadros(){
        //porque soy chiquito *w*
    }
}