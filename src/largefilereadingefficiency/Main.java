package largefilereadingefficiency;

public class Main {
    public static void main(String[] args) {
        String[] filePaths = {
                "D:\\CapgBcackUps\\week3_backup\\day6\\src\\largefilereadingefficiency\\1MB.txt",
                "D:\\CapgBcackUps\\week3_backup\\day6\\src\\largefilereadingefficiency\\100MB.txt",
                "D:\\CapgBcackUps\\week3_backup\\day6\\src\\largefilereadingefficiency\\500MB.txt"
        };

        for (String filePath : filePaths) {
            System.out.println("\nTesting file: " + filePath);
            PerformanceTester tester = new PerformanceTester(filePath);
            tester.runTests();
        }
    }
}
