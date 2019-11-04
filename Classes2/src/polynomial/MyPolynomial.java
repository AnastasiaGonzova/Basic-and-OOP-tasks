package polynomial;

import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double[] coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree(){
        return (coeffs.length) - 1;
    }

    public double Evaluate(double x){
        double result = 0;
        for(int i = 0; i < coeffs.length; i++){
            result += coeffs[i]*Math.pow(x,i);
        }
        return result;
    }

    public MyPolynomial Add(MyPolynomial right){
        double[] newCoeffs;
        if(right.coeffs.length > this.coeffs.length) {
            newCoeffs = right.coeffs;
            for (int i = 0; i < this.coeffs.length; i++) {
                newCoeffs[i] += this.coeffs[i];
            }
            return new MyPolynomial(newCoeffs);
        }
        else {
            newCoeffs = this.coeffs;
            for (int i = 0; i < right.coeffs.length; i++) {
                newCoeffs[i] += right.coeffs[i];
            }
            return new MyPolynomial(newCoeffs);
        }
    }

    public MyPolynomial Multiply(MyPolynomial right){
        double[] newCoeffs = new double[this.getDegree()*right.getDegree()];
        for(int i = 0; i < this.coeffs.length; i++){
            for(int j = 0; j < right.coeffs.length; j++){
                newCoeffs[i+j] += this.coeffs[i]*right.coeffs[j];
            }
        }
        return new MyPolynomial(newCoeffs);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyPolynomial that = (MyPolynomial) o;
        return Arrays.equals(coeffs, that.coeffs);
    }

    @Override
    public int hashCode() {
        int result = 7;
        result = 31*result+Arrays.hashCode(coeffs);
        return result;
    }

    @Override
    public String toString() {
        String result = "";
        for(int i = coeffs.length - 1; i >=0; i--){
            if(coeffs[i] != 0) {
                if(i != 0)result += coeffs[i] + "x^(" + i + ") + ";
                else result += coeffs[i];
            }
        }
        return result;
    }
}
