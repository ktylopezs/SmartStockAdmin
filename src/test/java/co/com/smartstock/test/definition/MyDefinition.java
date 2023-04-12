package co.com.smartstock.test.definition;

import co.com.smartstock.test.interactions.CerrarSesion;
import co.com.smartstock.test.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.awt.*;

public class MyDefinition {

    private AbrirPagina openPage;

    @Before
    public void IniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario ingresa a la pagina SmartStock$")
    public void queelusuarioingresaalapaginaSmartStock() {
        OnStage.theActorCalled("usuario").wasAbleTo(AbrirPagina.urlApp());
    }

    @Cuando("^ingrese a todas las opciones$")
    public void ingreseatodaslasopciones() {
       OnStage.theActorCalled("usuario").wasAbleTo(MenuAdministracion.Admin());
       OnStage.theActorCalled("usuario").wasAbleTo(MenuParametros.Parametros());
       OnStage.theActorCalled("usuario").wasAbleTo(MenuBodegas.Bodegas());
       OnStage.theActorCalled("usuario").wasAbleTo(MenuProductos.Productos());
    }

    @Entonces("^se crea usuario documento bodega y producto$")
    public void secreausuariodocumentobodegayproducto() {
        OnStage.theActorCalled("usuario").wasAbleTo(NuevosRegistros.NvoRegistro());
        }

    @Y("^se cierra la pagina de SmartStock$")
    public void secierralapaginadeSmartStock() {
        OnStage.theActorCalled("Usuario").wasAbleTo(CerrarSesion.Close());
    }

}
