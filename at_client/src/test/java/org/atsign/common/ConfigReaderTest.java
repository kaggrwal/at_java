package org.atsign.common;

import static org.junit.Assert.assertEquals;

import org.atsign.config.ConfigReader;
import org.junit.Test;

public class ConfigReaderTest {
    
    @Test
    public void getRegistrarUrl(){

        assertEquals("https://my.atsign.com/api/app/v2", ConfigReader.getProperty("REGISTRAR_URL"));
        assertEquals("https://my.atsign.com/api/app/v2", ConfigReader.getProperty("registrar", "url"));
        //test regsitrar_v3 url
        assertEquals("https://my.atsign.wtf/api/app/v3", ConfigReader.getProperty("registrarV3", "url"));
    }

    @Test
    public void getRootDomain(){
        assertEquals("root.atsign.org", ConfigReader.getProperty("ROOT_DOMAIN"));
        assertEquals("root.atsign.org", ConfigReader.getProperty("rootServer", "domain"));
    }

    @Test
    public void getRootPort(){
        assertEquals("64", ConfigReader.getProperty("ROOT_PORT"));
        assertEquals("64", ConfigReader.getProperty("rootServer", "port"));
    }

    @Test
    public void getApiKey(){
        assertEquals("477b-876u-bcez-c42z-6a3d", ConfigReader.getProperty("API_KEY"));
        assertEquals("477b-876u-bcez-c42z-6a3d", ConfigReader.getProperty("registrar", "apiKey"));
    }
}
