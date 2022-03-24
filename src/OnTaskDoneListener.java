@FunctionalInterface
public interface OnTaskDoneListener<I> {
    void onDone(String result);
}