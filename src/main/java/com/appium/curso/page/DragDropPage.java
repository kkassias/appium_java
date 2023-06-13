package com.appium.curso.page;

import static com.appium.curso.core.DriverFactory.getDriver;

import java.util.List;

import org.openqa.selenium.By;

import com.appium.curso.core.BasePage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.ElementOption;

public class DragDropPage extends BasePage {

	public void arrastar(String origem, String destino) {
		MobileElement inicio = getDriver().findElement(By.xpath("//*[@text= '"+origem+"']"));
		MobileElement fim = getDriver().findElement(By.xpath("//*[@text= '"+destino+"']"));
		
		new AndroidTouchAction(getDriver()).longPress(ElementOption.element(inicio))
			.moveTo(ElementOption.element(fim)).release().perform();
	}
	
	public String[] obterLista() {
		List<MobileElement> elements = getDriver().findElements(By.className("android.widget.TextView"));
		String[] retorno = new String[elements.size()];
		for(int i = 0; i < elements.size(); i++) {
			retorno[i] = elements.get(i).getText();
			//System.out.print("\"" + retorno[i] + "\", ");
		}
		return retorno;
	}
}
