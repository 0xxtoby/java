package thread;

public class InnerThreadDemo {
    public static void main(String[] args) {
        new Thread() {
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.print("T");
                }
            }
        }.start();
        new Thread (new Runnable() {
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.print("2");
                }
            }
        }).start();
        new Runnable() {
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.print("R");
                }
            }
        }.run();
    }

}
