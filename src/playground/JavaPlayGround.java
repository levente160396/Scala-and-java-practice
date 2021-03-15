package playground;

public class JavaPlayGround {


    /*
           Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // Code that will run in a new thread
            }
        });
     */
    public static void main(String[] args) {
        Thread thread = new NewThread();

        thread.setName(" New Worker Thread");
        thread.setPriority(Thread.MAX_PRIORITY);

        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(){
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("A critical error happened in thread " + t.getName());
            }
        });
        System.out.println("We are in thread: " + Thread.currentThread().getName() + " Before starting a new thread");
        thread.start();
        System.out.println("We are in thread: " + Thread.currentThread().getName() + " after starting a new thread");


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static class NewThread extends Thread {
    @Override
        public void run(){
        System.out.println("We are new in thread" + this.getName());
        System.out.println("Current thread priority is " + Thread.currentThread().getPriority());
     }
    }
}
