public class Loop {
    public static void main(String[] args) {
        Loop loop = new Loop();
        loop.ex1();
        System.out.println();
        loop.ex2();
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
}
