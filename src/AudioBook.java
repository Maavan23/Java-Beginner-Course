public class AudioBook extends Book {
    private int runTime;

    AudioBook(String title, String author, int runTime) {
        super(title, author, 0); // super is reference to the parentclas of our current class

        this.runTime = runTime;
    } 
}
