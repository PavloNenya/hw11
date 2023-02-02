import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EasyCategory {

    public static void main(String[] args) {
        System.out.println(sum(12, 15));
        System.out.println(sum(12)); // 3 + 5 + 6 + 9 + 10 + 12 = 45
        System.out.println(factorial(6)); // 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
        System.out.println(search(3, new Integer[]{5,3,6,7,1,8,2}));
        System.out.println(reverse("Some string"));
        System.out.println(maximum(new Integer[]{3,1,6,2,5,8,12,65,2,64,13}));
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(12);
        arrayList.add(3);
        arrayList.add(7);
        arrayList.add(9);
        System.out.println(average(arrayList));
        List<String> stringList = new ArrayList<>();
        stringList.add("first string");
        stringList.add("SEconD sTRING");
        stringList.add("third STRING");
        stringList.add("fourth string");
        stringList.add("fifth-string");
        System.out.println(upperCase(stringList));
        System.out.println(getElement(arrayList, 2));
        System.out.println(find(new Integer[]{3,1,6,2,5,8,12,65,2,64,13}));
    }

    /**
     * Takes two integers and returns sum.
     *
     * @param i The first number to add.
     * @param j The first number to add.
     * @return The sum of the two integers.
     */
    public static Integer sum(Integer i, Integer j) {
        return i + j;
    }

    /**
     * For every number between 0 and n, if the number is divisible by 3 or 5, add it to the sum.
     *
     * @param n the number to sum up to
     * @return The sum of all the multiples of 3 or 5 below the number passed in.
     */
    public static Integer sum(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i++) {
            if(i%5 == 0 || i%3 == 0)
                sum+=i;
        }
        return sum;
    }

    /**
     * Calculates factorial of number n
     *
     * @param n The number to calculate the factorial of.
     * @return The factorial of the number n.
     */
    public static Integer factorial(Integer n) {
        if(n <= 1) return 1;
        return n*factorial(n-1);
    }

    /**
     * Search for n in list and return the index of the first occurrence of n in list, or -1 if n is not in list.
     *
     * @param n the number we're searching for
     * @param list the array to search
     * @return The index of the first occurrence of the number in the array.
     */
    public static int search(Integer n, Integer[] list) {
        for(int i = 0; i < list.length; i++) {
            if(list[i].equals(n)) return i;
        }
        return -1;
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

    /**
     * If the list is empty, return 0, otherwise, return the largest number in the list.
     *
     * @param list an array of integers
     * @return The maximum value in the array.
     */
    public static Integer maximum(Integer[] list){
        if(list == null || list.length == 0) return 0;
        Integer max = list[0];
        for(Integer i: list) {
            if(max < i){
                max = i;
            }
        }
        return max;
    }

    /**
     * Convert the list of integers to a stream of integers, then map each integer to itself, then get the average of the
     * stream of integers, then get the double value of the average.
     *
     * @param list The list of integers to average
     * @return and average value
     */
    public static Double average(List<Integer> list) {
        return list.stream().mapToInt(x -> x).average().getAsDouble();
    }

    /**
     * Given a list of strings, return a list of the same strings, uppercased.
     *
     * @param list The list to be converted to upper case.
     * @return A list of strings that are all uppercase.
     */
    public static List<String> upperCase(List<String> list) {
        return list.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    /**
     * If the index is out of bounds, return -1, otherwise return the element at the index.
     *
     * @param list a list of integers
     * @param n the index of the element we want to retrieve from the list
     * @return The element at index 2n-1 in the list.
     */
    public static Integer getElement(List<Integer> list, Integer n) {
        int i = 2 * (n-1);
        return i > list.size() - 1 ? -1 : list.get(i);
    }

    /**
     * keep track of the two largest elements we've seen so far, and return the second largest
     *
     * @param arr an array of integers
     * @return The second largest element in the array.
     */
    public static Integer find(Integer[] arr) {
        if(arr.length < 2) return -1;
        int max1 = arr[0];
        int max2 = arr[0];
        for(Integer e: arr) {
            if(e > max1) {
                max2 = max1;
                max1 = e;
            }
            if(e > max2 && e < max1) {
                max2 = e;
            }
        }
        return max2;
    }
}
