class DaemonThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Daemon thread is running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}

public class SET6P9 {
    public static void main(String[] args) throws InterruptedException {
        DaemonThread t1 = new DaemonThread();

        t1.setDaemon(true); // set daemon
        t1.start();

        // Main thread runs for few seconds
        Thread.sleep(3000);
        System.out.println("Main thread ends.");
    }
}
