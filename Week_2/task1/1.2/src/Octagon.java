package org.example;

public class Octagon {
    private double innerRadius;
    private double outerRadius;

    public Octagon(double innerRadius) {
        this.innerRadius = innerRadius;
    }

    public double getInnerRadius() {
        return innerRadius;
    }

    public void setInnerRadius(double innerRadius) {
        this.innerRadius = innerRadius;
    }
    private void calculateouterRadius() {
       outerRadius = innerRadius / (Math.cos(Math.toRadians(180.0 / 8.0))); //Вычисление внешго радиуса октагона по формуле R=(r/(cos(180/n))
    }
    private double getOuterRadius() {
        this.calculateouterRadius();
        return outerRadius;
    }

    public double getPerimeter() {
        return (2*getOuterRadius()*Math.sin(Math.toRadians(180.0/8.0)))*8.0; //Вычисление периметра по формуле (2Rsin(180/n))8, где R-outerradius
    }
    public double calculateArea() {
        return (getPerimeter()*innerRadius)/2.0; // Площадь вычисляется по формуле (1/2)Pr, где P-это париметр, а r- внутренний радиус
    }
}