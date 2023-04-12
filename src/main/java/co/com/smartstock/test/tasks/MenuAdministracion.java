package co.com.smartstock.test.tasks;

import co.com.smartstock.test.models.Variables;
import co.com.smartstock.test.userinterfaces.ObjectAdministracion;
import co.com.smartstock.test.utils.CargarArchivos;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.Wait;
import org.openqa.selenium.By;

import java.io.IOException;


public class MenuAdministracion implements Task  {

    public static MenuAdministracion Admin() {return Tasks.instrumented(MenuAdministracion.class);}

    @Override
    public <T extends Actor> void performAs(T usuario) {

        //// MENU ADMINISTRACION ////

        try {
            CargarArchivos.Administracion();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Desplegar menu administracion
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectAdministracion.Admin),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());
        usuario.attemptsTo(Click.on(ObjectAdministracion.Admin));

        //// OPCION PERFIL ////

        // Abrir Perfil
        usuario.attemptsTo(Click.on(ObjectAdministracion.Perfil));

        try { Thread.sleep(3000); } catch (InterruptedException e) { throw new RuntimeException(e); }

        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectAdministracion.AgrPerfil), WebElementStateMatchers.isVisible()
        ).forNoLongerThan(30).seconds());
        usuario.attemptsTo(Click.on(ObjectAdministracion.AgrPerfil));

        // Agregar Datos Perfil tiempo de espera - elemento
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectAdministracion.NomPerfil),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        // Agregar Datos Perfil
        usuario.attemptsTo(
                Enter.theValue(Variables.NomPerfil()).into(ObjectAdministracion.NomPerfil),
                Enter.theValue(CargarArchivos.properties.getProperty("Descripcion")).into(ObjectAdministracion.DesPerfil),
                Click.on(ObjectAdministracion.GuardarPerfil),
                Click.on(ObjectAdministracion.ConPerfil));

        //// OPCION PERMISOS ////

        // Abrir Permisos

        usuario.attemptsTo(Click.on(ObjectAdministracion.Permisos));

        // Asignar permisos tiempo de espera - elemento
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectAdministracion.BuscarPermisos),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        // Asignar Permisos
        usuario.attemptsTo(
                Click.on(ObjectAdministracion.BuscarPermisos),
                Enter.theValue(Variables.NomPerfil()).into(ObjectAdministracion.BuscarPermisos),
                Click.on(ObjectAdministracion.AsignarPermisos),
                Click.on(ObjectAdministracion.PermisosBodegas),
                Click.on(ObjectAdministracion.PermisosOrden),
                Click.on(ObjectAdministracion.PermisosOE),
                Click.on(ObjectAdministracion.PermisosCerrarOrden),
                Click.on(ObjectAdministracion.PermisosProces),
                Click.on(ObjectAdministracion.PermisosEI),
                Click.on(ObjectAdministracion.PermisosCerrarProces),
                Click.on(ObjectAdministracion.EditarPermisos)
        );

        //// OPCION AGENCIA ////

        // Abrir Agencia

        usuario.attemptsTo(Click.on(ObjectAdministracion.Agencia));
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectAdministracion.AgrAgencia), WebElementStateMatchers.isVisible()
        ).forNoLongerThan(30).seconds());

        try { Thread.sleep(3000); } catch (InterruptedException e) { throw new RuntimeException(e); }

        usuario.attemptsTo(Click.on(ObjectAdministracion.AgrAgencia));

        // Agregar datos agencia tiempo de espera - elemento
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectAdministracion.CodAgencia),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        // Agregar Datos Agencia
        usuario.attemptsTo(
                Enter.theValue(Variables.CodigoRamdonD()).into(ObjectAdministracion.CodAgencia),
                Enter.theValue(Variables.NombAgencia()).into(ObjectAdministracion.NomAgencia),
                Enter.theValue(CargarArchivos.properties.getProperty("DireccionAg")).into(ObjectAdministracion.DirAgencia),
                Enter.theValue(CargarArchivos.properties.getProperty("TelefonoAg") + Variables.CodigoRamdonD()).into(ObjectAdministracion.TelAgencia),
                Enter.theValue(CargarArchivos.properties.getProperty("CelularAg")  + Variables.CodigoRamdonD()).into(ObjectAdministracion.CelAgencia),
                Enter.theValue(CargarArchivos.properties.getProperty("LongitudAg") + Variables.CodigoRamdonD()).into(ObjectAdministracion.LongitudAg),
                Enter.theValue(CargarArchivos.properties.getProperty("LatitudAg")  + Variables.CodigoRamdonD()).into(ObjectAdministracion.LatitudAg),
                Click.on(ObjectAdministracion.GuardarAg),
                Click.on(ObjectAdministracion.ConfirmarAg));

        //// OPCION USUARIO ////

        // Abrir Persona

        usuario.attemptsTo(Click.on(ObjectAdministracion.Usuario));
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectAdministracion.AgrUsuario), WebElementStateMatchers.isVisible()
        ).forNoLongerThan(30).seconds());

        try { Thread.sleep(6000); } catch (InterruptedException e) { throw new RuntimeException(e); }

        usuario.attemptsTo(Click.on(ObjectAdministracion.AgrUsuario));

        // Agregar datos Persona tiempo de espera - elemento
        usuario.attemptsTo(Wait.until(
                WebElementQuestion.the(ObjectAdministracion.TipoIDUsuario),
                WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds());

        // Agregar Datos Persona
        usuario.attemptsTo(
                Click.on(ObjectAdministracion.TipoIDUsuario),
                Click.on(ObjectAdministracion.SelTipoIDUsr),
                Enter.theValue(Variables.CodigoRamdonD()).into(ObjectAdministracion.NumIDUsr),
                Enter.theValue(Variables.NombPersona()).into(ObjectAdministracion.Nombre1Usr),
                Enter.theValue(CargarArchivos.properties.getProperty("ApellidoUsr") + ' ' + Variables.CodigoRamdonD()).into(ObjectAdministracion.Apellido1Usr),
                Enter.theValue(CargarArchivos.properties.getProperty("DirUsr")).into(ObjectAdministracion.DireccionUsr),
                Enter.theValue(CargarArchivos.properties.getProperty("TelUsr") + Variables.CodigoRamdonD()).into(ObjectAdministracion.TelefonoUsr),
                Enter.theValue(Variables.CodigoRamdonD() + CargarArchivos.properties.getProperty("CorreoUsr")).into(ObjectAdministracion.EmailUsr),
                Click.on(ObjectAdministracion.Guardarper),
                Click.on(ObjectAdministracion.Confirmarper));

        // Abrir Usuario

        try { Thread.sleep(3000); } catch (InterruptedException e) { throw new RuntimeException(e); }
        usuario.should(EventualConsequence.eventually(GivenWhenThen.seeThat(
                WebElementQuestion.the(ObjectAdministracion.TipoIDUsuario),
                WebElementStateMatchers.isEnabled())
        ).waitingForNoLongerThan(30).seconds());

        // Agregar Datos Usuario
        usuario.attemptsTo(
                Click.on(ObjectAdministracion.TipoUsr),
                Click.on(ObjectAdministracion.SelTipoUsr),
                Enter.theValue(Variables.LoginUsr()).into(ObjectAdministracion.LoginUsr),
                Enter.theValue(Variables.LoginUsr()).into(ObjectAdministracion.ClaveUsr),
                Enter.theValue(Variables.LoginUsr()).into(ObjectAdministracion.ConfClaveUsr),
                Click.on(ObjectAdministracion.GuardarUsr),
                Click.on(ObjectAdministracion.ConfirmarUsr));

        // Agregar Agencia Usuario

        usuario.attemptsTo(
                Click.on(ObjectAdministracion.AgenciaUsr),
                Click.on(ObjectAdministracion.SelgenciaUsr),
                Click.on(ObjectAdministracion.PerfilUsr),
                Click.on(ObjectAdministracion.SelPerfilUsr),
                Click.on(ObjectAdministracion.AgrPerfilAge));

        // Cerrar Pantalla Usuario
        usuario.attemptsTo(
                Click.on(ObjectAdministracion.CerrarUsr));

    }

}
