package org.example;

import org.junit.Test;
import ru.omsu.fctk.Lab4.Excersise1.QuadraticPolynomial;

import static org.junit.Assert.*;

public class QuadraticPolynomialServiceTest {

    @Test
    public void returnTheBiggestRoot() {
        QuadraticPolynomial a = new QuadraticPolynomial(1,1,1);
        QuadraticPolynomial b = new QuadraticPolynomial(1,2,1);
        QuadraticPolynomial c = new QuadraticPolynomial(1,3,2);
        QuadraticPolynomial d = new QuadraticPolynomial(0,2,1);
        QuadraticPolynomial e = new QuadraticPolynomial(0,0,1);
        QuadraticPolynomial f = new QuadraticPolynomial(0,0,0);

        QuadraticPolynomialService r1 = new QuadraticPolynomialService(a);
        QuadraticPolynomialService r2 = new QuadraticPolynomialService(b);
        QuadraticPolynomialService r3 = new QuadraticPolynomialService(c);
        QuadraticPolynomialService r4 = new QuadraticPolynomialService(d);
        QuadraticPolynomialService r5 = new QuadraticPolynomialService(e);
        QuadraticPolynomialService r6 = new QuadraticPolynomialService(f);

        assertEquals(-1.0,r2.returnTheBiggestRoot(),2);
        assertEquals(-1.0,r3.returnTheBiggestRoot(),2);
        assertEquals(-0.5,r4.returnTheBiggestRoot(),2);
        assertEquals(1.0/0.0,r6.returnTheBiggestRoot(),2);

        try {
            double d1 = r1.returnTheBiggestRoot();
        }
        catch(Exception exception){
            System.out.println("There are no roots");
        }

        try {
            double d5 = r5.returnTheBiggestRoot();
        }
        catch(Exception exception){
            System.out.println("There are no roots");
        }
    }
}