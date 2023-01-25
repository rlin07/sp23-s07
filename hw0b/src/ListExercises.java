import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        if (L.isEmpty()) {
            return 0;
        } else{
            int sum = 0;
            for (int i : L) {
                sum = sum + i;
        }
            return sum;
    }


    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
            for (int i = 1; i <= L; i++) {
                if (i % 2 == 0) {
                    return i;
                } else return null;
            }
        }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        if (L1.retainAll(L2).size()<L1.size()) {
            return L1.retainAll(L2);
        }else{
        return null;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
    return 0;
    }
