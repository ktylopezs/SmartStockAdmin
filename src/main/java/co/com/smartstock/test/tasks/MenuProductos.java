package co.com.smartstock.test.tasks;

import co.com.smartstock.test.models.Variables;
import co.com.smartstock.test.userinterfaces.ObjectProductos;
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


public class MenuProductos implements Task  {

    public static MenuProductos Productos() {return Tasks.instrumented(MenuProductos.class);}

    @Override
    public <T extends Actor> void performAs(T usuario) {

        //// MENU PRODUCTOS ////

        try {
            CargarArchivos.Productos();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Desplegar menu productos

        // Tiempo de espera - elemento
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectProductos.AlertaProd), WebElementStateMatchers.isNotVisible()
        ).forNoLongerThan(30).seconds());

        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectProductos.MProductos),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());
        usuario.attemptsTo(Click.on(ObjectProductos.MProductos));

        //// OPCION TIPOS UNIDADES ////

        // Abrir Tipos Unidades

        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectProductos.TiposUnidades),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());
        usuario.attemptsTo(Click.on(ObjectProductos.TiposUnidades));

        usuario.attemptsTo(Scroll.to(ObjectProductos.TiposUnidades));
        usuario.attemptsTo(Click.on(ObjectProductos.TiposUnidades));
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectProductos.AgrTiposUnd), WebElementStateMatchers.isVisible()
        ).forNoLongerThan(30).seconds());
        usuario.attemptsTo(Click.on(ObjectProductos.AgrTiposUnd));

        // Agregar Datos Tipos Unidades tiempo de espera - elemento
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectProductos.DesTipoUnd),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        // Agregar Datos Tipo Unidad
        usuario.attemptsTo(
                Enter.theValue(Variables.TipoUnd()).into(ObjectProductos.DesTipoUnd),
                Click.on(ObjectProductos.GuardarTUnidad),
                Click.on(ObjectProductos.ConTUnidad));

        //// OPCION UNIDADES ////

        // Abrir Unidades
        usuario.attemptsTo(Click.on(ObjectProductos.Unidades));

        try { Thread.sleep(3000); } catch (InterruptedException e) { throw new RuntimeException(e); }

        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectProductos.AgrUnidades), WebElementStateMatchers.isVisible()
        ).forNoLongerThan(30).seconds());
        usuario.attemptsTo(Click.on(ObjectProductos.AgrUnidades));

        // Agregar Datos Unidades tiempo de espera - elemento

        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectProductos.TipoUnidades),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        // Agregar Datos Unidad
        usuario.attemptsTo(
                Click.on(ObjectProductos.TipoUnidades),
                Scroll.to(ObjectProductos.SelTipoUnd),
                Click.on(ObjectProductos.SelTipoUnd),
                Enter.theValue(Variables.Unidad()).into(ObjectProductos.DesUnidades),
                Enter.theValue(CargarArchivos.properties.getProperty("AbrUnd") + Variables.CodigoRamdonD()).into(ObjectProductos.AbrUnidad),
                Click.on(ObjectProductos.GuardarUnd),
                Click.on(ObjectProductos.ConUnidad));

        //// OPCION CLASES TECNICAS ////

        // Abrir Clases Tecnicas
        usuario.attemptsTo(Click.on(ObjectProductos.ClasesTecnicas));
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectProductos.AgrClTecnicas), WebElementStateMatchers.isVisible()
        ).forNoLongerThan(30).seconds());
        usuario.attemptsTo(Click.on(ObjectProductos.AgrClTecnicas));

        // Agregar Datos Clases Tecnicas tiempo de espera - elemento
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectProductos.DesClTecnicas),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        // Agregar Datos Clases Tecnicas
        usuario.attemptsTo(
                Enter.theValue(Variables.ClaseTec()).into(ObjectProductos.DesClTecnicas),
                Click.on(ObjectProductos.GuardarClTecnicas),
                Click.on(ObjectProductos.ConClTecnicas));

        //// OPCION FAMILIAS ////

        // Abrir Familias
        usuario.attemptsTo(Click.on(ObjectProductos.Familias));

        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectProductos.AlertaProd), WebElementStateMatchers.isNotVisible()
        ).forNoLongerThan(30).seconds());

        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectProductos.AgrFamilias), WebElementStateMatchers.isVisible()
        ).forNoLongerThan(30).seconds());
        usuario.attemptsTo(Click.on(ObjectProductos.AgrFamilias));

        // Agregar Datos Familias tiempo de espera - elemento
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectProductos.DesFamilia),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        // Agregar Datos Familias
        usuario.attemptsTo(
                Enter.theValue(Variables.Familia()).into(ObjectProductos.DesFamilia),
                Click.on(ObjectProductos.GuardarFamilia),
                Click.on(ObjectProductos.ConFamilia));

        //// OPCION FABRICANTES ////

        // Abrir Fabricantes
        usuario.attemptsTo(Click.on(ObjectProductos.Fabricantes));
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectProductos.AgrFabricantes), WebElementStateMatchers.isVisible()
        ).forNoLongerThan(30).seconds());
        usuario.attemptsTo(Click.on(ObjectProductos.AgrFabricantes));

        // Agregar Datos Fabricantes tiempo de espera - elemento
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectProductos.DesFabricantes),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        // Agregar Datos Fabricantes
        usuario.attemptsTo(
                Enter.theValue(Variables.Fabricante()).into(ObjectProductos.DesFabricantes),
                Click.on(ObjectProductos.GuardarFabricantes),
                Click.on(ObjectProductos.ConFabricantes));

        //// OPCION REFERENCIAS ////

        // Abrir Referencias
        usuario.attemptsTo(Scroll.to(ObjectProductos.Referencias));
        usuario.attemptsTo(Click.on(ObjectProductos.Referencias));

        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectProductos.AlertaProd), WebElementStateMatchers.isNotVisible()
        ).forNoLongerThan(30).seconds());

        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectProductos.AgrReferencias), WebElementStateMatchers.isVisible()
        ).forNoLongerThan(30).seconds());
        usuario.attemptsTo(Click.on(ObjectProductos.AgrReferencias));

        // Agregar Datos Referencias tiempo de espera - elemento
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectProductos.DesReferencias),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        // Agregar Datos Referencias
        usuario.attemptsTo(
                Enter.theValue(Variables.Referencia()).into(ObjectProductos.DesReferencias),
                Click.on(ObjectProductos.GuardarRef),
                Click.on(ObjectProductos.ConReferencias));

        //// OPCION CLASIFICACIONES ////

        // Abrir Clasificaciones
        usuario.attemptsTo(Scroll.to(ObjectProductos.Clasificaciones));
        usuario.attemptsTo(Click.on(ObjectProductos.Clasificaciones));
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectProductos.AgrClasificaciones), WebElementStateMatchers.isVisible()
        ).forNoLongerThan(30).seconds());
        usuario.attemptsTo(Click.on(ObjectProductos.AgrClasificaciones));

        // Agregar Datos Clasificaciones tiempo de espera - elemento
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectProductos.DesClasificaciones),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        // Agregar Datos Clasificaciones
        usuario.attemptsTo(
                Enter.theValue(Variables.Clasificacion()).into(ObjectProductos.DesClasificaciones),
                Click.on(ObjectProductos.GuardarClasif),
                Click.on(ObjectProductos.ConClasif));

        //// OPCION MARCAS ////

        // Abrir Marcas
        usuario.attemptsTo(Scroll.to(ObjectProductos.Marcas));
        usuario.attemptsTo(Click.on(ObjectProductos.Marcas));

        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectProductos.AlertaProd), WebElementStateMatchers.isNotVisible()
        ).forNoLongerThan(30).seconds());

        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectProductos.AgrMarcas), WebElementStateMatchers.isVisible()
        ).forNoLongerThan(30).seconds());
        usuario.attemptsTo(Click.on(ObjectProductos.AgrMarcas));

        // Agregar Datos Marcas tiempo de espera - elemento
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectProductos.DesMarcas),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        // Agregar Datos Marcas
        usuario.attemptsTo(
                Enter.theValue(Variables.Marca()).into(ObjectProductos.DesMarcas),
                Click.on(ObjectProductos.GuardarMarcas),
                Click.on(ObjectProductos.ConMarcas));

        //// OPCION GESTION PRODUCTO ////

        // Abrir Gestion Producto
        usuario.attemptsTo(Scroll.to(ObjectProductos.Productos));
        usuario.attemptsTo(Click.on(ObjectProductos.Productos));

        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectProductos.AlertaProd), WebElementStateMatchers.isNotVisible()
        ).forNoLongerThan(30).seconds());

        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectProductos.AgrProductos), WebElementStateMatchers.isVisible()
        ).forNoLongerThan(30).seconds());
        usuario.attemptsTo(Click.on(ObjectProductos.AgrProductos));

        // Agregar Datos Gestion Producto tiempo de espera - elemento
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectProductos.DesProducto),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        // Agregar Datos Producto
        usuario.attemptsTo(
                Enter.theValue(Variables.DesProd()).into(ObjectProductos.DesProducto),
                Enter.theValue(Variables.DesProd()).into(ObjectProductos.NombreCorto),
                Enter.theValue(Variables.CodigoRamdonD()).into(ObjectProductos.CodigoProd),
                Click.on(ObjectProductos.FamiliaProd),
                Scroll.to(ObjectProductos.SelFamProd),
                Click.on(ObjectProductos.SelFamProd),
                Click.on(ObjectProductos.ClasifProd),
                Scroll.to(ObjectProductos.SelClasifProd),
                Click.on(ObjectProductos.SelClasifProd),
                Click.on(ObjectProductos.ClasTecProd),
                Scroll.to(ObjectProductos.SelClasTecProd),
                Click.on(ObjectProductos.SelClasTecProd),
                Click.on(ObjectProductos.RefProd),
                Scroll.to(ObjectProductos.SelRefProd),
                Click.on(ObjectProductos.SelRefProd),
                Click.on(ObjectProductos.MarcaProd),
                Scroll.to(ObjectProductos.SelMarcaProd),
                Click.on(ObjectProductos.SelMarcaProd),
                Click.on(ObjectProductos.FabricProd),
                Scroll.to(ObjectProductos.SelFabricProd),
                Click.on(ObjectProductos.SelFabricProd),
                Enter.theValue(Variables.CodigoRamdonD()).into(ObjectProductos.ValorProd),
                Enter.theValue(CargarArchivos.properties.getProperty("AnchoPr")).into(ObjectProductos.AnchoProd),
                Enter.theValue(CargarArchivos.properties.getProperty("AltoPr")).into(ObjectProductos.AltoProd),
                Enter.theValue(CargarArchivos.properties.getProperty("LargoPr")).into(ObjectProductos.LargoProd),
                Enter.theValue(CargarArchivos.properties.getProperty("Kilos")).into(ObjectProductos.PesoProd),
                Click.on(ObjectProductos.UnidadProd),
                Scroll.to(ObjectProductos.SelUnidadProd),
                Click.on(ObjectProductos.SelUnidadProd),
                Click.on(ObjectProductos.FifoProd),
                Click.on(ObjectProductos.FefoProd),
                Click.on(ObjectProductos.GuardarProd),
                Click.on(ObjectProductos.ConProducto));
}
}