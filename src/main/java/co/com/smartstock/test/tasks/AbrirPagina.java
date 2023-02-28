package co.com.smartstock.test.tasks;

import co.com.smartstock.test.interactions.Login;
import co.com.smartstock.test.userinterfaces.LoginPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task {
    private LoginPagina loginPage;

    public static AbrirPagina urlApp() {
        return (AbrirPagina) Tasks.instrumented(AbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(loginPage));
        actor.attemptsTo(Login.credenciales());
    }
}
