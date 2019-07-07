package com.get.calcengine;

public class Multiplier extends CalculateBase{

public Multiplier(){}

public Multiplier(int leftVal, int rightVal){
    super(leftVal,rightVal);

}
    @Override
    public void calculate() {
    int value = getLeftVal()*getRightVal();
    setResults(value);

    }
}
