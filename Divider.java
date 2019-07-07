package com.get.calcengine;

public class Divider extends CalculateBase {

    public Divider(){}

    public Divider(int leftVal, int rightVal){
        super(leftVal,rightVal);

    }
    @Override
    public void calculate() {
        int value = getRightVal()/getLeftVal();
        setResults(value);

    }
}
