package co.com.smartstock.test.tasks;

import net.serenitybdd.screenplay.*;

public class EntradaInventario implements Task {

    public static EntradaInventario Productos() {
        return Tasks.instrumented(EntradaInventario.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }


}
