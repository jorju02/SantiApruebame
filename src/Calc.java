import java.util.ArrayList;
import java.util.List;

public class Calc {
    //Aquí van los métodos
    double to2dec(double valor) {
        return Math.floor(valor * 100) / 100d;
    }
    public int numeroEscrito(String p){
    int r=0;
    String palabra = p.trim().toLowerCase();
    palabra = palabra.replaceAll("(.)\\1", "$1");
    if (palabra.equals("uno")||palabra.equals("1"))
    r=1;
    else if (palabra.equals("dos")||palabra.equals("2"))
    r=2;
    else if (palabra.equals("tres")||palabra.equals("3"))
    r=3;
    else if (palabra.equals("cuatro")||palabra.equals("4"))
    r=4;
    else if (palabra.equals("cinco")||palabra.equals("5"))
    r=5;
    else if (palabra.equals("seis")||palabra.equals("6"))
    r=6;
    else if (palabra.equals("siete")||palabra.equals("7"))
    r=7;
    else if (palabra.equals("ocho")||palabra.equals("8"))
    r=8;
    else if (palabra.equals("nueve")||palabra.equals("9"))
    r=9;

    return r;
    }

    public List<Integer> valoresDeNumeros(String str ) {
        List<Integer> valores = new ArrayList<Integer>();

        //Normalizacion de las palabras
        String[] palabras = str.trim().split("\s+");

        // Por cada palabra se invoca al metodo
        for(int i=0;i<palabras.length;i++){
           // y el valor se añade a una Lista
           valores.add(numeroEscrito(palabras[i]));
        }
        return valores;
    }

    public List<Double> proporcional(int[]s,double valor){
        ArrayList<Double> proporcion = new ArrayList<Double>();
        double suma=0;
        for(int i=0;i<s.length;i++) suma+=s[i];
        for (int i=0;i<s.length;i++){
            double nuevoValor=(s[i]*valor)/suma;
            proporcion.add(nuevoValor);
        }
        return proporcion;
    }

    public List<Double> metodoFinal(String fin,double max){
        List<Integer> valores = new ArrayList<>();
        fin=fin.replaceAll("(.)\\1", "$1");
        String[] palabras = fin.trim().split("\s+");
        // Por cada palabra se invoca al metodo
        for(int i=0;i<palabras.length;i++){
           // y el valor se añade a una Lista
           valores.add(numeroEscrito(palabras[i]));
        }
        ArrayList<Double> solucion = new ArrayList<Double>();
        double suma=0;
        for(int i=0;i<valores.size();i++) suma+=valores.get(i);
        for (int i=0;i<valores.size();i++){
            double nuevoValor=(valores.get(i)*max)/suma;
            solucion.add(to2dec(nuevoValor));
        }

        return solucion;
    }
}
