


public class Main {
    public static void main(String[] args) {
        Worker.OneTaskDoneListener listener = System.out::println;
        Worker.OnTaskErrorListener error = System.out::println;
        Worker worker = new Worker(listener, error);
        worker.start();
    }
}