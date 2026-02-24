public class CalculatorMain {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int a = 10;
        int b = 20;
        System.out.println("Additions:"+c.add(a, b));
        System.out.println("Subtraction" + c.sub(a, b));
    }
}
