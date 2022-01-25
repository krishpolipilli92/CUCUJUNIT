package Hooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.utilities.ReadConfig;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {
	private DriverFactory drfac;
	private WebDriver dr;
	private ReadConfig rdconf;
	Properties prop;
	
	@Before(order=0)
	public void getproperty() {
		rdconf=new ReadConfig();
		prop= rdconf.initializeprop();
	}
	@Before(order=1)
	public void launchbrowser() {
		String browsername=prop.getProperty("browser");
		String url= prop.getProperty("url");
		drfac=new DriverFactory();
		dr=drfac.init_driver(browsername);
		dr.get(url);
	}
    @After(order=0)
	public void quitbrowser() {
		dr.quit();
	}
    @After(order=1)
    public void teardown(Scenario sc) {
    	if(sc.isFailed()) {
    		// takescreenshot code need to implement here
    	}
    }
}
