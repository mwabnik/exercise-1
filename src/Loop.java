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

    }
    public void ex1() {
        for( int i = 1; i < 15; i++){
            System.out.println(i);
        }
    }
    public void ex2() {
        for( int i = 1; i < 15;){
            i += 2;
            System.out.println(i);
        }
    }
    public void ex3() {
        String[] names = {"Michal", "Adam", "Jurek"};
        for (String name: names) {
            System.out.println(name);
        }
    }

}
