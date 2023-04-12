package co.com.smartstock.test.userinterfaces;

import co.com.smartstock.test.models.Variables;
import javafx.application.Application;
import net.serenitybdd.screenplay.actions.MoveMouseToTarget;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public abstract class ObjectBodegas extends Application {

    public static final Target AlertaBod = Target.the("Alerta Crear Bodega").located(By.xpath("//div[contains(text(),'Cambios almacenados correctamente.')]"));
    public static final Target Bodegas = Target.the("Menu Bodegas").located(By.xpath("//span[contains(text(),'Bodegas')]"));

    // Agregar Tipos Bodegas
    public static final Target TiposBodegas = Target.the("Opción Tipos Bodegas").located(By.xpath("//h6[contains(text(),'Tipos Bodegas')]"));
    public static final Target AgrTipBodega = Target.the("Agregar Tipo Bodega").located(By.xpath("//span[contains(text(),'add')]"));
    public static final Target DesTipoBod = Target.the("Nombre Tipo Bodega").located(By.xpath("//input[@name='TipoBodegaDescripcion']"));
    public static final Target GuardarTipoBod = Target.the("Guardar Tipo Bodega").located(By.xpath("//span[contains(text(),'Guardar')]"));
    public static final Target ConTipoBod = Target.the("Continuar Tipo Bodega").located(By.xpath("//span[contains(text(),'Continuar')]"));

    // Agregar Filas
    public static final Target Filas = Target.the("Opción Fila").located(By.xpath("//h6[contains(text(),'Filas')]"));
    public static final Target AgrFila = Target.the("Agregar Fila").located(By.xpath("//span[contains(text(),'add')]"));
    public static final Target DesFila = Target.the("Nombre Fila").located(By.xpath("//input[@name='DescripcionFila']"));
    public static final Target GuardarFila = Target.the("Guardar Fila").located(By.xpath("//span[contains(text(),'Guardar')]"));
    public static final Target ConFila = Target.the("Continuar Fila").located(By.xpath("//span[contains(text(),'Continuar')]"));

    // Agregar Tipos Divisiones
    public static final Target TiposDiv = Target.the("Opción Tipos Divisiones").located(By.xpath("//h6[contains(text(),'Tipos Divisiones')]"));
    public static final Target AgrTipDiv = Target.the("Agregar Tipos Divisiones").located(By.xpath("//span[contains(text(),'add')]"));
    public static final Target DesTipDiv = Target.the("Nombre Tipo Division").located(By.xpath("//input[@name='TipoDivisionDescripcion']"));
    public static final Target GuardarTipDiv = Target.the("Guardar Tipo Division").located(By.xpath("//span[contains(text(),'Guardar')]"));
    public static final Target ConTipDiv = Target.the("Continuar Tipo Division").located(By.xpath("//span[contains(text(),'Continuar')]"));

    // Agregar Pisos
    public static final Target Pisos = Target.the("Opción Pisos").located(By.xpath("//h6[contains(text(),'Pisos')]"));
    public static final Target AgrPisos = Target.the("Agregar Pisos").located(By.xpath("//span[contains(text(),'add')]"));
    public static final Target DesPisos = Target.the("Nombre Pisos").located(By.xpath("//input[@name='DescripcionPiso']"));
    public static final Target GuardarPisos = Target.the("Guardar Pisos").located(By.xpath("//span[contains(text(),'Guardar')]"));
    public static final Target ConPisos = Target.the("Continuar Pisos").located(By.xpath("//span[contains(text(),'Continuar')]"));

    // Agregar Columnas
    public static final Target Columnas = Target.the("Opción Columnas").located(By.xpath("//h6[contains(text(),'Columnas')]"));
    public static final Target AgrColumnas = Target.the("Agregar Columnas").located(By.xpath("//span[contains(text(),'add')]"));
    public static final Target DesColumnas = Target.the("Nombre Columnas").located(By.xpath("//input[@name='DescripcionColumna']"));
    public static final Target GuardarColumnas = Target.the("Guardar Columnas").located(By.xpath("//span[contains(text(),'Guardar')]"));
    public static final Target ConColumnas = Target.the("Continuar Columnas").located(By.xpath("//span[contains(text(),'Continuar')]"));

    // Gestión Bodegas
    public static final Target GBodegas = Target.the("Opción Gestion Bodegas").located(By.xpath("//h6[contains(text(),'Gestión bodegas')]"));
    public static final Target AgrBodega = Target.the("Agregar Columnas").located(By.xpath("//span[contains(text(),'add')]"));
    public static final Target DesBodega = Target.the("Descripcion Bodega").located(By.xpath("//input[@name='BodegaDescripcion']"));
    public static final Target CodBodega = Target.the("Codigo Bodega").located(By.xpath("//input[@name='BodegaCodigo']"));
    public static final Target DirBodega = Target.the("Direccion Bodega").located(By.xpath("//input[@name='Direccion']"));
    public static final Target TipoBodega = Target.the("Tipo Bodega").located(By.xpath("//div[@id='mui-component-select-TipoBodegaId']"));
    public static final Target SelTipoBod = Target.the("Seleccionar tipo bodega").located(By.xpath("//li[normalize-space()='"+ Variables.NombTipoBod()+"']"));
    public static final Target CiudadBodega = Target.the("Ciudad Bodega").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear bodega'])[1]/following::input[5]"));
    public static final Target SelCiuBodega = Target.the("Sel Ciudad Bodega").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear bodega'])[1]/following::li[1]"));
    public static final Target AnchoBodega = Target.the("Ancho Bodega").located(By.xpath("//input[@name='Ancho']"));
    public static final Target LargoBodega = Target.the("Largo Bodega").located(By.xpath("//input[@name='Largo']"));
    public static final Target AltoBodega = Target.the("Alto Bodega").located(By.xpath("//input[@name='Alto']"));
    public static final Target LatitudBodega = Target.the("Latitud Bodega").located(By.xpath("//input[@name='Latitud']"));
    public static final Target LongitudBodega = Target.the("Longitud Bodega").located(By.xpath("//input[@name='Longitud']"));
    public static final Target GuardarBodega = Target.the("Guardar Bodega").located(By.xpath("//span[contains(text(),'Guardar')]"));
    public static final Target ConBodega = Target.the("Continuar Bodega").located(By.xpath("//span[contains(text(),'Continuar')]"));
    public static final Target DivBodega = Target.the("Division Bodega").located(By.xpath("//span[contains(text(),'Divisiones bodega')]"));
    public static final Target AgrDivBodega = Target.the("Agregar Division Bodega").located(By.xpath("//span[contains(text(),'Agregar')]"));
    public static final Target DesDivBodega = Target.the("Descripcion Division Bodega").located(By.xpath("//input[@name='DivisionDescripcion']"));
    public static final Target TipDivBodega = Target.the("Tipo Division Bodega").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear división'])[1]/following::div[15]"));
    public static final Target SelTipoDiv = Target.the("Seleccionar tipo division").located(By.xpath("//li[normalize-space()='"+Variables.NombTipDiv()+"']"));
    public static final Target FilaDvBodega = Target.the("Fila Division Bodega").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear división'])[1]/following::div[19]"));
    public static final Target SelFila = Target.the("Seleccionar Columna").located(By.xpath("//li[normalize-space()='"+Variables.NombFila()+"']"));
    public static final Target ColDvBodega = Target.the("Columna Division Bodega").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear división'])[1]/following::div[23]"));
    public static final Target SelColumna = Target.the("Seleccionar Columna").located(By.xpath("//li[normalize-space()='"+Variables.NombColumna()+"']"));
    public static final Target PisoDvBodega = Target.the("Piso Division Bodega").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear división'])[1]/following::div[27]"));
    public static final Target SelPiso = Target.the("Seleccionar Piso").located(By.xpath("//li[normalize-space()='"+Variables.NombPisos()+"']"));
    public static final Target AnchoDvBodega = Target.the("Ancho Division Bodega").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear división'])[1]/following::input[8]"));
    public static final Target LargoDvBodega = Target.the("Largo Division Bodega").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear división'])[1]/following::input[9]"));
    public static final Target AltoDvBodega = Target.the("Alto Division Bodega").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear división'])[1]/following::input[10]"));
    public static final Target PesoDvBodega = Target.the("Peso Division Bodega").located(By.xpath("//input[@name='Peso']"));
    public static final Target GuardarDvBodega = Target.the("Guardar Bodega").located(By.xpath("//span[contains(text(),'Guardar')]"));
    public static final Target ConDvBodega = Target.the("Continuar Bodega").located(By.xpath("//span[contains(text(),'Continuar')]"));
    public static final Target CerrarBodega = Target.the("Cerrar Bodega").located(By.xpath("//span[contains(text(),'Cerrar')]"));
    public static final Target ConCerrarBodega = Target.the("Continuar Cerrar Bodega").located(By.xpath("//span[contains(text(),'Continuar')]"));
    public static final Target BuscarBodega = Target.the("Buscar Bodega").located(By.xpath("//input[@placeholder='Buscar']"));
    public static final Target EditarBodega = Target.the("Editar Bodega").located(By.xpath("//button[@title='Editar']"));
    public static final Target PersonaBodega = Target.the("Persona Bodega").located(By.xpath("//span[contains(text(),'Personas asociadas')]"));
    public static final Target AgrPerBodega = Target.the("Agregar Persona Bodega").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Refrescar'])[2]/following::span[4]"));
    public static final Target BPerBodega = Target.the("Buscar Persona Bodega").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Asociar persona'])[1]/following::input[1]"));
    public static final Target SPerBodega = Target.the("Seleccionar Persona Bodega").located(By.xpath("//li[normalize-space()='"+Variables.NombPersonaB()+"']"));
    public static final Target GuardarPrBodega = Target.the("Guardar Pesona Bodega").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Asociar persona'])[1]/following::button[3]"));
    public static final Target ConPrBodega = Target.the("Continuar Persona Bodega").located(By.xpath("//span[contains(text(),'Continuar')]"));
    public static final Target ConfigDocBodega = Target.the("Configurar Documentos Bodega").located(By.xpath("//span[contains(text(),'Configuración documentos división')]"));
    public static final Target AgrDocBodega = Target.the("Agregar Documento Bodega").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Refrescar'])[3]/following::span[4]"));
    public static final Target TipDocBodega = Target.the("Tipo Documento Bodega").located(By.xpath("//div[@id='mui-component-select-TipoDocumentoId']"));
    public static final Target SelTipDocBod = Target.the("Seleccionar Tipo Documento Bodega").located(By.xpath("//li[normalize-space()='"+Variables.DescTipDocB()+"']"));
    public static final Target DivDocBodega = Target.the("Division Documento Bodega").located(By.xpath("//div[@id='mui-component-select-DivisionId']"));
    public static final Target SelDivDocBodega = Target.the("Seleccionar Division Documento Bodega").located(By.xpath("//li[normalize-space()='"+Variables.NomDivision()+"']"));
    public static final Target GuardarDocBodega = Target.the("Guardar Documento Bodega").located(By.xpath("//span[contains(text(),'Guardar')]"));
    public static final Target ConDocBodega = Target.the("Continuar Documento Bodega").located(By.xpath("//span[contains(text(),'Continuar')]"));

}
