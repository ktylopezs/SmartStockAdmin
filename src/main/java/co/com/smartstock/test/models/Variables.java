package co.com.smartstock.test.models;

import co.com.smartstock.test.utils.CargarArchivos;

import java.io.IOException;

public class Variables {
    private static String CodigoRamdonD;
    public static String getCodigoRamdonD() {return CodigoRamdonD;}
    public static void setCodigoRamdonD(String codigoRamdonD) {CodigoRamdonD = codigoRamdonD;}

    //// MENU ADMINISTRACION ////
    private static String Nomperfil;
    public static String getNomperfil() {return Nomperfil;}
    public static void setNomperfil(String nomperfil) {Nomperfil =nomperfil;}
    private static String NombAgencia;
    public static String getNombAgencia() {return NombAgencia;}
    public static void setNombAgencia(String nombAgencia) {NombAgencia = nombAgencia;}
    private static String NombPersona;
    public static String getNombPersona() {return NombPersona;}
    public static void setNombPersona(String nombPersona) {NombPersona = nombPersona;}
    private static String LoginUsr;
    public static String getLoginUsr() {return LoginUsr;}
    public static void setLoginUsr(String loginUsr) {LoginUsr = loginUsr;}

    //// MENU PARAMETROS ////
    private static String NombTipoCte;
    public static String getNombTipoCte() {return NombTipoCte;}
    public static void setNombTipoCte(String nombTipoCte) {NombTipoCte = nombTipoCte;}
    private static String NombEtapa;
    public static String getNombEtapa() {return NombEtapa;}
    public static void setNombEtapa(String nombEtapa) {NombEtapa = nombEtapa;}
    private static String NombProveedor;
    public static String getNombProveedor() {return NombProveedor;}
    public static void setNombProveedor(String nombProveedor) {NombProveedor = nombProveedor;}
    private static String DesFlEtapa;
    public static String getDesFlEtapa() {return DesFlEtapa;}
    public static void setDesFlEtapa(String desFlEtapa) {DesFlEtapa = desFlEtapa;}
    private static String TipoProceso;
    public static String getTipoProceso() {return TipoProceso;}
    public static void setTipoProceso(String tipoProceso) {TipoProceso = tipoProceso;}
    private static String DescTipoDoc;
    public static String getDescTipoDoc() {return DescTipoDoc;}
    public static void setDescTipoDoc(String descTipoDoc) {DescTipoDoc = descTipoDoc;}

    //// MENU BODEGAS ////
    private static String NombTipoBod;
    public static String getNombTipoBod() {return NombTipoBod;}
    public static void setNombTipoBod(String nombTipoBod) {NombTipoBod = nombTipoBod;}
    private static String NombFila;
    public static String getNombFila() {return NombFila;}
    public static void setNombFila(String nombFila) {NombFila = nombFila;}
    private static String NombTipDiv;
    public static String getNombTipDiv() {return NombTipDiv;}
    public static void setNombTipDiv(String nombTipDiv) {NombTipDiv = nombTipDiv;}
    private static String NombPisos;
    public static String getNombPisos() {return NombPisos;}
    public static void setNombPisos(String nombPisos) {NombPisos = nombPisos;}
    private static String NombColumna;
    public static String getNombColumna() {return NombColumna;}
    public static void setNombColumna(String nombColumna) {NombColumna = nombColumna;}
    private static String NomBodega;
    public static String getNomBodega() {return NomBodega;}
    public static void setNomBodega(String nomBodega) {NomBodega = nomBodega;}
    private static String NomDivision;
    public static String getNomDivision() {return NomDivision;}
    public static void setNomDivision(String nomDivision) {NomDivision = nomDivision;}
    private static String NombPersonaB;
    public static String getNombPersonaB() {return NombPersonaB;}
    public static void setNombPersonaB(String nombPersonaB) {NombPersonaB = nombPersonaB;}
    private static String DescTipoDocB;
    public static String getDescTipoDocB() {return DescTipoDocB;}
    public static void setDescTipoDocB(String descTipoDocB) {DescTipoDocB = descTipoDocB;}

    //// MENU PRODUCTOS ////
    private static String TipoUnd;
    public static String getTipoUnd() {return TipoUnd;}
    public static void setTipoUnd(String tipoUnd) {TipoUnd = tipoUnd;}
    private static String Unidad;
    public static String getUnidad() {return Unidad;}
    public static void setUnidad(String unidad) {Unidad = unidad;}
    private static String ClaseTec;
    public static String getClaseTec() {return ClaseTec;}
    public static void setClaseTec(String claseTec) {ClaseTec = claseTec;}
    private static String Familia;
    public static String getFamilia() {return Familia;}
    public static void setFamilia(String familia) {Familia = familia;}
    private static String Fabricante;
    public static String getFabricante() {return Fabricante;}
    public static void setFabricante(String fabricante) {Fabricante = fabricante;}
    private static String Referencia;
    public static String getReferencia() {return Referencia;}
    public static void setReferencia(String referencia) {Referencia = referencia;}
    private static String Clasificacion;
    public static String getClasificacion() {return Clasificacion;}
    public static void setClasificacion(String clasificacion) {Clasificacion = clasificacion;}
    private static String Marca;
    public static String getMarca() {return Marca;}
    public static void setMarca(String marca) {Marca = marca;}
    private static String DesProd;
    public static String getDesProd() {return DesProd;}
    public static void setDesProd(String desProd) {DesProd = desProd;}

