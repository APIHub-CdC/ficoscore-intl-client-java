package com.cdc.apihub.FicoScore.INTL.api;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cdc.apihub.FicoScore.INTL.client.ApiClient;
import com.cdc.apihub.FicoScore.INTL.client.ApiException;
import com.cdc.apihub.FicoScore.INTL.model.CatalogoEstados;
import com.cdc.apihub.FicoScore.INTL.model.Domicilio;
import com.cdc.apihub.FicoScore.INTL.model.Persona;
import com.cdc.apihub.FicoScore.INTL.model.Peticion;
import com.cdc.apihub.FicoScore.INTL.model.Respuesta;
import com.cdc.apihub.signer.manager.interceptor.SignerInterceptor;

import okhttp3.OkHttpClient;

public class FicoScoreApiTest {
	
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
    
}
