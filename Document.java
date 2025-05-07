package LabAssignment7_Prototype;

interface Document extends Cloneable {
    Document clone();
    void open();
    String getType();
}
