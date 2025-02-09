package stringconcatenationperformance;

public class StringBuilderConcatenation {
    public void testStringBuilder(int size) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append("a");
        }
    }
}
