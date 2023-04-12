package co.com.smartstock.test.userinterfaces;

import co.com.smartstock.test.models.Variables;
import javafx.application.Application;
import net.serenitybdd.screenplay.actions.MoveMouseToTarget;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public abstract class ObjectAdministracion extends Application {

    public static final Target Alerta = Target.the("Alerta ").located(By.xpath("//div[contains(text(),'Cambios almacenados correctamente.')]"));
    public static final Target Admin = Target.the("Menu Administración").located(By.xpath("//span[contains(text(),'Administración')]"));

    // Agregar Perfil
    public static final Target Perfil = Target.the("Opción Perfil").located(By.xpath("//h6[contains(text(),'Perfil')]"));
    public static final Target AgrPerfil = Target.the("Agregar Perfil").located(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/span[1]/button[1]/span[1]/*[1]"));

    public static final Target NomPerfil = Target.the("Nombre Perfil").located(By.name("NombrePerfil"));
    public static final Target DesPerfil = Target.the("Descripcion").located(By.name("Descripcion"));
    public static final Target GuardarPerfil = Target.the("Guardar Perfil").located(By.xpath("//span[contains(text(),'Guardar')]"));
    public static final Target ConPerfil = Target.the("Continuar Perfil").located(By.xpath("//span[contains(text(),'Continuar')]"));

    // Agregar Permisos
    public static final Target Permisos = Target.the("Opción Permisos").located(By.xpath("//h6[contains(text(),'Permisos')]"));
    public static final Target BuscarPermisos = Target.the("Buscar Permisos").located(By.cssSelector("input[placeholder='Buscar']"));
    public static final Target AsignarPermisos = Target.the("Asignar Permisos").located(By.xpath("//tbody[1]/tr[1]/td[1]/div[1]/button[1]"));
    public static final Target PermisosBodegas = Target.the("Asignar Permisos Bodegas").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Modificar permisos'])[1]/following::input[1]"));
    public static final Target PermisosOrden = Target.the("Permisos Ordenes").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Modificar permisos'])[1]/following::div[18]"));
    public static final Target PermisosOE = Target.the("Permisos Orden Entrada").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Modificar permisos'])[1]/following::input[6]"));
    public static final Target PermisosCerrarOrden = Target.the("Permisos Ordenes").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Modificar permisos'])[1]/following::div[18]"));
    public static final Target PermisosProces = Target.the("Permisos Procesos").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Modificar permisos'])[1]/following::div[22]"));
    public static final Target PermisosEI = Target.the("Permisos Entrada Inventario").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Modificar permisos'])[1]/following::input[8]"));
    public static final Target PermisosCerrarProces = Target.the("Permisos Procesos").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Modificar permisos'])[1]/following::div[22]"));
    public static final Target EditarPermisos = Target.the("Editar Permisos").located(By.xpath("//span[contains(text(),'Editar')]"));

    // Agregar Agencia
    public static final Target Agencia = Target.the("Opción Agencia").located(By.xpath("//h6[contains(text(),'Agencia')]"));
    public static final Target AgrAgencia = Target.the("Agregar Agencia").located(By.xpath("//button[@title='Agregar']"));
    public static final Target CodAgencia = Target.the("Codigo Agencia").located(By.xpath("//input[@name='CodigoAgencia']"));
    public static final Target NomAgencia = Target.the("Nombre Agencia").located(By.xpath("//input[@name='NombreAgencia']"));
    public static final Target DirAgencia = Target.the("Direccion Agencia").located(By.xpath("//input[@name='Direccion']"));
    public static final Target TelAgencia = Target.the("Telefono Agencia").located(By.xpath("//input[@name='Telefonos']"));
    public static final Target CelAgencia = Target.the("Celular Agencia").located(By.xpath("//input[@name='Celular']"));
    public static final Target LongitudAg = Target.the("Longitud Agencia").located(By.xpath("//input[@name='Longitud']"));
    public static final Target LatitudAg = Target.the("Latitud Agencia").located(By.xpath("//input[@name='Latitud']"));
    public static final Target GuardarAg = Target.the("Guardar Agencia").located(By.xpath("//span[contains(text(),'Guardar')]"));
    public static final Target ConfirmarAg = Target.the("Confirmar Agencia").located(By.xpath("//span[contains(text(),'Continuar')]"));

    // Agregar Persona

    public static final Target Usuario = Target.the("Opción Usuario").located(By.xpath("//h6[contains(text(),'Usuario')]"));
    public static final Target AgrUsuario = Target.the("Agregar Usuario").located(By.xpath("//span[contains(text(),'add')]"));
    public static final Target TipoIDUsuario = Target.the("Tipo ID Usuario").located(By.xpath("//div[@id='mui-component-select-IdTipoIdentificacion']"));
    public static final Target SelTipoIDUsr = Target.the("Seleccionar Tipo ID Usuario").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear usuario'])[1]/following::li[2]"));
    public static final Target NumIDUsr = Target.the("Numero identificacion").located(By.xpath("//input[@name='NumeroIdentificacion']"));
    public static final Target Nombre1Usr = Target.the("Primer Nombre").located(By.xpath("//input[@name='PrimerNombre']"));
    public static final Target Apellido1Usr = Target.the("Primer Apellido").located(By.xpath("//input[@name='PrimerApellido']"));
    public static final Target DireccionUsr = Target.the("Direccion Usuario").located(By.xpath("//input[@name='Direccion']"));
    public static final Target TelefonoUsr = Target.the("Telefono Usuario").located(By.xpath("//input[@name='Telefonos']"));
    public static final Target EmailUsr = Target.the("Email Usuario").located(By.xpath("//input[@name='EmailPrincipal']"));
    public static final Target Guardarper = Target.the("Guardar Persona").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crear usuario'])[1]/following::div[46]"));
    public static final Target Confirmarper = Target.the("Confirmar Persona").located(By.xpath("//span[contains(text(),'Continuar')]"));


    // Agregar Usuario

    public static final Target TipoUsr = Target.the("Seleccionar Tipo Usuario").located(By.cssSelector("#mui-component-select-IdTipoUsuario"));
    public static final Target SelTipoUsr = Target.the("Seleccionar Tipo Usuario").located(By.xpath("//li[normalize-space()='Mixto']"));
    public static final Target LoginUsr = Target.the("Login Usuario").located(By.xpath("//input[@name='Login']"));
    public static final Target ClaveUsr = Target.the("Clave Usuario").located(By.xpath("//input[@name='Clave']"));
    public static final Target ConfClaveUsr = Target.the("Confirmar Clave Usuario").located(By.xpath("//input[@name='ConfirmacionClave']"));
    public static final Target GuardarUsr = Target.the("Guardar Usuario").located(By.xpath("//span[contains(text(),'Guardar')]"));
    public static final Target ConfirmarUsr = Target.the("Confirmar Usuario").located(By.xpath("//span[contains(text(),'Continuar')]"));

    // Agregar Perfil Agencia Usuario

    public static final Target SelgenciaUsr = Target.the("Agencia Usuario").located(By.xpath("//li[normalize-space()='"+Variables.NombAgencia()+"']"));
    public static final Target SelPerfilUsr = Target.the("Seleccionar Perfil Usuario").located(By.xpath("//li[normalize-space()='"+ Variables.NomPerfil()+"']"));
    public static final Target AgenciaUsr = Target.the("Agencia Usuario").located(By.xpath("//div[@id='mui-component-select-idAgencia']"));
    public static final Target PerfilUsr = Target.the("Perfil Usuario").located(By.xpath("//div[@id='mui-component-select-idPerfil']"));
    public static final Target AgrPerfilAge = Target.the("Agregar Perfil Agencia Usuario").located(By.xpath("//span[contains(text(),'Agregar')]"));
    public static final Target CerrarUsr = Target.the("Cerrar Pantalla Usuario").located(By.xpath("//span[contains(text(),'Ok')]"));

    }
