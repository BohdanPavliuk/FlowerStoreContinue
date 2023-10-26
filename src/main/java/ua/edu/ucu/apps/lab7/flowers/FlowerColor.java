package ua.edu.ucu.apps.lab7.flowers;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FlowerColor {
    RED("red"), GREEN("green"), BLUE("blue");

    private String label;
    FlowerColor(String label) {
        this.label = label;
    }

    public String toString(){
        return label;
    }

    @JsonValue
    public String getValue() {
        return label;
    }
}
