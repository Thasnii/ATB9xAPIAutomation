package org.examplethasni.ex01_API_sample001;

public class APItesting003_Nodesignpattern {
    public static void main(String[] args) {
        APItesting003_Nodesignpattern np = new APItesting003_Nodesignpattern();
        np.step1();
        np.step2();
        np.step3("sssss");

    }
    public void step1(){
        System.out.println("step1");
    }
    public void step2(){
        System.out.println("Step2");
    }
    public void step3(String para1){
        System.out.println("Step3");
    }
}
