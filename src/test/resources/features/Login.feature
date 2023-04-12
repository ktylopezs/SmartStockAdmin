#Autor: Katiuska Lopez S
#language: es

@AbrirAplicacion
Característica: Abrir SmartStock e ingresar a administracion parametros bodegas y productos

  @Login
  Escenario: Abrir SmartStock e ingresar a administracion parametros bodegas y productos
    Dado que el usuario ingresa a la pagina SmartStock
    Cuando ingrese a todas las opciones
    Entonces se crea usuario documento bodega y producto
    Y se cierra la pagina de SmartStock
