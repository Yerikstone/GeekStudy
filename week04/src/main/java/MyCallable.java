import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() {
        System.out.println("线程执行......");
        int returnValue = ClassFourApplication.sum();
        System.out.println("线程执行完毕......");
        return returnValue;
    }
}
