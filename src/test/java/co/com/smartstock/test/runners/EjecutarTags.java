package co.com.smartstock.test.runners;

import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features"
        , snippets = SnippetType.CAMELCASE
        // , tags = "@AbrirAplicacion"
        , glue = "co.com.smartstock.test.definition")

public class EjecutarTags {
//    gradle clean test aggregate
//    gradle clean test aggregate -Dtags=@HistoriaDeUsuario3
//    Gradle 7.2
}
