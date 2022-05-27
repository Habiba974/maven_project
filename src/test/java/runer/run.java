package runer;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;


@CucumberOptions(
        features = "src/main/resources/Features",
        glue = {"definition"},
        plugin = { "pretty",
              "html:target/cucumber.html",
              "json:target/cucumber.json",
              "junit:target/cukes.xml",
              "rerun:target/rerun.txt"},
        tags = "@somke"









)
public class run extends AbstractTestNGCucumberTests {
}
