package co.com.smartstock.test.tasks;

import co.com.smartstock.test.models.Variables;
import co.com.smartstock.test.userinterfaces.ObjectBodegas;
import co.com.smartstock.test.utils.CargarArchivos;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.Wait;
import org.openqa.selenium.By;

import java.io.IOException;


public class MenuBodegas implements Task  {

    public static MenuBodegas Bodegas() {return Tasks.instrumented(MenuBodegas.class);}

    @Override
    public <T extends Actor> void performAs(T usuario) {

        //// MENU BODEGAS ////

        try {
            CargarArchivos.Bodegas();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Desplegar menu bodegas

        // Tiempo de espera - elemento
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectBodegas.AlertaBod), WebElementStateMatchers.isNotVisible()
        ).forNoLongerThan(30).seconds());

        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectBodegas.Bodegas),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());
        usuario.attemptsTo(Click.on(ObjectBodegas.Bodegas));

        //// OPCION TIPOS BODEGAS ////

        // Abrir Tipos Bodegas
        usuario.attemptsTo(Click.on(ObjectBodegas.TiposBodegas));
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectBodegas.AgrTipBodega), WebElementStateMatchers.isVisible()
        ).forNoLongerThan(30).seconds());
        usuario.attemptsTo(Click.on(ObjectBodegas.AgrTipBodega));

        // Agregar Datos Tipos Bodegas tiempo de espera - elemento
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectBodegas.DesTipoBod),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        // Agregar Datos Tipo Bodega
        usuario.attemptsTo(
                Enter.theValue(Variables.NombTipoBod()).into(ObjectBodegas.DesTipoBod),
                Click.on(ObjectBodegas.GuardarTipoBod),
                Click.on(ObjectBodegas.ConTipoBod));

        //// OPCION FILAS ////

        // Abrir Filas

        usuario.attemptsTo(Click.on(ObjectBodegas.Filas));
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectBodegas.AgrFila), WebElementStateMatchers.isVisible()
        ).forNoLongerThan(30).seconds());
        usuario.attemptsTo(Click.on(ObjectBodegas.AgrFila));

        // Agregar Datos Filas tiempo de espera - elemento
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectBodegas.DesFila),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        // Agregar Datos Filas
        usuario.attemptsTo(
                Enter.theValue(Variables.NombFila()).into(ObjectBodegas.DesFila),
                Click.on(ObjectBodegas.GuardarFila),
                Click.on(ObjectBodegas.ConFila));

        //// OPCION TIPOS DIVISIONES ////

        // Abrir Tipos Divisiones

        usuario.attemptsTo(Click.on(ObjectBodegas.TiposDiv));
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectBodegas.AgrTipDiv), WebElementStateMatchers.isVisible()
        ).forNoLongerThan(30).seconds());
        usuario.attemptsTo(Click.on(ObjectBodegas.AgrTipDiv));

        // Agregar Datos Tipos Divisiones tiempo de espera - elemento
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectBodegas.DesTipDiv),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        // Agregar Datos Tipo Division
        usuario.attemptsTo(
                Enter.theValue(Variables.NombTipDiv()).into(ObjectBodegas.DesTipDiv),
                Click.on(ObjectBodegas.GuardarTipDiv),
                Click.on(ObjectBodegas.ConTipDiv));

        //// OPCION PISOS ////

        // Abrir Pisos

        usuario.attemptsTo(Scroll.to(ObjectBodegas.Pisos));
        usuario.attemptsTo(Click.on(ObjectBodegas.Pisos));
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectBodegas.AgrPisos), WebElementStateMatchers.isVisible()
        ).forNoLongerThan(30).seconds());
        usuario.attemptsTo(Click.on(ObjectBodegas.AgrPisos));

        // Agregar Datos Pisos tiempo de espera - elemento
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectBodegas.DesPisos),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        // Agregar Datos Pisos
        usuario.attemptsTo(
                Enter.theValue(Variables.NombPisos()).into(ObjectBodegas.DesPisos),
                Click.on(ObjectBodegas.GuardarPisos),
                Click.on(ObjectBodegas.ConPisos));

        //// OPCION COLUMNAS ////

        // Abrir Columnas

        // Tiempo de espera - elemento

        usuario.attemptsTo(Scroll.to(ObjectBodegas.Columnas));
        usuario.attemptsTo(Click.on(ObjectBodegas.Columnas));

        try { Thread.sleep(3000); } catch (InterruptedException e) { throw new RuntimeException(e); }

        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectBodegas.AgrColumnas),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        usuario.attemptsTo(Click.on(ObjectBodegas.AgrColumnas));

        // Agregar Datos Columnas tiempo de espera - elemento
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectBodegas.DesColumnas),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        // Agregar Datos Columnas
        usuario.attemptsTo(
                Enter.theValue(Variables.NombColumna()).into(ObjectBodegas.DesColumnas),
                Click.on(ObjectBodegas.GuardarColumnas),
                Click.on(ObjectBodegas.ConColumnas));

        //// OPCION GESTION BODEGAS ////

        // Abrir Gestion Bodegas

        // Tiempo de espera - elemento
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectBodegas.AlertaBod), WebElementStateMatchers.isNotVisible()
        ).forNoLongerThan(30).seconds());

        usuario.attemptsTo(Scroll.to(ObjectBodegas.GBodegas));
        usuario.attemptsTo(Click.on(ObjectBodegas.GBodegas));
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectBodegas.AgrBodega), WebElementStateMatchers.isVisible()
        ).forNoLongerThan(30).seconds());

        try { Thread.sleep(3000); } catch (InterruptedException e) { throw new RuntimeException(e); }

        usuario.attemptsTo(Click.on(ObjectBodegas.AgrBodega));

        // Tiempo de espera - elemento
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectBodegas.AlertaBod), WebElementStateMatchers.isNotVisible()
        ).forNoLongerThan(30).seconds());

        // Agregar Datos Gestion Bodegas tiempo de espera - elemento
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectBodegas.DesBodega),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        // Agregar Datos Bodega
        usuario.attemptsTo(
                Enter.theValue(Variables.NomBodega()).into(ObjectBodegas.DesBodega),
                Enter.theValue(Variables.CodigoRamdonD()).into(ObjectBodegas.CodBodega),
                Enter.theValue(CargarArchivos.properties.getProperty("DirBodega")).into(ObjectBodegas.DirBodega),
                Click.on(ObjectBodegas.TipoBodega),
                Click.on(ObjectBodegas.SelTipoBod),
                Enter.theValue(CargarArchivos.properties.getProperty("CiudadBod")).into(ObjectBodegas.CiudadBodega),
                Click.on(ObjectBodegas.SelCiuBodega),
                Enter.theValue(CargarArchivos.properties.getProperty("AnchoBod")).into(ObjectBodegas.AnchoBodega),
                Enter.theValue(CargarArchivos.properties.getProperty("LargoBod")).into(ObjectBodegas.LargoBodega),
                Enter.theValue(CargarArchivos.properties.getProperty("AltoBod")).into(ObjectBodegas.AltoBodega),
                Enter.theValue(CargarArchivos.properties.getProperty("LatitudBod")).into(ObjectBodegas.LatitudBodega),
                Enter.theValue(CargarArchivos.properties.getProperty("LongitudBod")).into(ObjectBodegas.LongitudBodega),
                Click.on(ObjectBodegas.GuardarBodega),
                Click.on(ObjectBodegas.ConBodega));

        // Tiempo de espera - elemento
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectBodegas.AlertaBod), WebElementStateMatchers.isNotVisible()
        ).forNoLongerThan(30).seconds());

        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectBodegas.DivBodega),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        // Agregar Datos Division Bodega
        usuario.attemptsTo(
                Click.on(ObjectBodegas.DivBodega),
                Click.on(ObjectBodegas.AgrDivBodega),
                Enter.theValue(Variables.NomDivision()).into(ObjectBodegas.DesDivBodega),
                Click.on(ObjectBodegas.TipDivBodega),
                Click.on(ObjectBodegas.SelTipoDiv),
                Click.on(ObjectBodegas.FilaDvBodega),
                Click.on(ObjectBodegas.SelFila),
                Click.on(ObjectBodegas.ColDvBodega),
                Click.on(ObjectBodegas.SelColumna),
                Click.on(ObjectBodegas.PisoDvBodega),
                Click.on(ObjectBodegas.SelPiso),
                Enter.theValue(CargarArchivos.properties.getProperty("AnchoBod")).into(ObjectBodegas.AnchoDvBodega),
                Enter.theValue(CargarArchivos.properties.getProperty("LargoBod")).into(ObjectBodegas.LargoDvBodega),
                Enter.theValue(CargarArchivos.properties.getProperty("AltoBod")).into(ObjectBodegas.AltoDvBodega),
                Enter.theValue(CargarArchivos.properties.getProperty("PesoDivision")).into(ObjectBodegas.PesoDvBodega),
                Click.on(ObjectBodegas.GuardarDvBodega),
                Click.on(ObjectBodegas.ConDvBodega));

        // Tiempo de espera - elemento
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectBodegas.AlertaBod), WebElementStateMatchers.isNotVisible()
        ).forNoLongerThan(30).seconds());
        usuario.attemptsTo(Click.on(ObjectBodegas.CerrarBodega),
        Click.on(ObjectBodegas.ConCerrarBodega));

        // Editar Bodega
        usuario.attemptsTo(
                Enter.theValue(Variables.NomBodega()).into(ObjectBodegas.BuscarBodega),
                Click.on(ObjectBodegas.EditarBodega));

        // Agregar Datos Persona Bodegas tiempo de espera - elemento

        try { Thread.sleep(3000); } catch (InterruptedException e) { throw new RuntimeException(e); }
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectBodegas.PersonaBodega),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        // Agregar Datos Persona Bodega
        usuario.attemptsTo(Scroll.to(ObjectBodegas.PersonaBodega));
        usuario.attemptsTo(
                Click.on(ObjectBodegas.PersonaBodega),
                Click.on(ObjectBodegas.AgrPerBodega),
                Enter.theValue(Variables.NombPersonaB()).into(ObjectBodegas.BPerBodega),
                Click.on(ObjectBodegas.SPerBodega),
                Click.on(ObjectBodegas.GuardarPrBodega),
                Click.on(ObjectBodegas.ConPrBodega));

        // Agregar Datos Documentos Bodegas tiempo de espera - elemento
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectBodegas.ConfigDocBodega),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        // Agregar Datos Documentos Bodega
        try { Thread.sleep(3000); } catch (InterruptedException e) { throw new RuntimeException(e); }
        usuario.attemptsTo(Scroll.to(ObjectBodegas.ConfigDocBodega));
        usuario.attemptsTo(
                Click.on(ObjectBodegas.ConfigDocBodega),
                Click.on(ObjectBodegas.AgrDocBodega),
                Click.on(ObjectBodegas.TipDocBodega),
                Click.on(ObjectBodegas.SelTipDocBod),
                Click.on(ObjectBodegas.DivDocBodega),
                Click.on(ObjectBodegas.SelDivDocBodega),
                Click.on(ObjectBodegas.GuardarDocBodega),
                Click.on(ObjectBodegas.ConDocBodega),
                Click.on(ObjectBodegas.CerrarBodega),
                Click.on(ObjectBodegas.ConCerrarBodega));

    }
}