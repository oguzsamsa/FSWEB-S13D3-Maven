package org.example;

public class Wall {
    double width;
    double height;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double inputWidth) {
        if (inputWidth < 0) {
            width = 0;
        } else {
            width = inputWidth;
        }
    }

    public void setHeight(double inputHeight) {
        if (inputHeight < 0) {
            height = 0;
        } else {
            height = inputHeight;
        }
    }

    public double getArea() {
        return width * height;
    }

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }
}
