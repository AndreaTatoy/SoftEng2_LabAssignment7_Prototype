package LabAssignment7_Prototype;

public class SpreadsheetDocument implements Document {
    private String spreadsheetName;
    private int rowCount;
    private int columnCount;

    public SpreadsheetDocument() {
        System.out.println("Creating a Spreadsheet Document prototype.");
    }

    public SpreadsheetDocument(String name, int rows, int cols) {
        this.spreadsheetName = name;
        this.rowCount = rows;
        this.columnCount = cols;
    }

    @Override
    public Document clone() {
        return new SpreadsheetDocument(spreadsheetName, rowCount, columnCount);
    }

    @Override
    public void open() {
        System.out.println("\nOpening Spreadsheet Document: " + spreadsheetName + " (" + rowCount + " rows, " + columnCount + " columns)");
        System.out.println("Type: Spreadsheet, Name: " + spreadsheetName + ", Rows: " + rowCount + ", Columns: " + columnCount + "\n");
    }

    @Override
    public String getType() {
        return "Spreadsheet";
    }

    public void setDetails(String name, int rows, int cols) {
        this.spreadsheetName = name;
        this.rowCount = rows;
        this.columnCount = cols;
    }
}
