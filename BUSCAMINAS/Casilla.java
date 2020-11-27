
public class Casilla{

    private int posFila;
    private int posColumna;
    private boolean mina;

    private int numMinasAlrededor;

    public Casilla(int posColumna, int posFila){
        this.posColumna = posColumna;
        this.posFila = posFila;
    }


    public void setPosFila(int posFila){
        this.posFila = posFila;
    }

    public int getPosFila(){
        return posFila;
    }

    public void setPosColumna(int posColumna){
        this.posColumna = posColumna;
    }

    public int getPosColumna(){
        return posColumna;
    }

    public void setMina(boolean mina){
        this.mina = mina;
    }

    public boolean isMina(){
        return mina;
    }



}