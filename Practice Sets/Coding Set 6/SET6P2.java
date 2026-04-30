class MyRunnable implements Runnable {
public void run() {
       for (int i = 1; i<=5; i++) {
System.out.println(Thread.currentThread().getName() + " : " + i);
      }
    }
  }
  public class SET6P2 {
  public static void main(String[] args) {
  MyRunnable obj = new MyRunnable();
  Thread t1 = new Thread(obj);
  t1.setName("Runnable Thread");
  t1.start();
  for (int i = 1; i<=5; i++ ) {
  System.out.println("Main Thread : " + i);
       }
    }
}