package co.com.smartstock.test.tasks;

import co.com.smartstock.test.interactions.Agregardetalles;
import co.com.smartstock.test.interactions.SeleccionBodega;
import co.com.smartstock.test.userinterfaces.LoginPagina;
import co.com.smartstock.test.userinterfaces.ObjectEntradaInventario;
import co.com.smartstock.test.userinterfaces.ObjectOrdenEntrada;
import co.com.smartstock.test.utils.CargarArchivos;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Collections;
import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class OrdenEntrada implements Task {
    public static OrdenEntrada Entrada() {
        return Tasks.instrumented(OrdenEntrada.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(LoginPagina.BTN_ORDENES),
                Click.on(LoginPagina.BTN_ORDENES),
                Scroll.to(LoginPagina.BTN_RENTRADA),
                Click.on(LoginPagina.BTN_RENTRADA));


        // Se crea un Questions para esperar por el elemento y luego realizar la accion.
        actor.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectOrdenEntrada.AGREGARORDENENTRADA), WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());


//        // Permite realizar un tiempo de espera por el elemento
//        actor.attemptsTo(
//                WaitUntil.the(ObjectOrdenEntrada.AGREGARORDENENTRADA, WebElementStateMatchers.isVisible())
//                        .forNoMoreThan(10)
//                        .seconds()
//        );

        // Esta funcion me permite verificar si el elemento es visible
        actor.should(
                seeThat(WebElementQuestion.the(ObjectOrdenEntrada.AGREGARORDENENTRADA),
                        WebElementStateMatchers.isVisible())
        );

        //Crear Orden de Entrada
        actor.attemptsTo(Click.on(ObjectOrdenEntrada.AGREGARORDENENTRADA),
                Click.on(ObjectOrdenEntrada.BODEGADESTINO),
                SeleccionBodega.one(),
                Click.on(ObjectOrdenEntrada.TipoDocumento),
                Click.on(ObjectOrdenEntrada.Documento),
                Click.on(ObjectOrdenEntrada.TipoProveedor),
                Click.on(ObjectOrdenEntrada.Proveedor));

        actor.attemptsTo(Click.on(ObjectOrdenEntrada.Direccionentrega),
                Enter.theValue(CargarArchivos.properties.getProperty("Direccionentrega")).into(ObjectOrdenEntrada.Direccionentrega),
                Enter.theValue(CargarArchivos.properties.getProperty("Fechaentrega")).into(ObjectOrdenEntrada.Fechaentrega),
                Enter.theValue(CargarArchivos.properties.getProperty("Condicioncomercial")).into(ObjectOrdenEntrada.Condicioncomercial),
                Enter.theValue(CargarArchivos.properties.getProperty("Docrelacionado")).into(ObjectOrdenEntrada.Docrelacionado),
                Enter.theValue(CargarArchivos.properties.getProperty("Observacion")).into(ObjectOrdenEntrada.Observacion),
                Click.on(ObjectOrdenEntrada.Guardar));

        // Se llama la iteración de Agregar Detalles
        actor.attemptsTo(Agregardetalles.Orden(),
                Click.on(ObjectOrdenEntrada.DivisionDestino),
                Enter.theValue(CargarArchivos.properties.getProperty("Divisiondestino")).into(ObjectOrdenEntrada.DivisionDestino),
                Click.on(ObjectOrdenEntrada.listaDivisionDestino),
                Enter.theValue(CargarArchivos.properties.getProperty("Cantidadsolicita")).into(ObjectOrdenEntrada.CantidadSolicitada),
                Click.on(ObjectOrdenEntrada.AgregarProducts),
                Scroll.to(ObjectOrdenEntrada.BODEGADESTINO));

        // Permite realizar un tiempo de espera por el elemento
        actor.attemptsTo(
                WaitUntil.the(ObjectOrdenEntrada.CambiarEtapa, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(10)
                        .seconds(),
                Click.on(ObjectOrdenEntrada.CambiarEtapa),
                Click.on(ObjectOrdenEntrada.ListaCambiarEtapa),
                Click.on(ObjectOrdenEntrada.FinalizarOrden)
        );

        // El sitio se demora mucho en mostrar el elemento motivo por el cual se crea este tiempo de espera.
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(ObjectOrdenEntrada.CerrarVentana));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Con esta lista voy a obtener el numero de Orden de Entrada Obtenido

        List<String> Orden = Collections.singletonList(ObjectOrdenEntrada.OrdenObtenida.resolveFor(actor).getText());
        String numordenone = Orden.get(0);
        System.out.println("Numero de Ordenes Obtenida : " + Orden.size());
        System.out.println("Nombre de Orden Obtenida : " + Orden.get(0));

        actor.attemptsTo(
                Click.on(ObjectEntradaInventario.Procesos),
                Click.on(ObjectEntradaInventario.EntradaInv)
        );

        // Se crea un Questions para esperar por el elemento y luego realizar la accion.
        actor.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectEntradaInventario.AgregarInv), WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        // assert with waiting
        actor.should(EventualConsequence.eventually(GivenWhenThen.seeThat(
                WebElementQuestion.the(ObjectEntradaInventario.AgregarInv),
                WebElementStateMatchers.isEnabled())
        ).waitingForNoLongerThan(30).seconds());

        actor.attemptsTo(Click.on(ObjectEntradaInventario.AgregarInv));

        // Se crea un Questions para esperar por el elemento y luego realizar la accion.
        actor.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectEntradaInventario.BuscarInv), WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        // assert with waiting
        actor.should(EventualConsequence.eventually(GivenWhenThen.seeThat(
                WebElementQuestion.the(ObjectEntradaInventario.BuscarInv),
                WebElementStateMatchers.isEnabled())
        ).waitingForNoLongerThan(30).seconds());


        actor.attemptsTo(Click.on(ObjectEntradaInventario.BuscarInv),
                Enter.theValue(numordenone).into(ObjectEntradaInventario.BuscarInv));


    }

}
