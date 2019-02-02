
public class Array {
    private int fila, columna;
    private long[] array;

    public Array(int fil, int col) {
        this.fila = fil;
        this.columna = col;
        array = new long[fil * col];
    }
    
    public Array(){
        this.fila = 3;
        this.columna = 3;
        array = new long[fila * columna];
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public long[] getArray(){
        return array;
    }

    public void setArray(long[] array) {
        this.array = array;
    }    
    
    
  /*Operaciones*/  
    
    public static Array llenar (double n, double m, Array aux) {
        
        for (int i = 0; i < aux.getFila(); i++) {
            for (int j = 0; j < aux.getColumna(); j++) {
                aux.getArray()[aux.getFila() * j + i] = (long) Math.abs(Math.floor(Math.random() * (n - m + 1) + m));
            }
        }
        return aux;
    }
    
    public static Array Multiplicacion (Array mA, Array mB, Array mC) {
        for (int i = 0; i < mA.getFila(); i++) {
            for (int j = 0; j < mB.getColumna(); j++) {
                for (int k = 0; k < mA.getColumna(); k++) {
                    mC.getArray()[(mC.getFila() * j) + i]
                            += (mA.getArray()[(mA.getFila() * k) + i])
                            * (mB.getArray()[(mB.getFila() * j) + k]);
                }
            }
        }
        return mC;
    }
    
    public static void Imprimir (Array x) {
        for (int i = 0; i < x.getFila(); i++) {
            for (int j = 0; j < x.getColumna(); j++) {
                System.out.print(x.getArray()[x.getFila() * j + i] + "\t");
            }
            System.out.println("");
        }
    }
}
