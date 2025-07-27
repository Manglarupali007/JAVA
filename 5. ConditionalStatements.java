public class conditionalStatements {
    public static void main(String[] args) {
        int num = 24;

        // if-else
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }



        // if-else if
        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }


        // switch statement
        int button=2;
        switch(button){
        case 1:
        System.out.println("HELLO");
        break;
        case 2:
        System.out.println("HI");
        break;
        case 3:
        System.out.println("HEY");
        break;
        default:
        System.out.println("Hello Java");
        }
    }
}
