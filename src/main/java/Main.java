public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(11,21));
        System.out.println(calc.pow(6,6));
        System.out.println(calc.mult(11,21));
        System.out.println(calc.div(1000,10));
    }
}
