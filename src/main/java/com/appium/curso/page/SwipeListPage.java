package com.appium.curso.page;

import static com.appium.curso.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import com.appium.curso.core.BasePage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption; 

public class SwipeListPage extends BasePage {

	public void swipeElementLeft(String opcao) {
		swipeElemento(getDriver().findElement(By.xpath("//*[@text= '"+opcao+"']/..")), 0.1, 0.9);
	}
	
	public void swipeElementRight(String opcao) {
		swipeElemento(getDriver().findElement(By.xpath("//*[@text= '"+opcao+"']/..")), 0.9, 0.1);
	}
	
	public void clicarBotaoMais() {
		MobileElement botao = getDriver().findElement(By.xpath("//*[@text= '(+)']/.."));
		new AndroidTouchAction(getDriver()).tap(TapOptions.tapOptions()
				.withElement(ElementOption.element(botao, 50, 0))).release().perform(); 
	}
}
