package co.com.smartstock.test.userinterfaces;

import co.com.smartstock.test.models.Variables;
import javafx.application.Application;
import net.serenitybdd.screenplay.actions.MoveMouseToTarget;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public abstract class ObjectProductos extends Application {
    public static final Target AlertaProd = Target.the("Alerta Productos").located(By.xpath("//div[contains(text(),'Cambios almacenados correctamente.')]"));
    public static final Target MProductos = Target.the("Menu Productos").located(By.xpath("//span[contains(text(),'Productos')]"));

    // Agregar Tipos Unidades
    public static final Target TiposUnidades = Target.the("Opción Tipos Unidades").located(By.xpath("//h6[contains(text(),'Tipos Unidades')]"));
    public static final Target AgrTiposUnd = Target.the("Agregar Tipo Unidades").located(By.xpath("//span[contains(text(),'Agregar')]"));
    public static final Target DesTipoUnd = Target.the("Descripcion Tipo Unidad").located(By.xpath("//input[@name='DescripcionTipoUnidad']"));
    public static final Target GuardarTUnidad = Target.the("Guardar Tipo Unidad").located(By.xpath("//span[contains(text(),'Guardar')]"));
    public static final Target ConTUnidad = Target.the("Continuar Tipo Unidad").located(By.xpath("//span[contains(text(),'Continuar')]"));

    // Agregar Unidades
    public static final Target Unidades = Target.the("Opción Unidades").located(By.xpath("//h6[contains(text(),'Unidades')]"));
    public static final Target AgrUnidades = Target.the("Agregar Unidades").located(By.xpath("//button[@title='Agregar']"));
    public static final Target TipoUnidades = Target.the("Tipo Unidades").located(By.xpath("//button[@title='Open']"));
    public static final Target SelTipoUnd = Target.the("Seleccionar tipo unidad").located(By.xpath("//li[normalize-space()='"+Variables.TipoUnd()+"']"));
    public static final Target DesUnidades = Target.the("Descripcion Unidad").located(By.xpath("//input[@name='DescripcionUnidad']"));
    public static final Target AbrUnidad = Target.the("Abreviatura Unidad").located(By.xpath("//input[@name='Abreviatura']"));
    public static final Target GuardarUnd = Target.the("Guardar Unidad").located(By.xpath("//span[contains(text(),'Guardar')]"));
    public static final Target ConUnidad = Target.the("Continuar Unidad").located(By.xpath("//span[contains(text(),'Continuar')]"));

    // Agregar Clases Tecnicas
    public static final Target ClasesTecnicas = Target.the("Opción clases tecnicas").located(By.xpath("//h6[contains(text(),'Clases Técnicas')]"));
    public static final Target AgrClTecnicas = Target.the("Agregar clase tecnica").located(By.xpath("//span[contains(text(),'add')]"));
    public static final Target DesClTecnicas = Target.the("Descripcion clase tecnica").located(By.xpath("//input[@name='ClaseTecnicaDescripcion']"));
    public static final Target GuardarClTecnicas = Target.the("Guardar clase tecnica").located(By.xpath("//span[contains(text(),'Guardar')]"));
    public static final Target ConClTecnicas = Target.the("Continuar clase tecnica").located(By.xpath("//span[contains(text(),'Continuar')]"));

    // Agregar Familias
    public static final Target Familias = Target.the("Opción Familias").located(By.xpath("//h6[contains(text(),'Familias')]"));
    public static final Target AgrFamilias = Target.the("Agregar Familia").located(By.xpath("//span[contains(text(),'add')]"));
    public static final Target DesFamilia = Target.the("Descripcion Familia").located(By.xpath("//input[@name='FamiliaDescripcion']"));
    public static final Target GuardarFamilia = Target.the("Guardar Familia").located(By.xpath("//span[contains(text(),'Guardar')]"));
    public static final Target ConFamilia = Target.the("Continuar Familia").located(By.xpath("//span[contains(text(),'Continuar')]"));

    // Agregar Fabricantes
    public static final Target Fabricantes = Target.the("Opción Fabricantes").located(By.xpath("//h6[contains(text(),'Fabricantes')]"));
    public static final Target AgrFabricantes = Target.the("Agregar Fabricantes").located(By.xpath("//span[contains(text(),'add')]"));
    public static final Target DesFabricantes = Target.the("Descripcion Fabricante").located(By.xpath("//input[@name='FabricanteDescripcion']"));
    public static final Target GuardarFabricantes = Target.the("Guardar Fabricante").located(By.xpath("//span[contains(text(),'Guardar')]"));
    public static final Target ConFabricantes = Target.the("Continuar Fabricante").located(By.xpath("//span[contains(text(),'Continuar')]"));

    // Agregar Referencias
    public static final Target Referencias = Target.the("Opción Referencias").located(By.xpath("//h6[contains(text(),'Referencias')]"));
    public static final Target AgrReferencias = Target.the("Agregar Referencias").located(By.xpath("//span[contains(text(),'add')]"));
    public static final Target DesReferencias = Target.the("Descripcion Referencia").located(By.xpath("//input[@name='ReferenciaDescripcion']"));
    public static final Target GuardarRef = Target.the("Guardar Referencia").located(By.xpath("//span[contains(text(),'Guardar')]"));
    public static final Target ConReferencias = Target.the("Continuar Referencia").located(By.xpath("//span[contains(text(),'Continuar')]"));

    // Agregar Clasificaciones
    public static final Target Clasificaciones = Target.the("Opción Clasificaciones").located(By.xpath("//h6[contains(text(),'Clasificaciones')]"));
    public static final Target AgrClasificaciones = Target.the("Agregar Clasificaciones").located(By.xpath("//span[contains(text(),'add')]"));
    public static final Target DesClasificaciones = Target.the("Descripcion Clasificacion").located(By.xpath("//input[@name='ClasificacionDescripcion']"));
    public static final Target GuardarClasif = Target.the("Guardar Clasificacion").located(By.xpath("//span[contains(text(),'Guardar')]"));
    public static final Target ConClasif = Target.the("Continuar Clasificacion").located(By.xpath("//span[contains(text(),'Continuar')]"));

    // Agregar Marcas
    public static final Target Marcas = Target.the("Opción Marcas").located(By.xpath("//h6[contains(text(),'Marcas')]"));
    public static final Target AgrMarcas = Target.the("Agregar Marcas").located(By.xpath("//span[contains(text(),'add')]"));
    public static final Target DesMarcas = Target.the("Descripcion Marca").located(By.xpath("//input[@name='MarcaDescripcion']"));
    public static final Target GuardarMarcas = Target.the("Guardar Marca").located(By.xpath("//span[contains(text(),'Guardar')]"));
    public static final Target ConMarcas = Target.the("Continuar Marca").located(By.xpath("//span[contains(text(),'Continuar')]"));

    // Gestion Productos
    public static final Target Productos = Target.the("Gestion Productos").located(By.xpath("//h6[contains(text(),'Gestión producto')]"));
    public static final Target AgrProductos = Target.the("Agregar Productos").located(By.xpath("//span[contains(text(),'add')]"));
    public static final Target DesProducto = Target.the("Descripcion Producto").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear producto'])[1]/following::input[1]"));
    public static final Target NombreCorto = Target.the("Nombre Corto Producto").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear producto'])[1]/following::input[2]"));
    public static final Target CodigoProd = Target.the("Codigo Producto").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear producto'])[1]/following::input[3]"));
    public static final Target FamiliaProd = Target.the("Familia Producto").located(By.xpath("//div[@id='mui-component-select-FamiliaId']"));
    public static final Target SelFamProd = Target.the("Seleccionar Familia Producto").located(By.xpath("//li[normalize-space()='"+Variables.Familia()+"']"));
    public static final Target ClasifProd = Target.the("Clasificacion Producto").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear producto'])[1]/following::input[7]"));
    public static final Target SelClasifProd = Target.the("Seleccionar Clasificacion Producto").located(By.xpath("//li[normalize-space()='"+Variables.Clasificacion()+"']"));
    public static final Target ClasTecProd = Target.the("Clase Tecnica Producto").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear producto'])[1]/following::input[8]"));
    public static final Target SelClasTecProd = Target.the("Seleccionar Clase Tecnica Producto").located(By.xpath("//li[normalize-space()='"+Variables.ClaseTec()+"']"));
    public static final Target RefProd = Target.the("Referencia Producto").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear producto'])[1]/following::input[9]"));
    public static final Target SelRefProd = Target.the("Seleccionar Referencia Producto").located(By.xpath("//li[normalize-space()='"+Variables.Referencia()+"']"));
    public static final Target MarcaProd = Target.the("Marca Producto").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear producto'])[1]/following::input[10]"));
    public static final Target SelMarcaProd = Target.the("Seleccionar Marca Producto").located(By.xpath("//li[normalize-space()='"+Variables.Marca()+"']"));
    public static final Target FabricProd = Target.the("Fabricante Producto").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear producto'])[1]/following::input[11]"));
    public static final Target SelFabricProd = Target.the("Seleccionar Fabricante Producto").located(By.xpath("//li[normalize-space()='"+Variables.Fabricante()+"']"));
    public static final Target ValorProd = Target.the("Valor Producto").located(By.xpath("//input[@name='Valor']"));
    public static final Target AnchoProd = Target.the("Ancho Producto").located(By.xpath("//input[@name='Ancho']"));
    public static final Target AltoProd = Target.the("Alto Producto").located(By.xpath("//input[@name='Alto']"));
    public static final Target LargoProd = Target.the("Largo Producto").located(By.xpath("//input[@name='Largo']"));
    public static final Target PesoProd = Target.the("Peso Producto").located(By.xpath("//input[@name='Peso']"));
    public static final Target UnidadProd = Target.the("Unidad Producto").located(By.xpath("//div[@id='mui-component-select-UnidadId']"));
    public static final Target SelUnidadProd = Target.the("Seleccionar Unidad Producto").located(By.xpath("//li[normalize-space()='"+Variables.Unidad()+"']"));
    public static final Target FifoProd = Target.the("Marcar Fifo Producto").located(By.xpath("//input[@name='FIFO']"));
    public static final Target FefoProd = Target.the("Marcar Fefo Producto").located(By.xpath("//input[@name='FEFO']"));
    public static final Target GuardarProd = Target.the("Guardar Producto").located(By.xpath("//span[contains(text(),'Guardar')]"));
    public static final Target ConProducto = Target.the("Continuar Producto").located(By.xpath("//span[contains(text(),'Continuar')]"));

}
