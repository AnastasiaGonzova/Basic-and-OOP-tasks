package complex;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.Math.atan;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public MyComplex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public boolean isReal(){
        if((Double.compare(real, 0) == 0)&&(Double.compare(imag, 0) != 0)) return false;
        return true;
    }

    public boolean isImaginary(){
        if(Double.compare(imag, 0) == 0) return false;
        return true;
    }

    public double Magnitude(){
        return sqrt(pow(real, 2) + pow(imag,2));
    }

    public double Argument(){
        return atan(imag/real);
    }

    public MyComplex Add(MyComplex right){
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex AddNew(MyComplex right){
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }

    public MyComplex Subtract(MyComplex right){
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex SubtractNew(MyComplex right){
        MyComplex result = new MyComplex(this.real - right.real, this.imag - right.imag);
        return result;
    }

    public MyComplex Multiply(MyComplex right){
        double copyR = this.real;
        double copyIm = this.imag;
        this.real = (copyR*right.real) - (copyIm*right.imag);
        this.imag = (copyR*right.imag) + (copyIm*right.real);
        return this;
    }

    public MyComplex Divide(MyComplex right){
        double copyR = this.real;
        double copyIm = this.imag;
        this.real = (copyR*right.real - copyIm*right.imag*(-1))/(pow(right.real, 2) + pow(right.imag, 2));
        this.imag  = (copyR*right.imag*(-1) + copyIm*right.real)/(pow(right.real, 2) + pow(right.imag, 2));
        return this;
    }

    public MyComplex Conjugate(){
        return new MyComplex(this.real, this.imag*(-1));
    }

    public boolean equals(double real, double imag) {
        return (Double.compare(this.real, real) == 0) && (Double.compare(this.imag, imag) == 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyComplex myComplex = (MyComplex) o;
        return Double.compare(myComplex.real, real) == 0 &&
                Double.compare(myComplex.imag, imag) == 0;
    }

    @Override
    public int hashCode() {
        int result = 7;
        result = 31*result + Double.hashCode(real);
        result = 31*result + Double.hashCode(imag);
        return result;
    }

    @Override
    public String toString() {
        if((Double.compare(real, 0) == 0)&&(Double.compare(imag, 0) == 0)) return "(0)";
        if((Double.compare(real, 0) == 0)&&(Double.compare(imag, 0) != 0)) return "(" + imag + "i)";
        if((Double.compare(real, 0) != 0)&&(Double.compare(imag, 0) == 0)) return "(" + real + ")";
        return "(" + real + " + (" + imag + ")i)";
    }
}
