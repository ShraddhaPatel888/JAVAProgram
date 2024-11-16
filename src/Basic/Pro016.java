package Basic;

public class Pro016 {
     // yield is use for return the value in switch

    public static void main(String[] args) {
        char code = 'A';
        int val = switch (code){
            case 'A' :
                yield 65;
            case 'B':
                yield 66;
            default:
                System.out.println("Not able to find");
                throw new IllegalStateException("Error");

        };
    }
}
