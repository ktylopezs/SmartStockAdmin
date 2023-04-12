package co.com.smartstock.test.tasks;

import co.com.smartstock.test.models.Variables;
import co.com.smartstock.test.userinterfaces.ObjectNvosRegistros;
import co.com.smartstock.test.utils.CargarArchivos;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;
import org.openqa.selenium.By;

import java.io.IOException;


public class NuevosRegistros implements Task  {

    public static NuevosRegistros NvoRegistro() {return Tasks.instrumented(NuevosRegistros.class);}

    @Override
    public <T extends Actor> void performAs(T usuario) {

        try {
            CargarArchivos.NvosRegistros();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // Nueva Persona

        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectNvosRegistros.Admin),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        usuario.attemptsTo(
                Click.on(ObjectNvosRegistros.Admin),
                Click.on(ObjectNvosRegistros.Usuario),
                Enter.theValue(Variables.NvaPersona()).into(ObjectNvosRegistros.BuscarNvoReg));

        // Nueva Tipo Documento

        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectNvosRegistros.Parametros),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        usuario.attemptsTo(
                Click.on(ObjectNvosRegistros.Parametros),
                Click.on(ObjectNvosRegistros.TiposDoc),
                Enter.theValue(Variables.NvoTipDoc()).into(ObjectNvosRegistros.BuscarNvoReg));

        // Nueva Bodega

        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectNvosRegistros.Bodegas),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        usuario.attemptsTo(
                Click.on(ObjectNvosRegistros.Bodegas),
                Click.on(ObjectNvosRegistros.GBodegas),
                Enter.theValue(Variables.NvaBodega()).into(ObjectNvosRegistros.BuscarNvoReg));

        // Nuevo Producto

        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectNvosRegistros.MProductos),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        usuario.attemptsTo(
                Click.on(ObjectNvosRegistros.MProductos),
                Click.on(ObjectNvosRegistros.Productos),
                Enter.theValue(Variables.NvoProducto()).into(ObjectNvosRegistros.DigitarProd),
                Click.on(ObjectNvosRegistros.BuscarProd));

    }
}
