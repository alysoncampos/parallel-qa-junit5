package parallel;

import org.junit.jupiter.api.Test;

public class ClassParallel3Test {

    @Test
    public void testMethodOne() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("methodOne");
    }

    @Test
    public void testMethodTwo() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("methodTwo");
    }

    @Test
    public void testMethodThree() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("methodThree");
    }

    @Test
    public void testMethodFour() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("methodFour");
    }

    @Test
    public void testMethodFive() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("methodFive");
    }
}
