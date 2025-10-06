package com.pluralsight;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = "";

    }

    public String getIsbn() {
        return isbn;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public boolean checkedOut(String name) {
        if (isCheckedOut) {
            return false;
        } else {
            isCheckedOut = true;
            checkedOutTo = name;
            return true;
        }
    }

    public boolean checkedIn() {
        if (!isCheckedOut) {
            return false;
        } else {
            isCheckedOut = false;
            checkedOutTo = "";
            return true;
        }
    }

    public String availableBookInformation() {
        return id + ", " + isbn + ", " + title;
    }

    public String checkedOutBookInformation() {
        return id + ", " + isbn + ", " + title + ", Checked out to " + checkedOutTo;
    }
}
