public class Loop {
    public static void main(String[] args) {
        Loop loop = new Loop();
//        System.out.println("ex1");
//        loop.ex1();
//        System.out.println("=======");
//        System.out.println("ex2");
//        loop.ex2();
//        System.out.println("Imona to: ");
//        loop.ex3();
//        loop.ex4();
        loop.doWhileWithContinue();

    }
    public void forLoop1() {
        for( int i = 1; i < 15; i++){
            System.out.println(i);
        }
    }
    public void forLoop2() {
        for( int i = 1; i < 15;){
            i += 2;
            System.out.println(i);
        }
    }
    public void forShortLoop() {
        String[] names = {"Michal", "Adam", "Jurek"};
        for (String name: names) {
            System.out.println(name);
        }
    }
    public void whileLoop() {
        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
    public void doWhileLoop() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
    }
    public void doWhileWithContinue() {
        int i =1;
        do {
            i++;
            if (i == 4) {
                System.out.println("Przerwa w iteracji");
                continue;
            }
        } while (i < 10);
    }
}
