import java.util.Scanner;

public class Figuras{

    Scanner entrada = new Scanner(System.in);
    double altura, base;
    double area, perimetro;
    int opcion;
    boolean ex = true;

    public void menuFiguras(){

        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("                Calculo de areas y perimetros               ");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        
        do{
        System.out.println();
        System.out.println("Elija una de las siguientes opciones:");
            System.out.println("1.- Calcular area y perimetro de un cuadrado");
            System.out.println("2.- Calcular area y perimetro de un rectangulo");
            System.out.println("3.- Calcular area y perimetro de un triangulo");
            System.out.println("4.- Calcular area y perimetro de un circulo");
            System.out.println();
        opcion = entrada.nextInt();
        System.out.println();

        switch (opcion) {
            case 1:
                cuadrado();
            ex = false;
            break;

            case 2: 
                rectangulo();
            ex = false;
            break;

            case 3:
                triangulo();
            ex = false;
            break;

            case 4: 
                circulo();
            ex = false;
            break;

            default:

            System.out.println();
            System.out.println("Opcion inexistente, ingresala de nuevo");
            System.out.println();
            ex = true;

            break;
        }
      }while(ex == true);
    }

    public void circulo(){

        System.out.println("Ingresa el valor del radio");
            base = entrada.nextDouble();
                while(base <=0 ){
                System.out.println("El valor no puede ser 0 ni negativo, por favor ingresalo de nuevo");
                base = entrada.nextDouble();
                }
                    area = (3.14159265)*(base*base);
                    perimetro = (2)*(3.14159265)*(base);
                System.out.println("");
            System.out.println("-------------------------------");
            System.out.println("El area es: "+area);
            System.out.println("El perimetro es: "+perimetro);
            System.out.println("-------------------------------");
                System.out.println("");

    }

    public void triangulo(){

        System.out.println("Ingresa el valor de la base");
            base = entrada.nextDouble();
                while(base <=0 ){
                System.out.println("El valor no puede ser 0 ni negativo, por favor ingresalo de nuevo");
                base = entrada.nextDouble();
                }
                System.out.println("Ingresa el valor de  la altura");
                altura = entrada.nextDouble();
                    while(altura <=0 ){
                    System.out.println("El valor no puede ser 0 ni negativo, por favor ingresalo de nuevo");
                    altura = entrada.nextDouble();
                    }
                    area = (base*altura)/2;
                    /*
                    Para conocer el perimetro es necesario conocer todos sus lados, 
                    al ser la unica figura que lo necesita preferí declarar las variables
                    aqui mismo
                    */
                    double l2, l3;
                    System.out.println("Para conocer el perimetro necesito conocer la medida de los otros lados");
                    System.out.println("Ingresa el valor del segundo lado");
                    l2 = entrada.nextDouble();
                    while(l2 <=0 ){
                        System.out.println("El valor no puede ser 0 ni negativo, por favor ingresalo de nuevo");
                        l2 = entrada.nextDouble();
                        }
                    System.out.println("Ingresa el valor del tercer lado");
                    l3 = entrada.nextDouble();
                    while(l3 <=0 ){
                        System.out.println("El valor no puede ser 0 ni negativo, por favor ingresalo de nuevo");
                        l3 = entrada.nextDouble();
                        }
                    perimetro = base+l2+l3;
                System.out.println("");
            System.out.println("-------------------------------");
            System.out.println("El area es: "+area);
            System.out.println("El perimetro es: "+perimetro);
            System.out.println("-------------------------------");
                System.out.println("");

    }

    public void cuadrado(){

        System.out.println("Ingresa el valor de un lado");
        base = entrada.nextDouble();      
               while(base <=0 ){
           System.out.println("El valor no puede ser 0 ni negativo, por favor ingresalo de nuevo");
           base = entrada.nextDouble();
               }
               area = base*base;
               perimetro = base*4;

           System.out.println("");
       System.out.println("-------------------------------");
       System.out.println("El area es: "+area);
       System.out.println("El perimetro es: "+perimetro);
       System.out.println("-------------------------------");
           System.out.println("");

    }

    public void rectangulo(){

        System.out.println("Ingresa el valor de la base");
        base = entrada.nextDouble();
        while(base <=0 ){
            System.out.println("El valor no puede ser 0 ni negativo, por favor ingresalo de nuevo");
            base = entrada.nextDouble();
                }
        System.out.println("Ingresa el valor de  la altura");
        altura = entrada.nextDouble();
            while(altura <=0 ){
            System.out.println("El valor no puede ser 0 ni negativo, por favor ingresalo de nuevo");
            altura = entrada.nextDouble();
            }
                area = base*altura;
                perimetro = (base*2)+(altura*2);
            System.out.println("");
        System.out.println("-------------------------------");
        System.out.println("El area es: "+area);
        System.out.println("El perimetro es: "+perimetro);
        System.out.println("-------------------------------");
            System.out.println("");

    }
}