import java.util.*;

public class TableroFinal extends TableroBuscaminas{

    String[][] tableroFinal;


    public TableroFinal(int numFilas, int numColumnas, int numMinas){

        super(numFilas, numColumnas, numMinas);

        this.tableroFinal = tableroFinal;

        inicializarTFinal();
        ConvertirMatrices();
    }

    public void inicializarTFinal(){

        tableroFinal = new String[numFilas][numColumnas];

        for(int i = 0; i<tableroFinal.length; i++){
            for(int j = 0; j<tableroFinal[i].length; j++){
                tableroFinal[i][j] = "";
            }
        }
    }

    public void ConvertirMatrices(){

        for(int i = 0; i<tableroFinal.length; i++){
            for(int j = 0; j<tableroFinal[i].length; j++){
                if(casillas0[i][j] == 0){
                    tableroFinal[i][j] = "0";
                }else{
                    if(casillas0[i][j] == 1){
                        tableroFinal[i][j] = "1";
                    }else{
                        if(casillas0[i][j] == 2){
                            tableroFinal[i][j] = "2";
                        }else{
                            if(casillas0[i][j] == 3){
                                tableroFinal[i][j] = "3";
                            }else{
                                if(casillas0[i][j] == 4){
                                    tableroFinal[i][j] = "4";
                                }else{
                                    if(casillas0[i][j] == 5){
                                        tableroFinal[i][j] = "5";
                                    }else{
                                        if(casillas0[i][j] == 6){
                                            tableroFinal[i][j] = "6";
                                        }else{
                                            if(casillas0[i][j] == 7){
                                                tableroFinal[i][j] = "7";
                                            }else{
                                                if(casillas0[i][j] == 8){
                                                    tableroFinal[i][j] = "8";
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for(int i = 0; i<tableroFinal.length; i++){
            for(int j = 0; j<tableroFinal[i].length; j++){

                if(casillas[i][j].isMina()){
                    tableroFinal[i][j] = "*";
                }
            }
        }
    }

    public void imprimirTableroFinal(){
        for(int i = 0; i<tableroFinal.length; i++){
            for(int k = 0; k<tableroFinal[i].length; k++){
                System.out.print("__");
            }
            System.out.print("_");
            System.out.println();
            for(int j = 0; j<tableroFinal[i].length; j++){
               
                System.out.print("|");
                System.out.print(tableroFinal[i][j]);
            }
                System.out.print("|");
                System.out.println();
        }
    }
}