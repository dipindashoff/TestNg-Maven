package testng.files.inheritance;

import org.testng.annotations.Test;

public class ChildClass extends ParentClass {

    @Test
    public void method1(){
        System.out.println("method1 in Child class");
    }
}
