package serenity;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/Serenity/bugfus.feature", glue = {"serenity"}, tags = "@Dofus")
public class SerenityRunner {
}
