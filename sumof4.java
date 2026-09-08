 public class sumof4 {
    public static void main(String[] args) {
        int num = 1234;

        int a = num / 1000;
        int b = (num / 100) % 10;
        int c = (num / 10) % 10;
        int d = num % 10;

        int sum = a + b + c + d;

        System.out.println("Sum of digits = " + sum);
    

}
}
