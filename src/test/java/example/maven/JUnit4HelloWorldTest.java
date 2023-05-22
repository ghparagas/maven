package example.maven;

import org.junit.Test;

import static org.junit.Assert.*;

public class JUnit4HelloWorldTest {

    @Test
    public void getHello() {
        HelloWorld javaHelloWorld = new HelloWorld();
        assertEquals("Hello World", javaHelloWorld.getHello());
        System.out.println("In JUnit4HelloWorldTest class");
    }
}