package com.company;

public class Fraction {
        private int numerator;    //attributes
        private int denominator;

        // constructor
        public Fraction(int n, int d)  // constructor
        {
            numerator = n;
            denominator = d;
        }

        //TODO default constructor (no arguments)
        public Fraction()
        {
            numerator = 0;
            denominator = 0;
        }

        public int getNum()
        {
            return numerator;
        }
        public int getDenom()
        {
            return denominator;
        }
        public Fraction add(Fraction other)
        {
            int n = this.numerator*other.denominator + this.denominator*other.numerator;
            int d = this.denominator * other.getDenom();

            Fraction result = new Fraction(n,d);
            return result;
        }


        public Fraction subtract(Fraction other)
        {   int n = this.numerator * other.denominator - (this.denominator * other.numerator);
            int d = this.denominator * other.getDenom();
            Fraction result = new Fraction(n, d);
            return result;
        }

        public Fraction multiply(Fraction other)
        {
            int n = this.numerator* other.numerator;
            int d = this.denominator * other.denominator;
            Fraction result = new Fraction(n,d);
            return result;
        }

//        // TODO toString()
    public String toString()
    {
        String f = numerator + "/" + denominator;
        return f;
    }

        public Fraction reciprocal(Fraction other) {
            int n = this.denominator;
            int d = this.numerator;
            Fraction result = new Fraction(n, d);
            return result;
        }

        public static void main(String[] args) {
            Fraction f1 = new Fraction(3,4);   // create an instance of fraction
            Fraction f2 = new Fraction(4,5);

            Fraction f3 = f2.add(f1);                            // add 2 fractions
            System.out.println("3/4 + 4/5 = " + f3);   // print the answer

            Fraction f4 = f1.subtract(f2);
            System.out.println(f1 + " - " + f2 + " = " + f4);

            Fraction f5 = f1.multiply(f2);
            System.out.println(f1 + " * " + f2 + " = " + f5);
            //
            Fraction f6 = f1.reciprocal(f2);
            System.out.println(f1  + " reciprocal " + f6);

             Fraction f7 = new Fraction(1, 2);
             Fraction f8 = new Fraction(1, 5);
             Fraction f9 = f7.add(f8);
             System.out.println("1/2 + 1/5 = " + f9);



        }

    }
