package co.com.smartstock.test.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.nio.charset.StandardCharsets;

public class ObjectEntradaInventario extends PageObject {
    public static final Target Procesos = Target.the("Procesos").located(By.xpath("//span[contains(text(),'Procesos')]"));
    public static final Target EntradaInv = Target.the("Entrada de inventarios").located(By.xpath("//h6[contains(text(),'Entrada de Inventario')]"));
    public static final Target AgregarInv = Target.the("Agregar Inventario").located(By.xpath("//span[contains(text(),'add')]/../.."));
    public static final Target BuscarInv = Target.the("Buscar Numero de inventario")
            .located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Código documento base'])[1]/following::input[1]"));


}
