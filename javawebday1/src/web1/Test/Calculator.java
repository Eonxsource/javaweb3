package web1.Test;

public class Calculator {
    private int nuber1,nuber2;
    public Calculator (int nuber1,int nuber2){
        this.nuber1=nuber1;
        this.nuber2=nuber2;
    }
    /*
    * 加法运算
    * */
    public int add(){
        return nuber1+nuber2;
        /*
        * 减法
        * */

    }
    public int sub() {
        return nuber1 - nuber2;
    }
    public void xunhuan(){
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
