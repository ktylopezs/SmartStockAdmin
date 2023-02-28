package co.com.smartstock.test.interactions;

import co.com.smartstock.test.userinterfaces.ObjectOrdenEntrada;
import co.com.smartstock.test.utils.CargarArchivos;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;

public class Agregardetalles implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
     /* Se especificara el tipo de busqueda a realizar ya que se puede hacer por
        Coddigo o Descripción */

        try {
            CargarArchivos.OrdenEntrada();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String TipoBusqueda = CargarArchivos.properties.getProperty("TipoBusqueda");
        switch (TipoBusqueda) {
            case "1":
                // Tiempo de espera para ver el elemento
                actor.attemptsTo(
                        Scroll.to(ObjectOrdenEntrada.Codigoitem),
                        WaitUntil.the(ObjectOrdenEntrada.Codigoitem, WebElementStateMatchers.isVisible())
                                .forNoMoreThan(5)
                                .seconds(),
                        Enter.theValue(CargarArchivos.properties.getProperty("CodigoItem")).into(ObjectOrdenEntrada.Codigoitem),
                        Click.on(ObjectOrdenEntrada.ListaCodigoitem)
                );
                break;
            case "2":
                actor.attemptsTo(
                        Scroll.to(ObjectOrdenEntrada.Descitem),
                        WaitUntil.the(ObjectOrdenEntrada.Descitem, WebElementStateMatchers.isVisible())
                                .forNoMoreThan(5)
                                .seconds(),
                        Enter.theValue(CargarArchivos.properties.getProperty("DescItem")).into(ObjectOrdenEntrada.Descitem),
                        Click.on(ObjectOrdenEntrada.ListaDescitem)
                );
                break;
            default:
                System.out.println("No ha seleccionado ninguna Opcion de busqueda para agregar productos");
                break;
        }
    }

    public static Agregardetalles Orden() {
        return Instrumented.instanceOf(Agregardetalles.class).withProperties();
    }
}