    //// NUEVOS REGISTROS ////
    private static String NvaPersona;
    public static String getNvaPersona() {return NvaPersona;}
    public static void setNvaPersona(String nvaNombPersona) {NvaPersona = nvaNombPersona;}
    private static String NvoTipDoc;
    public static String getNvoTipDoc() {return NvoTipDoc;}
    public static void setNvoTipDoc(String nvaDescTipDoc) {NvoTipDoc = nvaDescTipDoc;}
    private static String NvaBodega;
    public static String getNvaBodega() {return NvaBodega;}
    public static void setNvaBodega(String nvaBodega) {NvaBodega = nvaBodega;}
    private static String NvoProducto;
    public static String getNvoProducto() {return NvoProducto;}
    public static void setNvoProducto(String nvoProducto) {NvoProducto = nvoProducto;}
//
//    public static String TraerArchivos(){
//        try {
//            CargarArchivos.Bodegas();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        return null;
//    }

    // Crear un codigo aleatorio para las diferentes opciones
    static String CodigoRamdon = NumRamdon.numaleatorio();

    public static String CodigoRamdonD() {
        setCodigoRamdonD(CodigoRamdon);
        System.out.println("El codigo ramdon es : " + getCodigoRamdonD());
        return getCodigoRamdonD();
    }

    //// MENU ADMINISTRACION ////
    public static String NomPerfil() {
        setNomperfil(CargarArchivos.properties.getProperty("NomPerfil") + ' ' + CodigoRamdon);
        System.out.println("El nuevo perfil1 es : " + getNomperfil());
        return getNomperfil();
    }
    public static String NombAgencia() {
        setNombAgencia(CargarArchivos.properties.getProperty("NombreAg") + ' ' + CodigoRamdon);
        System.out.println("La nueva agencia es : " + getNombAgencia());
        return getNombAgencia();
    }
    public static String NombPersona() {
        setNombPersona(CargarArchivos.properties.getProperty("NomUsr") + ' ' + CodigoRamdon);
        System.out.println("La nueva persona es : " + getNombPersona());
        return getNombPersona();
    }
    public static String LoginUsr() {
        setLoginUsr(CargarArchivos.properties.getProperty("NomUsr") + '.' + CodigoRamdon);
        System.out.println("El nuevo Login es : " + getLoginUsr());
        return getLoginUsr();
    }

    //// MENU PARAMETROS ////

    public static String NombTipoCte() {
        setNombTipoCte(CargarArchivos.properties.getProperty("DesCliente") + ' ' + CodigoRamdon);
        System.out.println("El nuevo tipo Cliente es : " + getNombTipoCte());
        return getNombTipoCte();
    }
    public static String NombEtapa() {
        setNombEtapa(CargarArchivos.properties.getProperty("DesEtapa") + ' ' + CodigoRamdon);
        System.out.println("La nueva etapa es : " + getNombEtapa());
        return getNombEtapa();
    }
    public static String NombProveedor() {
        setNombProveedor(CargarArchivos.properties.getProperty("DesProveedor") + ' ' + CodigoRamdon);
        System.out.println("El nuevo proveedor es : " + getNombProveedor());
        return getNombProveedor();
    }
    public static String DesFlEtapa() {
        setDesFlEtapa(CargarArchivos.properties.getProperty("NomFlEtapa") + ' ' + CodigoRamdon);
        System.out.println("El nuevo flujo etapa es : " + getDesFlEtapa());
        return getDesFlEtapa();
    }
    public static String TipoProceso() {
        setTipoProceso(CargarArchivos.properties.getProperty("TipoProc"));
        System.out.println("El nuevo tipo proceso es : " + getTipoProceso());
        return getTipoProceso();
    }
    public static String DescTipDoc() {
        setDescTipoDoc(CargarArchivos.properties.getProperty("NomTipoDoc") + ' ' + CodigoRamdon);
        System.out.println("La descripcion tipo documento es: " + getDescTipoDoc());
        return getDescTipoDoc();
    }

    //// MENU BODEGAS ////

