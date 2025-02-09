package stringconcatenationperformance;

public class StringConcatenation {
    public void testString(int size) {
        String str = "";
        for (int i = 0; i < size; i++) {
            str += "a"; // Inefficient due to object creation on every iteration
        }
    }
}
