package javaapplication6;

class B extends Thread {

    static long counter = 0;

    static void process() {
        B threadOrnegi = new B();
        B threadOrnegi2 = new B();

        B threadOrnegi3 = new B();

        B threadOrnegi4 = new B();

        B threadOrnegi5 = new B();

        B threadOrnegi6 = new B();

        B threadOrnegi7 = new B();

        B threadOrnegi8 = new B();

        B threadOrnegi9 = new B();

        B threadOrnegi10 = new B();
        threadOrnegi.start();
        threadOrnegi9.start();
        threadOrnegi8.start();
        threadOrnegi10.start();
        threadOrnegi7.start();
        threadOrnegi6.start();
        threadOrnegi4.start();
        threadOrnegi5.start();
        threadOrnegi2.start();
        threadOrnegi3.start();

    }

    @Override
    public void run() {
        try {
            for (long i = 0; i < 1000000000; i++) {
                this.counter++;
                System.out.println(this.counter);
            }      
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

}

public class JavaApplication6 {

    public static void main(String[] args) {
        B.process();
    }
}
