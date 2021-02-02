public class App {
    public static void main(String[] args) throws Exception {
        
        Calc c = new Calc();
        System.out.println(c.numeroEscrito("unoo"));
        System.out.println(c.valoresDeNumeros("unoo   Doss"));
        System.out.println(c.proporcional(new int[]{1,2,3}, 60));
        System.out.println(c.metodoFinal("Unoo DOS tress", 60));
    }
}
