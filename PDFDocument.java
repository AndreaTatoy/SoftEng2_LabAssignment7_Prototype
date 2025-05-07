package LabAssignment7_Prototype;

public class PDFDocument implements Document {
    private String fileName;
    private String author;
    private int pageCount;

    public PDFDocument() {
        System.out.println("Creating a PDF Document prototype.");
    }

    public PDFDocument(String fileName, String author, int pageCount) {
        this.fileName = fileName;
        this.author = author;
        this.pageCount = pageCount;
    }

    @Override
    public Document clone() {
        return new PDFDocument(fileName, author, pageCount);
    }

    @Override
    public void open() {
        System.out.println("\nOpening PDF Document: " + fileName + " by " + author + " (" + pageCount + " pages)");
        System.out.println("Type: PDF, File: " + fileName + ", Author: " + author + ", Pages: " + pageCount + "\n");
    }

    @Override
    public String getType() {
        return "PDF";
    }

    public void setDetails(String fileName, String author, int pageCount) {
        this.fileName = fileName;
        this.author = author;
        this.pageCount = pageCount;
    }
}
