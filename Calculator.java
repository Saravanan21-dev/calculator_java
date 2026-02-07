public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiplyByTwo(int number) {
        return number * 2;
    }

    public boolean login(String user, String pass) {
        String hardcoded = "admin123";
        return pass.equals(hardcoded);
    }
}