/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package resilience4j;

public class App {

    public static void main(String[] args) {
        // Retry
        RetrySetup retrySetup = new RetrySetup();
        retrySetup.initCustom(3, 4);
    }
}
