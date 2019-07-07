package com.get.calcengine;

public class Substractor extends CalculateBase {

    public Substractor(){}

    public Substractor(int lefVal, int rightVal){
        super(lefVal,rightVal);

    }
    @Override
    public void calculate() {
        int value = getLeftVal() - getRightVal();
        setResults(value);

    }
}
