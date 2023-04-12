package co.com.smartstock.test.tasks;

import co.com.smartstock.test.models.Variables;
import co.com.smartstock.test.userinterfaces.ObjectParametros;
import co.com.smartstock.test.utils.CargarArchivos;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.Wait;
import org.openqa.selenium.By;

import javax.swing.Action;
import java.io.IOException;


public class MenuParametros implements Task  {

    public static MenuParametros Parametros() {return Tasks.instrumented(MenuParametros.class);}

    @Override
    public <T extends Actor> void performAs(T usuario) {

        //// MENU PARAMETROS ////

        try {
            CargarArchivos.Parametros();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Desplegar menu parametros

        // Tiempo de espera - elemento
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectParametros.Alerta), WebElementStateMatchers.isNotVisible()
        ).forNoLongerThan(30).seconds());

        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectParametros.Parametros),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());
        usuario.attemptsTo(Click.on(ObjectParametros.Parametros));

        //// OPCION TIPOS CLIENTES ////

        // Abrir Tipos Clientes

        usuario.attemptsTo(Click.on(ObjectParametros.TiposClientes));

        try { Thread.sleep(3000); } catch (InterruptedException e) { throw new RuntimeException(e); }

        usuario.should(EventualConsequence.eventually(GivenWhenThen.seeThat(
                WebElementQuestion.the(ObjectParametros.AgrTipoCte),
                WebElementStateMatchers.isClickable())
        ).waitingForNoLongerThan(60).seconds());

        usuario.attemptsTo(Click.on(ObjectParametros.AgrTipoCte));

        // Agregar Datos Tipos Clientes tiempo de espera - elemento
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectParametros.DesTipoCte),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        // Agregar Datos Tipo Cliente
        usuario.attemptsTo(
                Enter.theValue(Variables.NombTipoCte()).into(ObjectParametros.DesTipoCte),
                Click.on(ObjectParametros.GuardarTipoCte),
                Click.on(ObjectParametros.ConTipoCte));

        //// OPCION ETAPAS ////

        // Abrir Etapas

        usuario.attemptsTo(Click.on(ObjectParametros.Etapas));
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectParametros.AgrEtapa), WebElementStateMatchers.isVisible()
        ).forNoLongerThan(60).seconds());
        usuario.attemptsTo(Click.on(ObjectParametros.AgrEtapa));

        // Agregar Datos Etapas tiempo de espera - elemento
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectParametros.NomEtapa),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        // Agregar Datos Etapa
        usuario.attemptsTo(
                Enter.theValue(Variables.NombEtapa()).into(ObjectParametros.NomEtapa),
                Click.on(ObjectParametros.GuardarEtapa),
                Click.on(ObjectParametros.ConEtapa));

        //// OPCION PROVEEDORES ////

        // Abrir Proveedores

        usuario.attemptsTo(Click.on(ObjectParametros.Proveedores));

        try { Thread.sleep(3000); } catch (InterruptedException e) { throw new RuntimeException(e); }

        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectParametros.AgrProveedor), WebElementStateMatchers.isVisible()
        ).forNoLongerThan(30).seconds());
        usuario.attemptsTo(Click.on(ObjectParametros.AgrProveedor));

        // Agregar Datos Proveedor tiempo de espera - elemento
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectParametros.NomProveedor),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        // Agregar Datos Proveedor
        usuario.attemptsTo(
                Enter.theValue(Variables.NombProveedor()).into(ObjectParametros.NomProveedor),
                Click.on(ObjectParametros.GuardarProveedor),
                Click.on(ObjectParametros.ConProveedor));

        //// OPCION CLIENTES ////

        // Abrir Clientes

        usuario.attemptsTo(Click.on(ObjectParametros.Clientes));
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectParametros.AgrCliente),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(10).seconds());

        // Agregar datos cliente tiempo de espera - elemento
        try { Thread.sleep(6000); } catch (InterruptedException e) { throw new RuntimeException(e); }

        usuario.attemptsTo(Click.on(ObjectParametros.AgrCliente));
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectParametros.TipoCliente),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        // Agregar Datos Cliente
        usuario.attemptsTo(
                Click.on(ObjectParametros.TipoCliente),
                Click.on(ObjectParametros.SelTipoCte),
                Enter.theValue(Variables.CodigoRamdonD()).into(ObjectParametros.DocCliente));

        // Agregar datos cliente tiempo de espera - elemento
        usuario.should(EventualConsequence.eventually(GivenWhenThen.seeThat(
                WebElementQuestion.the(ObjectParametros.CiudadCliente),
                WebElementStateMatchers.isEnabled())
        ).waitingForNoLongerThan(30).seconds());

        usuario.attemptsTo(
                Enter.theValue(CargarArchivos.properties.getProperty("CiudadCt")).into(ObjectParametros.CiudadCliente),
                Click.on(ObjectParametros.SelCiudadCte),
                Enter.theValue(CargarArchivos.properties.getProperty("NomCte") + ' ' + Variables.CodigoRamdonD()).into(ObjectParametros.NomCliente),
                Enter.theValue(CargarArchivos.properties.getProperty("NomContacto") + ' ' + Variables.CodigoRamdonD()).into(ObjectParametros.ContactoCte),
                Enter.theValue(CargarArchivos.properties.getProperty("TelCte") + Variables.CodigoRamdonD()).into(ObjectParametros.TelefonoCte),
                Enter.theValue(CargarArchivos.properties.getProperty("DirCte")).into(ObjectParametros.DireccionCte),
                Enter.theValue(CargarArchivos.properties.getProperty("NomCte") + Variables.CodigoRamdonD() + CargarArchivos.properties.getProperty("CorreoCte")).into(ObjectParametros.CorreoCte),
                Click.on(ObjectParametros.GuardarCliente),
                Click.on(ObjectParametros.ConCliente));

        //// OPCION FLUJO ETAPAS ////

        // Abrir Flujo Etapas

        usuario.attemptsTo(Click.on(ObjectParametros.FlujoEtapas));

        try { Thread.sleep(3000); } catch (InterruptedException e) { throw new RuntimeException(e); }

        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectParametros.AgrFlujoEtapas), WebElementStateMatchers.isVisible()
        ).forNoLongerThan(30).seconds());
        usuario.attemptsTo(Click.on(ObjectParametros.AgrFlujoEtapas));

        // Agregar datos Flujo Etapas tiempo de espera - elemento
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectParametros.DesFlujoEtapas), WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        // Agregar Datos Flujo Etapas
        usuario.attemptsTo(
                Enter.theValue(Variables.DesFlEtapa()).into(ObjectParametros.DesFlujoEtapas),
                Enter.theValue(Variables.NombEtapa()).into(ObjectParametros.EtSigFlujoEtapas),
                Click.on(ObjectParametros.SelEtSigFlEtapa),
                Click.on(ObjectParametros.GuardarFlEtapas1),
                Enter.theValue(Variables.NombEtapa()).into(ObjectParametros.EtActFlEtapa),
                Click.on(ObjectParametros.SelEtActFlEtapa),
                Enter.theValue(CargarArchivos.properties.getProperty("EtapaFin")).into(ObjectParametros.EtSigFlujoEtapas),
                Click.on(ObjectParametros.SelEtSigFlEtapa),
                Click.on(ObjectParametros.GuardarFlEtapas2));

        // Agregar datos Flujo Etapas tiempo de espera - elemento
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectParametros.AlertaFlEtapa), WebElementStateMatchers.isNotVisible()
        ).forNoLongerThan(30).seconds());

        // Cerrar Flujo Etapas
        usuario.attemptsTo(Click.on(ObjectParametros.CerrarFlEtapas));

        //// OPCION TIPOS DOCUMENTOS ////

        // Abrir Tipos Documentos

        usuario.attemptsTo(Click.on(ObjectParametros.TiposDoc));

        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectParametros.AgrTipoDoc), WebElementStateMatchers.isVisible()
        ).forNoLongerThan(30).seconds());

        try { Thread.sleep(2000); } catch (InterruptedException e) { throw new RuntimeException(e); }

        usuario.attemptsTo(Click.on(ObjectParametros.AgrTipoDoc));

        // Agregar datos Tipos Documentos tiempo de espera - elemento
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectParametros.TipPro), WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        // Agregar Datos Tipos Documentos
        usuario.attemptsTo(
                Click.on(ObjectParametros.TipPro),
                Click.on(ObjectParametros.SelTipoDoc),
                Click.on(ObjectParametros.FlujoPro),
                Click.on(ObjectParametros.SelFlujo),
                Enter.theValue(Variables.DescTipDoc()).into(ObjectParametros.DesTipoDoc),
                Enter.theValue(CargarArchivos.properties.getProperty("Abr1") + Variables.CodigoRamdonD() + CargarArchivos.properties.getProperty("Abr2")).into(ObjectParametros.AbrTipoDoc),
                Click.on(ObjectParametros.EdoTipoDoc),
                Click.on(ObjectParametros.AcMovTipoDoc),
                Click.on(ObjectParametros.GuardarTipoDoc));

        // Asignar Permisos Tipos Documentos
        usuario.attemptsTo(
                Click.on(ObjectParametros.AfecInvDocF),
                Click.on(ObjectParametros.EdiDocCre),
                Click.on(ObjectParametros.AnuDocCre),
                Click.on(ObjectParametros.AgrDetDocCre),
                Click.on(ObjectParametros.EdiDetDocCre),
                Click.on(ObjectParametros.EliDetDocCre),
                Click.on(ObjectParametros.CEtaDocCre),
                Click.on(ObjectParametros.GMovDocCre),
                Click.on(ObjectParametros.CEtaDocEt),
                Click.on(ObjectParametros.CEGMtaDocEt),
                Click.on(ObjectParametros.GuardarAPer));

        // Tiempo de espera - elemento
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectParametros.Alerta), WebElementStateMatchers.isNotVisible()
        ).forNoLongerThan(30).seconds());


        // Cerrar Tipos Documentos
        usuario.attemptsTo(
            Click.on(ObjectParametros.CerrarTipDoc),
            Click.on(ObjectParametros.ConTipDoc));
    }

}