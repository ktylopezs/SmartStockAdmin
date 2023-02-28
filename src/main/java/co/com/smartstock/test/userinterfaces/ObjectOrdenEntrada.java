package co.com.smartstock.test.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ObjectOrdenEntrada extends PageObject {
    public static final Target AGREGARORDENENTRADA = Target.the("BOTON DE AGREGAR ORDEN DE ENTRADA").located(By.xpath("//span[contains(text(),'add')]/../../../button[2]"));
    public static final Target BODEGADESTINO = Target.the("Campo de bodega Destino").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Bodega destino'])[4]/following::input[1]"));

    // Lista de elementos para elegir la bodega
    public static final Target Bodega1 = Target.the("Bodega 1").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Bodega Principal'])[9]/following::li[1]"));
    public static final Target Bodega2 = Target.the("Bodega 2").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Bodega Principal'])[9]/following::li[2]"));
    public static final Target Bodega3 = Target.the("Bodega 3").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Bodega Principal'])[9]/following::li[3]"));
    public static final Target Bodega4 = Target.the("Bodega 4").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Bodega Principal'])[9]/following::li[4]"));
    public static final Target Bodega5 = Target.the("Bodega 5").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Bodega Principal'])[9]/following::li[5]"));

    // Tipo de Documento
    public static final Target TipoDocumento = Target.the("Tipo de documento").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Tipo documento'])[4]/following::input[1]"));
    public static final Target Documento = Target.the("Documento").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Orden de Entrada'])[1]/following::li[1]"));

    // Proveedor
    public static final Target TipoProveedor = Target.the("Tipo de proveedor").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Proveedor'])[4]/following::input[1]"));
    public static final Target Proveedor = Target.the("proveedor").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Proveedor Principal'])[1]/following::li[1]"));

    // Diligenciar Campos Orden Entrada|
    public static final Target Direccionentrega = Target.the("Dirección entrega").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Fecha entrega'])[4]/preceding::input[1]"));
    public static final Target Fechaentrega = Target.the("Fecha entrega").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Fecha entrega'])[4]/following::input[1]"));
    public static final Target Condicioncomercial = Target.the("Condición comercial").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Fecha entrega'])[5]/following::input[1]"));
    public static final Target Docrelacionado = Target.the("Doc. relacionado").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Doc. relacionado'])[1]/following::input[1]"));
    public static final Target Observacion = Target.the("Doc. Observación").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Doc. relacionado'])[2]/following::input[1]"));
    public static final Target Guardar = Target.the("Doc. Guardar orden de compra").located(By.xpath("//span[contains(text(),'Guardar')]"));

    // Agregar detalles - Agregar los productos

    public static final Target Codigoitem = Target.the("Código ítem").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Editar'])[1]/following::input[1]"));
    public static final Target ListaCodigoitem = Target.the("Lista Código ítem").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Editar'])[1]/following::li[1]"));
    public static final Target Descitem = Target.the("Desc. ítem").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Editar'])[1]/following::input[2]"));
    public static final Target ListaDescitem = Target.the("Lista Desc. ítem").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Editar'])[1]/following::li[1]"));
    public static final Target DivisionDestino = Target.the("División Destino").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Editar'])[1]/following::input[3]"));
    public static final Target listaDivisionDestino = Target.the("División Destino").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Editar'])[1]/following::li[1]"));
    public static final Target CantidadSolicitada = Target.the("Cantidad Solicitada").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Editar'])[1]/following::input[4]"));
    public static final Target AgregarProducts = Target.the("Agregar Productos al detalle").located(By.xpath("//span[contains(text(),'Agregar')]"));
    public static final Target CambiarEtapa = Target.the("Cambiar la etapa de la orden de entrada")
            .located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Doc. relacionado'])[2]/following::input[2]/.."));
    public static final Target ListaCambiarEtapa = Target.the("Lista de Cambiar la etapa de la orden de entrada")
            .located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Doc. relacionado'])[2]/following::li[1]/.."));
    public static final Target FinalizarOrden = Target.the("Finalizar la orden de entrada").located(By.xpath("//span[contains(text(),'Continuar')]"));
    public static final Target CerrarVentana = Target.the("Cerrar ventana despues de finalizar la orden").located(By.xpath("//header//button[1]/span[1]/*[1]/*/../../.."));
    public static final Target OrdenObtenida = Target.the("Numero de Orden Obtenida").located(By.xpath("//td[5]"));
}