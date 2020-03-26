package shape;

public class Triangle extends Shape {
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public boolean isTriangle() {
        if ((this.side1 > 0) && (this.side2 > 0) && (this.side3 > 0)) {
            double halfPerimeter = (this.side1 + this.side2 + this.side3) / 2;
            if (halfPerimeter <= this.side1 || halfPerimeter <= this.side2 || halfPerimeter < this.side3) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public double getPerimeter() {
        if (isTriangle()) {
            return (this.side1 + this.side2 + this.side3);
        } else {
            return 0;
        }
    }

    public double getArea() {
        if (this.isTriangle()) {
            double halfPerimeter = this.getPerimeter() / 2;
            double area = Math.sqrt(halfPerimeter * (halfPerimeter - this.side1) * (halfPerimeter - this.side2) * (halfPerimeter - this.side3));
            return area;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        if (this.isTriangle()) {
            return "A triangle with  " + super.toString() + " with 3 sides (" + this.side1 + "," + this.side2 + "," + this.side3
                    + ") ; perimeter : " + this.getPerimeter() + " ; area: " + this.getArea();
        } else {
            return "invalid input !!";
        }
    }
}
