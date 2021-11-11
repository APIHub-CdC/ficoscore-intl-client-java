# ficoscore-intl-client-java

Modelo estadístico basado en variables contenidas en el historial crediticio del Cliente, calcula un puntaje matemático que mide el riesgo del Cliente de fallar en sus pagos en un lapso de 12 meses a partir del otorgamiento de un crédito.

## Requisitos

1. Java >= 1.7
2. Maven >= 3.3

## Instalación

Para la instalación de las dependencias se deberá ejecutar el siguiente comando:

```shell
mvn install -Dmaven.test.skip=true
```

> **NOTA:** Este fragmento del comando *-Dmaven.test.skip=true* evitará que se lance la prueba unitaria.


## Guía de inicio

### Paso 1. Agregar el producto a la aplicación

Al iniciar sesión seguir los siguientes pasos:

 1. Dar clic en la sección "**Mis aplicaciones**".
 2. Seleccionar la aplicación.
 3. Ir a la pestaña de "**Editar '@tuApp**' ".
    <p align="center">
      <img src="https://github.com/APIHub-CdC/imagenes-cdc/blob/master/edit_applications.jpg" width="900">
    </p>
 4. Al abrirse la ventana emergente, seleccionar el producto.
 5. Dar clic en el botón "**Guardar App**":
    <p align="center">
      <img src="https://github.com/APIHub-CdC/imagenes-cdc/blob/master/selected_product.jpg" width="400">
    </p>

### Paso 2. Capturar los datos de la petición

Los siguientes datos a modificar se encuentran en ***src/test/java/com/cdc/apihub/FicoScore/INTL/api/FicoScoreApiTest.java***

Es importante contar con el setUp() que se encargará de inicializar la url. Modificar la URL ***('the_url')*** de la petición del objeto ***$config***, como se muestra en el siguiente fragmento de código:

```java
 private final FicoScoreApi api = new FicoScoreApi();
    
    private Logger logger = LoggerFactory.getLogger(FicoScoreApiTest.class.getName());
    private String keystoreFile = "/your_path/keystore.jks";
  private String cdcCertFile = "/your_path/cdc_cert.pem";
  private String keystorePassword = "your_password";
  private String keyAlias = "your_alias";
  private String keyPassword = "your_key_password";
    
  
  @Before()
    public void setUp() {
      
      ApiClient apiClient = api.getApiClient();
    apiClient.setBasePath("the_url");
    OkHttpClient okHttpClient = new OkHttpClient().newBuilder().readTimeout(30, TimeUnit.SECONDS)
        .addInterceptor(new SignerInterceptor(keystoreFile, cdcCertFile, keystorePassword, keyAlias, keyPassword)).build();
    apiClient.setHttpClient(okHttpClient);
    }

```

En el archivo **FicoScoreApiTest**, que se encuentra en ***src/test/java/com/cdc/apihub/FicoScore/INTL/api/*** se deberá modificar el siguiente fragmento de código con los datos correspondientes:

```java
@Test
    public void getReporteTest() throws ApiException {
       
        String xApiKey = "your_api_key";
        String username = "username";
        String password = "password";
        
        Peticion request = new Peticion();
        Persona persona = new Persona();
        Domicilio domicilio = new Domicilio();
        
        request.setFolio("XXX");
        persona.setNombres("XXX");
        persona.setApellidoPaterno("XXX");
        persona.setApellidoMaterno("XXX");
        persona.setFechaNacimiento("XXX");
        persona.setRFC("XXX");
        
        domicilio.setDireccion("XXX");
        domicilio.setColoniaPoblacion("XXX");
        domicilio.setCiudad("XXX");
        domicilio.setCP("XXX");
        domicilio.setDelegacionMunicipio("XXX");
        domicilio.setEstado(CatalogoEstados.DF);
        
        
        persona.setDomicilio(domicilio);
        request.setPersona(persona);
        
        
        Respuesta response = api.getReporte(xApiKey, username, password, request);
        logger.debug(response.toString());
        Assert.assertTrue(response.getFolioConsulta() != null);
        
    }
```

### Paso 3. Ejecutar la prueba unitaria

Teniendo los pasos anteriores ya solo falta ejecutar la prueba unitaria, con el siguiente comando:

```shell
mvn test -Dmaven.install.skip=true
```

---
[TERMINOS Y CONDICIONES](https://github.com/APIHub-CdC/licencias-cdc)