package com.company.homework9;

import java.util.Objects;

public class Author {

    private final String firstName;
    private final String lasttName;

    public Author(String firstName, String lasttName) {
        this.firstName = firstName;
        this.lasttName = lasttName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLasttName() {
        return lasttName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(lasttName, author.lasttName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lasttName);
    }

    @Override
    public String toString() {
        return lasttName + " " + firstName;
    }
}