    public static String NombTipoBod() {
        setNombTipoBod(CargarArchivos.properties.getProperty("TipoBod") + ' ' + CodigoRamdon);
        System.out.println("El nuevo tipo bodega es : " + getNombTipoBod());
        return getNombTipoBod();
    }
    public static String NombFila() {
        setNombFila(CargarArchivos.properties.getProperty("DesFila") + ' ' + CodigoRamdon);
        System.out.println("La nueva fila es : " + getNombFila());
        return getNombFila();
    }
    public static String NombTipDiv() {
        setNombTipDiv(CargarArchivos.properties.getProperty("DesTipoDiv") + ' ' + CodigoRamdon);
        System.out.println("El nuevo tipo division es : " + getNombTipDiv());
        return getNombTipDiv();
    }
    public static String NombPisos() {
        setNombPisos(CargarArchivos.properties.getProperty("DesPisos") + ' ' + CodigoRamdon);
        System.out.println("El nuevo piso es : " + getNombPisos());
        return getNombPisos();
    }
    public static String NombColumna() {
        setNombColumna(CargarArchivos.properties.getProperty("DesColumna") + ' ' + CodigoRamdon);
        System.out.println("La nueva columna es : " + getNombColumna());
        return getNombColumna();
    }
    public static String NomBodega() {
        setNomBodega(CargarArchivos.properties.getProperty("DescBodega") + ' ' + CodigoRamdon);
        System.out.println("La nueva bodega es : " + getNomBodega());
        return getNomBodega();
    }
    public static String NomDivision() {
        setNomDivision(CargarArchivos.properties.getProperty("DescDivision") + ' ' + CodigoRamdon);
        System.out.println("La nueva division es : " + getNomDivision());
        return getNomDivision();
    }
    public static String DescTipDocB() {
        setDescTipoDocB(CargarArchivos.properties.getProperty("NomTipoDoc") + ' ' + CodigoRamdon);
        System.out.println("La descripcion tipo documento es: " + getDescTipoDocB());
        return getDescTipoDocB();
    }
    public static String NombPersonaB() {
        setNombPersonaB(CargarArchivos.properties.getProperty("NomUsr") + ' ' + CodigoRamdon + ' ' +
                CargarArchivos.properties.getProperty("ApellidoUsr") + ' ' + CodigoRamdon);
        System.out.println("La nueva persona Bod es : " + getNombPersonaB());
        return getNombPersonaB();
    }

    //// MENU PRODUCTOS ////
    public static String TipoUnd() {
        setTipoUnd(CargarArchivos.properties.getProperty("TipUnd") + ' ' + CodigoRamdon);
        System.out.println("El tipo unidad es: " + getTipoUnd());
        return getTipoUnd();
    }
    public static String Unidad() {
        setUnidad(CargarArchivos.properties.getProperty("Und") + ' ' + CodigoRamdon);
        System.out.println("La unidad es: " + getUnidad());
        return getUnidad();
    }
    public static String ClaseTec() {
        setClaseTec(CargarArchivos.properties.getProperty("ClTec") + ' ' + CodigoRamdon);
        System.out.println("La clase tecnica es: " + getClaseTec());
        return getClaseTec();
    }
    public static String Familia() {
        setFamilia(CargarArchivos.properties.getProperty("Famili") + ' ' + CodigoRamdon);
        System.out.println("La familia es: " + getFamilia());
        return getFamilia();
    }
    public static String Fabricante() {
        setFabricante(CargarArchivos.properties.getProperty("Fabrica") + ' ' + CodigoRamdon);
        System.out.println("El fabricante es: " + getFabricante());
        return getFabricante();
    }
    public static String Referencia() {
        setReferencia(CargarArchivos.properties.getProperty("Referen") + ' ' + CodigoRamdon);
        System.out.println("La referencia es: " + getReferencia());
        return getReferencia();
    }
    public static String Clasificacion() {
        setClasificacion(CargarArchivos.properties.getProperty("Clasifica") + ' ' + CodigoRamdon);
        System.out.println("La clasificacion es: " + getClasificacion());
        return getClasificacion();
    }
    public static String Marca() {
        setMarca(CargarArchivos.properties.getProperty("Marc") + ' ' + CodigoRamdon);
        System.out.println("La marca es: " + getMarca());
        return getMarca();
    }
    public static String DesProd() {
        setDesProd(CargarArchivos.properties.getProperty("DescProd") + ' ' + CodigoRamdon);
        System.out.println("El producto es: " + getDesProd());
        return getDesProd();
    }

    //// NUEVOS REGISTROS ////
    public static String NvaPersona() {
        setNvaPersona(CargarArchivos.properties.getProperty("NomUsr") + ' ' + CodigoRamdon +
                ' ' + CargarArchivos.properties.getProperty("ApellidoUsr") + ' ' + CodigoRamdon);
        System.out.println("La nueva persona es : " + getNvaPersona());
        return getNvaPersona();
    }
    public static String NvoTipDoc() {
        setNvoTipDoc(CargarArchivos.properties.getProperty("NomTipoDoc") + ' ' + CodigoRamdon);
        System.out.println("El nuevo tipo documento es: " + getNvoTipDoc());
        return getNvoTipDoc();
    }
    public static String NvaBodega() {
        setNvaBodega(CargarArchivos.properties.getProperty("DescBodega") + ' ' + CodigoRamdon);
        System.out.println("La nueva bodega es : " + getNvaBodega());
        return getNvaBodega();
    }
    public static String NvoProducto() {
        setNvoProducto(CargarArchivos.properties.getProperty("DescProd") + ' ' + CodigoRamdon);
        System.out.println("El nuevo producto es: " + getNvoProducto());
        return getNvoProducto();
    }

}