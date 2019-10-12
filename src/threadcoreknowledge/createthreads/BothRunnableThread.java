package threadcoreknowledge.createthreads;

/**
 * 同时使用Runnable和Thread两种实现线程的方式
 * 下面的run()将源代码中的那包括target的三行覆盖了。
 */
public class BothRunnableThread {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我来自Runnable");
            }
        }){
            @Override
            public void run() {
                System.out.println("我来自Thread");
            }
        }.start();
    }
}
