public class Nemo{	
    static String array(String a[]) {
        for (int i = 0; i <= 1; i++) {
            if (a[i] == "nemo") {
                return "nemo is here";
            }
        }
        return "Nemo is not here";
    }

    public static void main(String[] args) {
        String b[] = { "nemo","hello","bob","david","barley","sweets","myuko" };
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println(array(b));
        System.out.println("Execution time in milliseconds : " + timeElapsed / 1000000);

    }
}
