package com.appium.curso.page;

import com.appium.curso.core.BasePage;
import static com.appium.curso.core.DriverFactory.getDriver;

import java.util.Set;

import org.openqa.selenium.By;

public class WebViewPage extends BasePage {

	public void entrarContextoWeb() {
		Set<String> contextHandles = getDriver().getContextHandles();
		for(String valor: contextHandles) {
			System.out.println(valor);
		}
		getDriver().context((String) contextHandles.toArray()[1]);
	}
	public void setEmail(String valor) {
		getDriver().findElement(By.id("email")).sendKeys(valor);;
	}
	
	
}
