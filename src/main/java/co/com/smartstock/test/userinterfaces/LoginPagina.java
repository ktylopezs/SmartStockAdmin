package co.com.smartstock.test.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://35.170.118.110:8088/autenticacion")
public class LoginPagina extends PageObject {
    public static final Target TXT_USUARIO = Target.the("Ingresar Usuario").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ingrese su usuario'])[1]/following::input[1]"));
    public static final Target TXT_PASSWORD = Target.the("Ingresar Password").located(By.xpath("//*[@name=\"Contrasenia\"]"));
    public static final Target BTN_LOGIN = Target.the("Click Login").located(By.xpath("//*[@class=\"MuiButton-label\"]/.."));
    public static final Target TituloPrincipal =  Target.the("Titulo del sitio principal").located(By.xpath("//*[@id=\"root\"]/div[2]/span/div[2]/div/div"));
    public static final Target BTN_ORDENES = Target.the("Boton de ordenes").located(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/ul/div[13]"));
    public static final Target BTN_RENTRADA = Target.the("Boton orden de entrada").located(By.xpath("//h6[contains(text(),'Orden de Entrada')]"));
}