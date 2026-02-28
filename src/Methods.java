public class Methods {

    static void greet(String name) {
        System.out.println("Hello, " + name);
    }

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        greet("Atharv");
        System.out.println("Sum: " + add(5, 10));
    }
}
