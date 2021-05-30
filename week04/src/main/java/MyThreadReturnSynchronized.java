public class MyThreadReturnSynchronized implements Runnable{
    /** 模拟线程执行完毕后主程序要获取的值*/
    private int returnValue = 0;
    @Override
    public synchronized void run() {
        System.out.println("线程执行......");
        returnValue = ClassFourApplication.sum();
        System.out.println("线程执行完毕......");
    }
    public synchronized int getReturnValue() {
        return returnValue;
    }
}
