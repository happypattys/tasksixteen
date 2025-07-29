interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

public class Gorilla implements Animal {
    public boolean feed(boolean timeToEat) {
        System.out.println("put gorilla food into cage");
        return timeToEat;
    }

    public void groom() {
        System.out.println("lather, rinse, repeat");
    }

    public void pet() {
        System.out.println("pet at your own risk");
    }

    public static void main(String[] args) {
        Gorilla g = new Gorilla();
        g.feed(true);
        g.groom();
        g.pet();
    }
}
