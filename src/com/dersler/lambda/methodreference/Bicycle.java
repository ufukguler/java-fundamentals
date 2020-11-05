package com.dersler.lambda.methodreference;

import java.util.Objects;

/**
 * created by: ufuk on 5.11.2020 18:14
 */
public class Bicycle {

    private String brand;
    private Integer frameSize;

    public Bicycle(String brand) {
        this.brand = brand;
        this.frameSize = 0;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getFrameSize() {
        return frameSize;
    }

    public void setFrameSize(Integer frameSize) {
        this.frameSize = frameSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bicycle bicycle = (Bicycle) o;
        return Objects.equals(brand, bicycle.brand) &&
                Objects.equals(frameSize, bicycle.frameSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, frameSize);
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "brand='" + brand + '\'' +
                ", frameSize=" + frameSize +
                '}';
    }
}