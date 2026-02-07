public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Add: " + calc.add(2, 3));
        System.out.println("Subtract: " + calc.subtract(5, 2));
        System.out.println("Multiply by Two: " + calc.multiplyByTwo(4));
        System.out.println("Login attempt: " + calc.login("user", "admin123"));
    }
}