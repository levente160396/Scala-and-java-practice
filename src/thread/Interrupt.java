package thread;

public class Interrupt {

    public static void main(String[] args) {
        Thread thread = new Thread(new BlockingTask());

        thread.start();
        thread.interrupt();
    }

    private static class BlockingTask implements Runnable {
        @Override
        public void run() {
            // do things
            try {
                Thread.sleep(100000);
            } catch (InterruptedException e) {
                System.out.println("Exinting blocking thread");
            }
        }
    }
}
