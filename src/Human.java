public class Human {
    void run(){
        System.out.println("Human can eat!");
    }

}

class Dilshan extends  Human{

    void run() {
        System.out.println("Dilshan can eat!");
    }

    public static void main(String[] args) {
        Dilshan d = new Dilshan();
        d.run();
    }
}

