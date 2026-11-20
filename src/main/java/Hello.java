public class Hello {
    public static void main(String[] args) {
        String environment = System.getenv("APP_ENV");

        System.out.println("Hello Rasmus");
        System.out.println("Environment: " + environment);
    }
}