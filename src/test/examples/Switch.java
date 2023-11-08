package test.examples;
public class Switch {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        switch (a) {
            case 1:
                System.out.println("a = 1");
                break;
            case 2:
                System.out.println("a = 2");
                break;
            case 3:
                System.out.println("a = 3");
                break;
            case 4:
                System.out.println("a = 4");
                break;
            case 5:
                System.out.println("a = 5");
                break;
            case 6:
                System.out.println("a = 6");
                break;
            default:
                System.out.println("a > 10");
                break;
        }
    }
}
