package com.cbfacademy.copier;
public class SourceSpy implements Source {
    private final String data;
    private int index = 0;

    public SourceSpy(String data) {
        this.data = data;
    }

    @Override
    public char getChar() {
        return data.charAt(index++);
    }
}
