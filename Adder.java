package com.get.calcengine;

public class Adder extends CalculateBase {

    public Adder(){}

    public Adder(int leftVal, int rightVal){
        super(leftVal,rightVal);
      //  System.out.println("In Adder class");
     //   System.out.println(leftVal + rightVal);

    }
    @Override
    public void calculate() {
        System.out.println("In calculate method from Adder");
        int value = getLeftVal() + getRightVal();
        setResults(value);
        System.out.print("Results in Adder");
        System.out.println(value);

    }


}
