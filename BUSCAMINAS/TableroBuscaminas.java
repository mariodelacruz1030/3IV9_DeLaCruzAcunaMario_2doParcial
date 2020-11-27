
public class TableroBuscaminas{

    Casilla[][] casillas;
    int[][] casillas0;

    public int numFilas;
    public int numColumnas;
    int numMinas;

    public TableroBuscaminas(int numColumnas, int numFilas, int numMinas){
        this.numColumnas = numColumnas;
        this.numFilas = numFilas;
        this.numMinas = numMinas;

        incializarCasillas();
        incializarCasillas0();

    }

    public void incializarCasillas(){
        casillas = new Casilla[this.numFilas][this.numColumnas];
        for(int i = 0; i<casillas.length; i++){
            for(int j = 0; j<casillas[i].length; j++){
                casillas[i][j] = new Casilla(i, j);
            }
        }
        generarMinas();
    }

        public void incializarCasillas0(){
            casillas0 = new int[this.numFilas][this.numColumnas];
            for(int i = 0; i<casillas0.length; i++){
                for(int j = 0; j<casillas0[i].length; j++){
                    casillas0[i][j] = 0; 
                }
            }
            actualizarNumMinasAlrededor();
        }

    private void generarMinas(){

        int minasGeneradas = 0;

        while(minasGeneradas != numMinas){
            int posTmpFila = (int) (Math.random()*casillas.length);
            int posTmpColumna = (int) (Math.random()*casillas[0].length);

            if(!casillas[posTmpFila][posTmpColumna].isMina()){
                casillas[posTmpFila][posTmpColumna].setMina(true);
                minasGeneradas++;
            }

        }
    }

    public void imprimirTablero(){
        for(int i = 0; i<casillas.length; i++){
            for(int k = 0; k<casillas[i].length; k++){
                System.out.print("__");
            }
            System.out.print("_");
            System.out.println();
            for(int j = 0; j<casillas[i].length; j++){
               
                System.out.print("|");
                System.out.print(casillas[i][j].isMina()?"*":"0");
            }
                System.out.print("|");
                System.out.println();
        }
    }

    public void imprimirTablero0(){

        for(int i = 0; i<casillas0.length; i++){
            for(int k = 0; k<casillas0[i].length; k++){
                System.out.print("__");
            }
            System.out.print("_");
            System.out.println();
            for(int j = 0; j<casillas0[i].length; j++){
               
                System.out.print("|");
                System.out.print(casillas0[i][j]);
            }
                System.out.print("|");
                System.out.println();
        }
    }

    private void actualizarNumMinasAlrededor(){

        for(int i = 0; i<casillas0.length; i++){
            for(int j = 0; j<casillas0[i].length; j++){
                if (casillas[i][j].isMina()){

                    if(i == 0 && j == 0){

                        casillas0[i+1][j]++;
                        casillas0[i+1][j+1]++;
                        casillas0[i][j+1]++;

                    }else{
                        if(i == (casillas.length-1) && j == (casillas[0].length-1)){

                            casillas0[i-1][j]++;
                            casillas0[i-1][j-1]++;
                            casillas0[i][j-1]++;
                            
                        }else{
                            if(i == 0 && j == (casillas[0].length-1)){

                                casillas0[i+1][j]++;
                                casillas0[i][j-1]++;
                                casillas0[i+1][j-1]++;

                            }else{
                                if(i == (casillas.length-1) && j == 0){

                                    casillas0[i-1][j]++;
                                    casillas0[i][j+1]++;
                                    casillas0[i-1][j+1]++;
                                }else{
                                    if(i == 0 && j <= (casillas[0].length-1)){
                                        
                                        casillas0[i+1][j]++;
                                        casillas0[i+1][j+1]++;
                                        casillas0[i][j+1]++;
                                        casillas0[i][j-1]++;
                                        casillas0[i+1][j-1]++;

                                    }else{
                                        if(i <= (casillas.length-1) && j == 0){

                                            casillas0[i+1][j]++;
                                            casillas0[i-1][j]++;
                                            casillas0[i+1][j+1]++;
                                            casillas0[i][j+1]++;
                                            casillas0[i-1][j+1]++;

                                        }else{
                                            if(i == (casillas.length-1) && j <= (casillas[0].length-1)){

                                                casillas0[i-1][j]++;
                                                casillas0[i-1][j-1]++;
                                                casillas0[i][j+1]++;
                                                casillas0[i][j-1]++;
                                                casillas0[i-1][j+1]++;

                                            }else{
                                                if(i <= (casillas.length-1) && j == (casillas[0].length-1)){
                                                    
                                                    casillas0[i+1][j]++;
                                                    casillas0[i-1][j]++;
                                                    casillas0[i-1][j-1]++;
                                                    casillas0[i][j-1]++;
                                                    casillas0[i+1][j-1]++;

                                                }else{

                                                    casillas0[i+1][j]++;
                                                    casillas0[i-1][j]++;
                                                    casillas0[i+1][j+1]++;
                                                    casillas0[i-1][j-1]++;
                                                    casillas0[i][j+1]++;
                                                    casillas0[i][j-1]++;
                                                    casillas0[i+1][j-1]++;
                                                    casillas0[i-1][j+1]++;
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
    }


    

}