public class SomeStackTraceClass {
    public static void main(String[] args) {
        java.lang.StackTraceElement[] stack= Thread.currentThread().getStackTrace();
        try {int a=10;
            int b = 0;
          int summ = a/b;

        }
        catch(Exception e) {
            if (checkCollection(stack)){
                for (java.lang.StackTraceElement element :stack) {
                    System.out.println(element);
                }
            }
        }
    }
    public static boolean checkCollection(java.lang.StackTraceElement[] stack){
        return stack != null;
    }
}