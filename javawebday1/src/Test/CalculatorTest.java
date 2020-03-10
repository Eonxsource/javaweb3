package Test;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import web1.Test.Calculator;

public class CalculatorTest {
    /*初始化方法：
    所有测试方法在执行之前都要执行该方法，该方法用于资源申请。
    * */
    @Before//修饰语句，在测试方法执行之前执行。
    public void init(){
        System.out.println("init...");
    }
    /*释放资源方法：
    在所有测试方法执行完之后，都会自动执行该方法。
    * */
    @After//修饰语句，在测试方法执行之后执行。
    public void close(){
        System.out.println("close...");
    }


    @Test

    public void TestAdd(){
//        System.out.println("为什么IDEA不能后台下载模块？");
        Calculator s=new Calculator(45,26);
        int result=s.add();
//        System.out.println(s.sub());
        /*断言：我断言这个结果是我想要的结果。
        * */
        Assert.assertEquals(71,result);//(期望结果，运行结果)
    }
    @Test
    public void TestSub(){
        Calculator s=new Calculator(34,29);
        int result=s.sub();
        Assert.assertEquals(5,result);
    }
}
