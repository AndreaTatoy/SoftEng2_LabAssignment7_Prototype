package LabAssignment7_Prototype;

public class DocumentRegistry {
    private PdfDocument pdfPrototype = new PdfDocument();
    private TextDocument textPrototype = new TextDocument();
    private SpreadsheetDocument spreadsheetPrototype = new SpreadsheetDocument();

    public PdfDocument createPdf(String fileName, String author, int pages) {
        PdfDocument doc = (PdfDocument) pdfPrototype.clone();
        doc.setDetails(fileName, author, pages);
        return doc;
    }

    public TextDocument createText(String filePath, String encoding, int words) {
        TextDocument doc = (TextDocument) textPrototype.clone();
        doc.setDetails(filePath, encoding, words);
        return doc;
    }

    public SpreadsheetDocument createSpreadsheet(String name, int rows, int cols) {
        SpreadsheetDocument doc = (SpreadsheetDocument) spreadsheetPrototype.clone();
        doc.setDetails(name, rows, cols);
        return doc;
    }
}
