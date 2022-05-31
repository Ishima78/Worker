


public class Worker {

    @FunctionalInterface
    public interface OneTaskDoneListener {
        void onDone(String result);
    }

    private OneTaskDoneListener callBack;
    private OnTaskErrorListener error;

    public Worker(OneTaskDoneListener callBack, OnTaskErrorListener error) {
        this.callBack = callBack;
        this.error = error;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                error.onError("Task " + i + " fault");
            } else {
                callBack.onDone("Task " + i + " is done");
            }
        }
    }

    @FunctionalInterface
    public interface OnTaskErrorListener {
        void onError(String errorResult);
    }
}
