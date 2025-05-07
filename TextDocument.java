package LabAssignment7_Prototype;

public class TextDocument implements Document {
    private String filePath;
    private String encoding;
    private int wordCount;

    public TextDocument() {
        System.out.println("Creating a Text Document prototype.");
    }

    public TextDocument(String filePath, String encoding, int wordCount) {
        this.filePath = filePath;
        this.encoding = encoding;
        this.wordCount = wordCount;
    }

    @Override
    public Document clone() {
        return new TextDocument(filePath, encoding, wordCount);
    }

    @Override
    public void open() {
        System.out.println("\nOpening Text Document: " + filePath + " with encoding: " + encoding + " (" + wordCount + " words)");
        System.out.println("Type: Text, Path: " + filePath + ", Encoding: " + encoding + ", Words: " + wordCount + "\n");
    }

    @Override
    public String getType() {
        return "Text";
    }

    public void setDetails(String filePath, String encoding, int wordCount) {
        this.filePath = filePath;
        this.encoding = encoding;
        this.wordCount = wordCount;
    }
}
