package co.com.smartstock.test.userinterfaces;

import co.com.smartstock.test.models.Variables;
import javafx.application.Application;
import net.serenitybdd.screenplay.actions.MoveMouseToTarget;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public abstract class ObjectParametros extends Application {

    public static final Target Alerta = Target.the("Alerta ").located(By.xpath("//div[contains(text(),'Cambios almacenados correctamente.')]"));
    public static final Target Parametros = Target.the("Menu Parametros").located(By.xpath("//span[contains(text(),'Parametrización')]"));

    // Agregar Tipos Clientes
    public static final Target TiposClientes = Target.the("Opción Tipos Clientes").located(By.xpath("//h6[normalize-space()='Tipos Clientes']"));
    public static final Target AgrTipoCte = Target.the("Agregar Tipos Clientes").located(By.xpath("//span[contains(text(),'add')]"));
    public static final Target DesTipoCte = Target.the("Nombre Tipos Clientes").located(By.xpath("//input[@name='TipoClienteDescripcion']"));
    public static final Target GuardarTipoCte = Target.the("Guardar Tipos Clientes").located(By.xpath("//span[contains(text(),'Guardar')]"));
    public static final Target ConTipoCte = Target.the("Continuar Tipos Clientes").located(By.xpath("//span[contains(text(),'Continuar')]"));

    // Agregar Etapas
    public static final Target Etapas = Target.the("Opción Etapas").located(By.xpath("//h6[normalize-space()='Etapas']"));
    public static final Target AgrEtapa = Target.the("Agregar Etapa").located(By.xpath("//span[contains(text(),'add')]"));
    public static final Target NomEtapa = Target.the("Nombre Etapa").located(By.xpath("//input[@name='EtapaDescripcion']"));
    public static final Target GuardarEtapa = Target.the("Guardar Etapa").located(By.xpath("//span[contains(text(),'Guardar')]"));
    public static final Target ConEtapa = Target.the("Continuar Etapa").located(By.xpath("//span[contains(text(),'Continuar')]"));

    // Agregar Proveedores
    public static final Target Proveedores = Target.the("Opción Proveedores").located(By.xpath("//h6[normalize-space()='Proveedores']"));
    public static final Target AgrProveedor = Target.the("Agregar Proveedor").located(By.xpath("//span[contains(text(),'add')]"));
    public static final Target NomProveedor = Target.the("Nombre Proveedor").located(By.xpath("//input[@name='DescripcionProveedor']"));
    public static final Target GuardarProveedor = Target.the("Guardar Proveedor").located(By.xpath("//span[contains(text(),'Guardar')]"));
    public static final Target ConProveedor = Target.the("Continuar Proveedor").located(By.xpath("//span[contains(text(),'Continuar')]"));

    // Agregar Clientes
    public static final Target Clientes = Target.the("Opción Clientes").located(By.xpath("//h6[normalize-space()='Clientes']"));
    public static final Target AgrCliente = Target.the("Agregar Cliente").located(By.xpath("//button[@title='Agregar']"));
    public static final Target SelTipoCte = Target.the("Seleccionar tipo cliente").located(By.xpath("//li[normalize-space()='"+ Variables.NombTipoCte()+"']"));
    public static final Target TipoCliente = Target.the("Tipo Cliente").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear Clientes'])[1]/following::div[10]"));
    public static final Target DocCliente = Target.the("Documento Cliente").located(By.xpath("//input[@name='Documento']"));
    public static final Target CiudadCliente = Target.the("Ciudad Cliente").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear Clientes'])[1]/following::input[3]"));
    public static final Target SelCiudadCte = Target.the("Seleccionar Ciudad Cliente").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear Clientes'])[1]/following::li[1]"));
    public static final Target NomCliente = Target.the("Nombre Cliente").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear Clientes'])[1]/following::input[4]"));
    public static final Target ContactoCte = Target.the("Contacto Cliente").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear Clientes'])[1]/following::input[6]"));
    public static final Target TelefonoCte = Target.the("Telefono Cliente").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear Clientes'])[1]/following::input[7]"));
    public static final Target DireccionCte = Target.the("Direccion Cliente").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear Clientes'])[1]/following::input[8]"));
    public static final Target CorreoCte = Target.the("Correo Cliente").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear Clientes'])[1]/following::input[9]"));
    public static final Target GuardarCliente = Target.the("Guardar Cliente").located(By.xpath("//span[contains(text(),'Guardar')]"));
    public static final Target ConCliente = Target.the("Continuar Cliente").located(By.xpath("//span[contains(text(),'Continuar')]"));

    // Agregar Flujo Etapas
    public static final Target FlujoEtapas = Target.the("Opción Flujo Etapas").located(By.xpath("//h6[contains(text(),'Flujo Etapas')]"));
    public static final Target AgrFlujoEtapas = Target.the("Agregar Flujo Etapas").located(By.xpath("//span[contains(text(),'add')]"));
    public static final Target DesFlujoEtapas = Target.the("Descripcion Flujo Etapas").located(By.xpath("//input[@name='FlujoDescripcion']"));
    public static final Target ActFlujoEtapas = Target.the("Activar Flujo Etapas").located(By.xpath("//input[@name='Estado']"));
    public static final Target EtSigFlujoEtapas = Target.the("Siguiente Etapa").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Flujo Etapas'])[1]/following::input[6]"));
    public static final Target SelEtSigFlEtapa = Target.the("Seleccionar Siguiente Etapa").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Flujo Etapas'])[1]/following::li[1]"));
    public static final Target GuardarFlEtapas1 = Target.the("Guardar Flujo Etapas").located(By.xpath("//span[contains(text(),'Guardar')]"));
    public static final Target EtActFlEtapa = Target.the("Etapa Actual").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Flujo Etapas'])[1]/following::input[5]"));
    public static final Target SelEtActFlEtapa = Target.the("Seleccionar Etapa Actual").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Flujo Etapas'])[1]/following::li[1]"));
    public static final Target GuardarFlEtapas2 = Target.the("Guardar Flujo Etapas").located(By.xpath("//span[contains(text(),'Guardar')]"));
    public static final Target AlertaFlEtapa = Target.the("Alerta Guardar Flujo Etapas").located(By.xpath("//div[contains(text(),'El registro se ha eliminado correctamente.')]"));
    public static final Target CerrarFlEtapas = Target.the("Cerrar Flujo Etapas").located(By.xpath("//header//button[1]/span[1]/*[1]/*/../../.."));

    // Agregar Tipos Documento
    public static final Target TiposDoc = Target.the("Opción Tipos Documento").located(By.xpath("//h6[contains(text(),'Tipos Documento')]"));
    public static final Target AgrTipoDoc = Target.the("Agregar Tipos Documento").located(By.xpath("//span[contains(text(),'add')]"));
    public static final Target SelTipoDoc = Target.the("Tipo Documento").located(By.xpath("//li[normalize-space()='"+Variables.TipoProceso()+"']"));
    public static final Target SelFlujo = Target.the("Flujo").located(By.xpath("//li[normalize-space()='"+Variables.DesFlEtapa()+"']"));
    public static final Target TipPro = Target.the("Seleccionar Tipo Proceso").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear Tipo de Documento'])[1]/following::div[12]"));
    public static final Target FlujoPro = Target.the("Seleccionar Flujo del Proceso").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear Tipo de Documento'])[1]/following::div[16]"));
    public static final Target DesTipoDoc = Target.the("Descripcion Tipo Documentos").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear Tipo de Documento'])[1]/following::input[4]"));
    public static final Target AbrTipoDoc = Target.the("Abreviatura Tipo Documento").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear Tipo de Documento'])[1]/following::input[5]"));
    public static final Target EdoTipoDoc = Target.the("Activar Tipo Documento").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear Tipo de Documento'])[1]/following::input[7]"));
    public static final Target AcMovTipoDoc = Target.the("Activar Sincronizar Movil Tipo Documento").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear Tipo de Documento'])[1]/following::input[8]"));
    public static final Target GuardarTipoDoc = Target.the("Guardar Tipo Documento").located(By.xpath("//span[contains(text(),'Guardar')]"));

    // Asignar Permisos Tipos Documento
    public static final Target EdiDocCre = Target.the("Editar Documento Etapa Creado").located(By
            .xpath("(.//*[normalize-space(text()) and normalize-space(.)='Editar Tipo de Documento'])[1]/following::input[11]"));
    public static final Target AnuDocCre = Target.the("Anular Documento Etapa Creado").located(By
            .xpath("(.//*[normalize-space(text()) and normalize-space(.)='Editar Tipo de Documento'])[1]/following::input[12]"));
    public static final Target AgrDetDocCre = Target.the("Agregar Detalle Documento Etapa Creado").located(By
            .xpath("(.//*[normalize-space(text()) and normalize-space(.)='Editar Tipo de Documento'])[1]/following::input[13]"));
    public static final Target EdiDetDocCre = Target.the("Editar Detalle Documento Etapa Creado").located(By
            .xpath("(.//*[normalize-space(text()) and normalize-space(.)='Editar Tipo de Documento'])[1]/following::input[14]"));
    public static final Target EliDetDocCre = Target.the("Eliminar Detalle Documento Etapa Creado").located(By
            .xpath("(.//*[normalize-space(text()) and normalize-space(.)='Editar Tipo de Documento'])[1]/following::input[15]"));
    public static final Target CEtaDocCre = Target.the("Cambiar Etapa Documento Etapa Creado").located(By
            .xpath("(.//*[normalize-space(text()) and normalize-space(.)='Editar Tipo de Documento'])[1]/following::input[16]"));
    public static final Target GMovDocCre = Target.the("Gestion Movil Documento Etapa Creado").located(By
            .xpath("(.//*[normalize-space(text()) and normalize-space(.)='Editar Tipo de Documento'])[1]/following::input[17]"));
    public static final Target CEtaDocEt = Target.the("Cambiar Etapa Documento Siguiente Etapa").located(By
            .xpath("(.//*[normalize-space(text()) and normalize-space(.)='Editar Tipo de Documento'])[1]/following::input[25]"));
    public static final Target CEGMtaDocEt = Target.the("Cambiar Etapa Movil Documento Siguiente Etapa").located(By
            .xpath("(.//*[normalize-space(text()) and normalize-space(.)='Editar Tipo de Documento'])[1]/following::input[27]"));
    public static final Target AfecInvDocF = Target.the("Afectar Inventario Documento Etapa Finalizado ").located(By
            .xpath("(.//*[normalize-space(text()) and normalize-space(.)='Editar Tipo de Documento'])[1]/following::input[28]"));
    public static final Target GuardarAPer = Target.the("Guardar Asignar Permisos Tipo Documento").located(By.xpath("//span[contains(text(),'Guardar')]"));
    public static final Target CerrarTipDoc = Target.the("Cerrar Tipo Documento").located(By.xpath("//header//button[1]/span[1]/*[1]/*/../../.."));
    public static final Target ConTipDoc = Target.the("Continuar Tipo Documento").located(By.xpath("//span[contains(text(),'Continuar')]"));

}
