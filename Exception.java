package Exception_handling;

public class Exception {
    static String str;

    public Exception(String msg) {
    }

    public static void main(String[] args) {
        try {
            System.out.println(str.length());
        } catch (NullPointerException ex) {
            ex.printStackTrace();
            System.err.println("Null Poiter Exception"); // we can write the message.
            System.err.println(ex); // Only Give the null value of str.
            System.err.println(ex.getCause()); // cause are give the null direct null ki vjj se aa rh hai..
            System.err.println(ex.getMessage()); // they are give only a message not given the locstion.
        }
        System.out.println("kapil");

    }
}
