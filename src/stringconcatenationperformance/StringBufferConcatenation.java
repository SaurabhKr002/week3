package stringconcatenationperformance;

public class StringBufferConcatenation {
    public void testStringBuffer(int size) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < size; i++) {
            sb.append("a");
        }
    }
}
