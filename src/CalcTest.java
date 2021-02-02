import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.*;

public class CalcTest {
    @Test
    @DisplayName("Nombre")
    public void Test1(){
        //Llamamos a la clase Calculadora
        Calc c = new Calc();
        //resultado varia segun el tipo de método
        int result=c.numeroEscrito("unoo  ");
        assertEquals(1, result);
    }
    @Test
    @DisplayName("Nombre")
    public void Test2(){
        //Llamamos a la clase Calculadora
        Calc c = new Calc();
        //resultado varia segun el tipo de método
        int result=c.numeroEscrito("  uNo  ");
        assertEquals(1, result);
    }
    @Test
    @DisplayName("Nombre")
    public void Test3(){
        //Llamamos a la clase Calculadora
        Calc c = new Calc();
        //resultado varia segun el tipo de método
        int result=c.numeroEscrito("  UNO");
        assertEquals(1, result);
    }

    @Test
    @DisplayName("Numeros")
    public void Test4(){
        //Llamamos a la clase Calculadora
        Calc c = new Calc();
        //resultado varia segun el tipo de método
        List<Integer> result= new ArrayList<Integer>();
        result=c.valoresDeNumeros("unoo   Doss");
        List<Integer> sol= new ArrayList<Integer>(List.of(1, 2));

        assertEquals(sol, result);
    }
    @Test
    @DisplayName("Numeros")
    public void Test5(){
        //Llamamos a la clase Calculadora
        Calc c = new Calc();
        //resultado varia segun el tipo de método
        List<Integer> result= new ArrayList<Integer>();
        result=c.valoresDeNumeros("  hola   Tress");
        List<Integer> sol= new ArrayList<Integer>(List.of(0, 3));
        assertEquals(sol, result);
    }

    @Test
    @DisplayName("Proporción")
    public void Test6(){
        //Llamamos a la clase Calculadora
        Calc c = new Calc();
        //resultado varia segun el tipo de método
        List<Double> result= new ArrayList<Double>();
        result=c.proporcional(new int[]{1,2,3}, 60);
        List<Double> sol= new ArrayList<Double>(List.of(10.00, 20.00,30.00));
        assertEquals(sol, result);
    }
    @Test
    @DisplayName("Final")
    public void TestFinal1(){
        //Llamamos a la clase Calculadora
        Calc c = new Calc();
        //resultado varia segun el tipo de método
        List<Double> result= new ArrayList<Double>();
        result=c.proporcional(new int[]{1,2,3,4}, 100);
        List<Double> sol= new ArrayList<Double>(List.of(10.00, 20.00,30.00,40.00));
        assertEquals(sol, result);
    }
    @Test
    @DisplayName("Final")
    public void TestFinal2(){
        //Llamamos a la clase Calculadora
        Calc c = new Calc();
        //resultado varia segun el tipo de método
        List<Double> result= new ArrayList<Double>();
        result=c.metodoFinal("Unoo DOs SSeiSS", 60);
        List<Double> sol= new ArrayList<Double>(List.of(6.66, 13.33,40.00));
        assertEquals(sol, result);
    }
    @Test
    @DisplayName("Final")
    public void TestFinal3(){
        //Llamamos a la clase Calculadora
        Calc c = new Calc();
        //resultado varia segun el tipo de método
        List<Double> result= new ArrayList<Double>();
        result=c.metodoFinal(  "  1DAW3  SiEtE  nueeVE  3  cinco ", 660);
        List<Double> sol= new ArrayList<Double>(List.of(0.00,192.50, 247.50, 82.50, 137.50));
        assertEquals(sol, result);
    }

    @Test
    @DisplayName("Final")
    public void TestFinal4(){
        //Llamamos a la clase Calculadora
        Calc c = new Calc();
        //resultado varia segun el tipo de método
        List<Double> result= new ArrayList<Double>();
        result=c.metodoFinal(  "  unnoooo  dos 3 CUATRO fin", 15);
        List<Double> sol= new ArrayList<Double>(List.of(1.50, 3.00, 4.50, 6.00, 0.00 ));
        assertEquals(sol, result);
    }
    @Test
    @DisplayName("Final")
    public void TestFinal5(){
        //Llamamos a la clase Calculadora
        Calc c = new Calc();
        //resultado varia segun el tipo de método
        List<Double> result= new ArrayList<Double>();
        result=c.metodoFinal(  "  Cerooo  0  1  990", 60);
        List<Double> sol= new ArrayList<Double>(List.of(0.00, 0.00, 60.00, 0.00));
        assertEquals(sol, result);
    }
    
}
