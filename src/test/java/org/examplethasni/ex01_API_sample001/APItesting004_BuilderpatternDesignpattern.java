package org.examplethasni.ex01_API_sample001;

public class APItesting004_BuilderpatternDesignpattern {
    public static void main(String[] args) {
        APItesting004_BuilderpatternDesignpattern bp = new APItesting004_BuilderpatternDesignpattern();
        bp.Step1().Step2().Step3("Ddddd");

    }
    public APItesting004_BuilderpatternDesignpattern Step1(){
        System.out.println("Step1");
        return this;
    }
    public APItesting004_BuilderpatternDesignpattern Step2() {
        System.out.println("Step2");
        return this;
    }
    public APItesting004_BuilderpatternDesignpattern Step3(String para1){
        System.out.println("Step3");
        return this;
    }

}
