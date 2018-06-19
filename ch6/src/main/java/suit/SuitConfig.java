package suit;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuitConfig {
    @BeforeSuite
    public void beforeSuit() {
        System.out.println("before suite运行啦");
    }

    @AfterSuite
    public void afterSuit() {
        System.out.println("after suite结束");
    }
}
