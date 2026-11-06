import java.lang.ref.WeakReference;

class DemoObject {

    DemoObject() {
        System.out.println("Object Created");
    }

    void display() {
        System.out.println("Object is being used");
    }
}

public class Practical7 {

    public static void main(String[] args)
            throws InterruptedException {

        DemoObject obj = new DemoObject();

        obj.display();

        WeakReference<DemoObject> ref =
            new WeakReference<>(obj);

        // Removing reference
        obj = null;

        System.out.println("Object reference removed");

        // Request Garbage Collection
        System.out.println("Requesting Garbage Collection");

        System.gc();

        Thread.sleep(1000);

        if (ref.get() == null) {
            System.out.println("Object has been garbage collected");
        } else {
            System.out.println("Object is not yet garbage collected");
        }

        System.out.println("Program Finished");
    }
}