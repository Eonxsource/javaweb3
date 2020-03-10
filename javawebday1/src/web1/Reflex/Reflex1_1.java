package web1.Reflex;

import web1.domainReflex.Person;
/*
反射：框架设计的灵魂
1.框架：半成品软件。可以在框架的基础上进行软件开发，简化编码
2.反射：将类的各个组成部分封装为其他对象，这就是反射机制
    *好处：1.可以在程序运行期间，操作这些对象。
           2.可以解耦（降低程序的耦合性），提高程序的可扩展性。
*   定义：
    JAVA反射机制是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；
    对于任意一个对象，都能够调用它的任意方法和属性；
    这种动态获取信息以及动态调用对象方法的功能称为java语言的反射机制。
    用途
*   在日常的第三方应用开发过程中，经常会遇到某个类的某个成员变量、方法或是属性是私有的或是只对系统应用开放，
    这时候就可以利用Java的反射机制通过反射来获取所需的私有成员或是方法。
    当然，也不是所有的都适合反射，之前就遇到一个案例，通过反射得到的结果与预期不符。
    阅读源码发现，经过层层调用后在最终返回结果的地方对应用的权限进行了校验，对于没有权限的应用返回值是没有意义的缺省值，
    否则返回实际值起到保护用户的隐私目的。
    反射机制的相关类
*   与Java反射相关的类如下：
    类名	    用途
    Class类  	代表类的实体，在运行的Java应用程序中表示类和接口
    Field类  	代表类的成员变量（成员变量也称为类的属性）
    Method类 	代表类的方法
    Constructor类	代表类的构造方法
*   获取Class对象的方式：
        1.Class.forName(“全类名”）：将字节码文件加载进内存，返回Class对象
        2.类名.class：通过类名的属性class获取对象
        3.对象.getClass():getClass()方法在Object类中定义着。
* */
public class Reflex1_1 {
    public static void main(String[] args) throws Exception {
        //Class.forName("全类名")
        Class csl1=Class.forName("web1.domainReflex.Person");
        System.out.println(csl1);
        //类名.class
        Class csl2= Person.class;
        System.out.println(csl2);
        //对象.getClass()
        Person p=new Person();
        Class csl3=p.getClass();
        System.out.println(csl3);
    }
    //*结论：同一个字节码文件（*.Class）在一次程序运行中，只会被加载一次，不论运用哪种方式获取的Class对象都是同一个。
}
