package co.com.smartstock.test.definition;

import co.com.smartstock.test.tasks.AbrirPagina;
import co.com.smartstock.test.tasks.OrdenEntrada;
import co.com.smartstock.test.userinterfaces.LoginPagina;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class MyDefinition {

    private AbrirPagina openPage;

    @Before
    public void IniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que jhon ingresa a la pagina smartstock$")
    public void queJhonIngresaALaPaginaSmartstock() {

        OnStage.theActorCalled("Jhon").wasAbleTo(AbrirPagina.urlApp());
    }

//    @Cuando("^digita sus credenciales$")
//    public void digitaSusCredenciales() throws InterruptedException {
////        List<List<String>> data = Login.raw();
////        theActorInTheSpotlight().attemptsTo(Enter.theValue(data.get(1).get(1)).into(LoginPagina.TXT_USUARIO),
////                Enter.theValue(data.get(2).get(1)).into(LoginPagina.TXT_PASSWORD), Click.on(LoginPagina.BTN_LOGIN));
////        Thread.sleep(2000);
//    }

    @Cuando("^realiza la orden de entrada$")
    public void realizaLaOrdenDeEntrada() {
        OnStage.theActorCalled("jhon").wasAbleTo(OrdenEntrada.Entrada());
    }

    @Entonces("^verifica que se creo correctamente$")
    public void verificaQueSeCreoCorrectamente() {

    }


}
