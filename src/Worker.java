public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;
    private int errorStep;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback, int errorStep) {
        this.callback = callback;
        this.errorCallback = errorCallback;
        this.errorStep = errorStep;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i != errorStep)
                callback.onDone("Task " + i + " is done");
            else
                errorCallback.onError("Task " + i + " is failed");
        }
    }
}