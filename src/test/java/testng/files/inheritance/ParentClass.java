package testng.files.inheritance;

import org.testng.annotations.BeforeClass;

public class ParentClass {

    @BeforeClass
    public void beforeParentClass(){
        System.out.println("@BeforeClass in Parent class");
    }
}
