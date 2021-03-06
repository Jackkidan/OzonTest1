import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/"}, glue = {"ru.ozon.autotests"},
        plugin = {
                "ru.ozon.autotests.util.AllureReporter",
        }
)
public class CucumberRunner {

}