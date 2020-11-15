import java.util.Scanner;

public class Edad{
    
    Scanner entrada = new Scanner(System.in);
    Scanner entradaS = new Scanner(System.in);

    String nombre;
    int year, mes, dia;
    //Los siguientes son para decir cuantos años, dias y meses tiene la persona
    int eyear, emes, edia;
    //variable de ayuda para bucles
    boolean ex = true;

    public void Datos(){

        System.out.println("Bienvenido, ingresa los datos que se te piden a continuacion");
        System.out.println();
        System.out.print("Dime tu nombre completo:   ");
            nombre = entradaS.nextLine();

        do{
        System.out.println();
        System.out.print("Dime tu año de nacimiento:   ");
            year = entrada.nextInt();
            
                if(year > 2020 || year<1920){
                    System.out.println("ERROR");
                    System.out.println("Ese año aun no pasa");
                    System.out.println("No puede tener mas de 100 años y usar una computadora, por favor ingrese un año real");
                    ex = true;
                }else{
                    ex = false;
                }
            }while(ex == true);

        do{
        System.out.println();
        System.out.print("Dime tu mes de nacimiento en formato numerico:   ");
            mes = entrada.nextInt();

            if(mes > 12 || mes < 1){
                System.out.println("ERROR");
                System.out.println("Ese numero de mes no existe en nuestr calendario");
                ex = true;
                }else{
                    ex = false;
                }

        }while(ex == true);

        do{
        System.out.println();
        System.out.print("Dime tu dia de nacimiento:   ");
            dia = entrada.nextInt();   
        
            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                if(dia > 31 || dia < 1){
                    System.out.println("Ese dia no es posible en el mes que ingresaste, ingresalo de nuevo");
                    ex = true;
                }else{
                    ex = false;
                }
            }else{
                if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
                    if(dia > 30 || dia < 1){
                        System.out.println("Ese dia no es posible en el mes que ingresaste, ingresalo de nuevo");
                        ex = true;
                    }else{
                        ex = false;
                    }
                }else{
                    if(mes == 2){
                        if(dia < 1 || dia > 29){
                            System.out.println("Ese dia no es posible en el mes que ingresaste, ingresalo de nuevo");
                            ex = true;
                        }else{
                            ex = false;
                        }
                    }
                }
            }


        }while(ex == true);
    }

    public void calcularEdad(){

        if(year == 2020 && dia == 15 && mes == 11){
            System.out.println(nombre+ "  Usted tiene 0 dias, 0 años y 0 meses de vida");
        }

        if(year == 2020 && mes == 11){
            edia=(15-dia);
            System.out.println(nombre+ "  Usted tiene 0 años, 0 meses y " + edia +" dias de vida");
        }

        if(year == 2020){
            eyear = 0;
            emes = (11-mes);
            if(dia == 15){
                edia = 0;
            }
                
            if(dia>15){
                emes--;
                if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
                        edia = (30-dia)+15;
                }else{
                    if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                        edia = (31-dia)+15;
                    }else{
                        edia = (29-dia)+15;
                    }
                }
            }

            if(dia<15){
                edia = (15-dia);
            }
        }

        if(year != 2020){
            eyear = (2020-year);
            if(mes == 11 && dia == 15){
                System.out.println(nombre + "  Usted tiene "+ eyear + " años, 0 meses y 0 dias de vida");
                System.out.println("FELIZ CUMPLEAÑOS!!!");
            }else{
                if(mes == 11 && dia != 15){
                    if(dia>15){
                        eyear--;
                        edia=(30-dia)+15;
                        System.out.println(nombre + "  Usted tiene " + eyear + " años, 11 meses y " + edia + " dias");
                    }else{
                        edia=(15-dia);
                        System.out.println(nombre + "  Usted tiene " + eyear + " años, 0 meses y " + edia + " dias");
                    }
                }else{
                    emes = (11-mes);
                    if(dia == 15){
                        System.out.println(nombre + "  Usted tiene " + eyear + " años, "+ emes + " meses y 0 dias");
                    }else{
                        if(dia<15){
                            edia = (15-dia);
                            System.out.println(nombre + "  Usted tiene " + eyear + " años, "+ emes + " meses y " + edia + " dias");
                        }else{
                            emes--;
                            edia = (30-dia)+15;
                            System.out.println(nombre + "  Usted tiene " + eyear + " años, "+ emes + " meses y " + edia + " dias");
                        }
                    }

                }
            }
        }

        System.out.println("*****             ********           *****");
        System.out.println("*                                        *");
        System.out.println("* LA FECHA EXACTA PUEDE VARIAR UNOS DIAS *");
        System.out.println("*                                        *");
        System.out.println("*****             ********           *****");


    }

}