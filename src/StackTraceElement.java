public class StackTraceElement {
    public static void main(String[] args) {

        java.lang.StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        for (java.lang.StackTraceElement element : stack) {
            System.out.println(element);
            exp();
        }
    }

    public static void exp() {
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }
}
