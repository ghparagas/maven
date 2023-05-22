package example.maven;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class JUnit5HelloWorldTest {

    @Test
    void getHello() {
        HelloWorld javaHelloWorld = new HelloWorld();
        assertEquals("Hello World", javaHelloWorld.getHello());
        System.out.println("In JUnit5HelloWorldTest class");
    }
}