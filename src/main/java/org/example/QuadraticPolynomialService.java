package org.example;

import ru.omsu.fctk.Lab4.Excersise1.QuadraticPolynomial;

import java.util.Objects;

public class QuadraticPolynomialService {
    private QuadraticPolynomial a;

    public QuadraticPolynomialService(QuadraticPolynomial a){
        this.a = new QuadraticPolynomial(a);
    }
    public double returnTheBiggestRoot(){
        if(a.getRoots().length==0){
            throw new IllegalArgumentException();
        }
        else if (a.getRoots().length==2) {
            if(a.getRoots()[1]>a.getRoots()[0]){
                return a.getRoots()[1];
            }
            else{
                return a.getRoots()[0];
            }
        }
        else{
            return a.getRoots()[0];
        }
    }

    public QuadraticPolynomial getA() {
        return a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QuadraticPolynomialService that)) return false;
        return Objects.equals(getA(), that.getA());
    }

    @Override
    public int hashCode() {
        return getA().hashCode();
    }
}
