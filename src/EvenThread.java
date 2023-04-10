public class EvenThread extends Thread {
    private String name;
    private Thread t;

    public EvenThread(String name) {
        this.name = name;
        System.out.println("Creating " + name);
    }

    public void run() {
        System.out.println("Running " + name);
        for (int i = 0; i <= 100; i++) {
            try {
                if (i % 2 == 0) {
                    System.out.println("Object name:" + name + ":" + i);
                }
                Thread.sleep(15);
            } catch (InterruptedException e) {
                System.out.println("Thread " + name + " interrupted.");
            }
        }
        System.out.println("Thread " + name + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + name);
        if (t == null) {
            t = new Thread(this, name);
            t.start();
        }
    }

}