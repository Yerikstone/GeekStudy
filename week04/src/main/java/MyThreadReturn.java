public class MyThreadReturn implements Runnable{
    /** 模拟线程执行完毕后主程序要获取的值*/
    private int returnValue = 0;
    @Override
    public void run() {
        System.out.println("线程执行......");
        returnValue = ClassFourApplication.sum();
        System.out.println("线程执行完毕......");
    }
    public int getReturnValue() {
        return returnValue;
    }
}
