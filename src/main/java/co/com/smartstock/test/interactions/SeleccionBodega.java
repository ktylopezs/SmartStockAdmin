package co.com.smartstock.test.interactions;

import co.com.smartstock.test.userinterfaces.ObjectOrdenEntrada;
import co.com.smartstock.test.utils.CargarArchivos;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import java.io.IOException;

public class SeleccionBodega implements Interaction {
    public static SeleccionBodega one() {
        return Instrumented.instanceOf(SeleccionBodega.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            CargarArchivos.OrdenEntrada();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String Bodega = CargarArchivos.properties.getProperty("Bodega");

        switch (Bodega) {
            case "1":
                actor.attemptsTo(Click.on(ObjectOrdenEntrada.Bodega1));
                break;
            case "2":
                actor.attemptsTo(Click.on(ObjectOrdenEntrada.Bodega2));
                break;
            case "3":
                actor.attemptsTo(Click.on(ObjectOrdenEntrada.Bodega3));
                break;
            case "4":
                actor.attemptsTo(Click.on(ObjectOrdenEntrada.Bodega4));
                break;
            case "5":
                actor.attemptsTo(Click.on(ObjectOrdenEntrada.Bodega5));
                break;
            default:
                System.out.println("No ha seleccionado ninguna Bodega");
                break;
        }
    }
}
