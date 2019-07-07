package com.get.calcengine;


public abstract class CalculateBase {

    private int leftVal;
    private int rightVal;
    private int results;
    private char OpCode;


    // getters and setters
    public int getLeftVal(){return leftVal;}
    public void setLeftVal(int leftVal){this.leftVal=leftVal;}
    public int getRightVal(){return rightVal;}
    public char getOpCode() {return OpCode;}
    public void setOpCode(char opCode){this.OpCode=opCode;}
    public int getResults(){return results;}
    public void setResults(int results){this.results=results;}

    //defualt constructor
    public CalculateBase(){};

    // constructor to accept the values

    public CalculateBase(int leftVal, int rightVal){
        this.leftVal=leftVal;
        this.rightVal=rightVal;

    }


   // Add abstract clas without implementation. Derived class must implement this
    public abstract void calculate();
}
