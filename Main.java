public class Main {
    public static void main(String[] args) {
        NumberGenerator generator1 = new NumberGenerator("Generator Number One");
        NumberGenerator generator2 = new NumberGenerator("Generator Number Two");
        Thread t1 = new Thread(generator1);
        Thread t2 = new Thread(generator2);
        t1.setPriority(10);
        t2.setPriority(5);
        t1.start();
        t2.start();
    }
}
