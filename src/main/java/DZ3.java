public class DZ3 {
    public static void main(String[] args) {
        square(3);
        System.out.println(reverse("Some string"));

        Box box = new Box("Some box");
        System.out.println(box.getValue());

        box.setValue("Changed box value");
        System.out.println(box.getValue());
    }

    /**
     * Square takes an integer n and prints the square of n.
     *
     * @param n an integer
     */
    private static void square(int n) {
        System.out.println(Math.pow(n, 2));
    }

    /**
     * Create a new StringBuilder object with the string s, reverse it, and return the result as a string.
     *
     * @param s the string to reverse
     * @return A new string that is the reverse of the original string.
     */
    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
