package linearsearch.searchwordinsentences;

public class SearchWordInSentences {
    public static void main(String[] args) {
        // Sample array of sentences
        String[] sentences = {
                "I am a Student.",
                "I am a Professor.",
                "I am an Engineer.",
                "My name is saurabh Kumar."
        };

        // Word to search for
        String targetWord = "saurabh";

        // Call the function to search for the first sentence containing the word
        String result = findSentenceContainingWord(sentences, targetWord);

        // Print the result
        System.out.println(result);
    }

    // Function to find the first sentence containing the target word
    public static String findSentenceContainingWord(String[] sentences, String targetWord) {
        // Iterate through the sentences
        for (String sentence : sentences) {
            // Check if the sentence contains the target word
            if (sentence.toLowerCase().contains(targetWord.toLowerCase())) {
                return sentence; // Return the first matching sentence
            }
        }
        // Return "Not Found" if the word is not found in any sentence
        return "Not Found";
    }
}
