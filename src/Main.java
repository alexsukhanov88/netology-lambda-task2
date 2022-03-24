public class Main {

    public static void main(String[] args) {

        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;

        Worker worker = new Worker(listener, errorListener, 33);
        worker.start();
    }
}
