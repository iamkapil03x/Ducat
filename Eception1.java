package Exception_handling;

public class Eception1 {
    public static void main(String[] args) {
        String str = "Micro Rider";
        int arr[] = { 1, 22, 3, 4, 5, 6, 7 };
        try {
            System.out.println(str.length());
            System.out.println(arr[2]);
            System.out.println(100 / 0);
            System.out.println("Namaste Bharat");
            System.out.println("Nmaste India");
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        } catch (ArithmeticException ex) {
            System.err.println("Arithmatic Exception ");
        }
        System.out.println("Hello Kapil");
        System.out.println("How are you Mr.");
    }
}
