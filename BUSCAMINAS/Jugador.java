import java.util.*;

public class Jugador extends TableroFinal{

    Scanner entrada = new Scanner(System.in);

    int opcFila;
    int opcColumna;
    String[][] mCasilla;

    boolean winLose = true;

    public Jugador(int numFilas, int numColumnas, int numMinas){
        super(numFilas, numColumnas, numMinas);
        inicializarTJuego();
    }

    public void inicializarTJuego(){

        mCasilla = new String[numFilas][numColumnas];

        for(int i = 0; i<mCasilla.length; i++){
            for(int j = 0; j<mCasilla[i].length; j++){
                mCasilla[i][j] = "/";
            }
        }
    }

    public void tableroPrincipal(){

        System.out.println();
        System.out.println("Este sera tu tablero de juego: ");
        System.out.println();

        for(int i = 0; i<(tableroFinal.length); i++){
            System.out.print("   " + (i+1));
        }

        System.out.println();
        for(int i = 0; i<(tableroFinal.length); i++){
            System.out.print((i+1) + " ");
            for(int j = 0; j<tableroFinal[i].length; j++){
                System.out.print("|" +  mCasilla[i][j] + "| ");

            }
            System.out.println();
        }
    }

    public void juego(){
        mostrar_casilla:
        do{
        System.out.println();
        System.out.print("Digame la fila:  ");
        do{
        opcFila = entrada.nextInt();
    
        if(opcFila <= 0 || opcFila>tableroFinal[0].length){
            System.out.println();
            System.out.print("Fila inexistente, ingresala de nuevo: ");
            }
        }while(opcFila>tableroFinal[0].length || opcFila<=0);

        System.out.println();
        System.out.print("Digame la columna: ");
        do{
        opcColumna = entrada.nextInt();

        if(opcColumna <= 0 || opcColumna>tableroFinal[0].length){
            System.out.println();
            System.out.print("Columna inexistente, ingresala de nuevo: ");
        }
        }while(opcColumna>tableroFinal[0].length || opcColumna<=0);


        for(int i = 0; i<(mCasilla.length); i++){
            System.out.print("   " + (i+1));
        }

        System.out.println();
        for(int i = 0; i<(mCasilla.length); i++){
            System.out.print((i+1) + " ");
            for(int j = 0; j<mCasilla[i].length; j++){
                if((opcFila-1) == i && (opcColumna-1) == j){
                    mCasilla[i][j] = tableroFinal[i][j];
                    System.out.print("|" + mCasilla[i][j] + "| ");
                }else{
                    System.out.print("|" + mCasilla[i][j] + "| ");
                }
            }
            System.out.println();
        }

        if(tableroFinal[(opcFila-1)][(opcColumna-1)] == "*"){
            System.out.println();
            System.out.println("//////////////");
            System.out.println("   PERDISTE   ");
            System.out.println("/////////////");
            System.out.println();
            winLose = false;
        }else{
            for(int i = 0; i<mCasilla.length; i++){
                for(int j = 0; j<mCasilla[i].length; j++){
                    if(mCasilla[i][j] != "/" || tableroFinal[i][j] == "*"){

                        winLose = false;
                    }else{
                        winLose = true;
                        continue mostrar_casilla;
                    }
                }
            }
            System.out.println();
            System.out.println("=============");
            System.out.println("   GANASTE   ");
            System.out.println("=============");
            System.out.println();
        }

        }while(winLose == true);
    }

}