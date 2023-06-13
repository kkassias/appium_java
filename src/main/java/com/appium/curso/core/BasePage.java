package com.appium.curso.core;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

import static com.appium.curso.core.DriverFactory.getDriver;

import java.time.Duration;
import java.util.List;

public class BasePage {

	public void escrever(By by, String texto){
        getDriver().findElement(by).sendKeys(texto);
    }
	
	public void escreverNumerico(By by, int numero) {
	    String numeroTexto = Integer.toString(numero);
	    getDriver().findElement(by).sendKeys(numeroTexto);
	}

    public String obterTexto(By by){
        return getDriver().findElement(by).getText();
    }

    public void clicar(By by){
        getDriver().findElement(by).click();
    }

    public void clicarPorTexto(String texto){
        clicar(By.xpath("//*[@text= '"+texto+"']"));
        //getDriver().findElement(By.xpath("//*[@text= '"+texto+"']")).click();
    }
    
    public String obterTituloAlerta() {
		return obterTexto(By.id("android:id/alertTitle"));
	}
	
	public String obterMensagemAlerta() {
		return obterTexto(By.id("android:id/message"));
	}

    public void selecionarCombo(By by, String valor){
        getDriver().findElement(by).click();
        clicarPorTexto(valor);
    }

    public boolean isCheckMarcado(By by){
        return getDriver().findElement(by).getAttribute("checked").equals("true");
    }
    
    public boolean existeElementoPorTexto(String texto) {
    	List<MobileElement> elementos = getDriver().findElements(By.xpath("//*[@text= '"+texto+"']"));
    	return elementos.size() > 0;
    }
    
    public void tap(int x, int y) {
    	new AndroidTouchAction(getDriver()).press(PointOption.point(x, y))
    		.moveTo(PointOption.point(x, y)).release().perform();
    }
	
    public void scrollDown() {
    	scroll(0.9, 0.1);
    }
    
    public void scrollUp() {
    	scroll(0.1, 0.9);
    }
    
    public void swipeLeft() {
    	scroll(0.1, 0.9);
    }
    
    public void swipeRight() {
    	scroll(0.9, 0.1);
    }
    
    public void scroll(double inicio, double fim) {
    	Dimension size = getDriver().manage().window().getSize();
    	
    	int x = size.width / 2;
    	
    	int start_y = (int) (size.height * inicio);
    	int end_y = (int) (size.height * fim);
    	
    	new AndroidTouchAction(getDriver()).press(PointOption.point(x, start_y))
    		.waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
    		.moveTo(PointOption.point(x, end_y)).release().perform();
    }
        
    public void swipe(double inicio, double fim) {
    	Dimension size = getDriver().manage().window().getSize();
    	
    	int y = size.height / 2;
    	
    	int start_x = (int) (size.width * inicio);
    	int end_x = (int) (size.width * fim);
    	
    	new AndroidTouchAction(getDriver()).press(PointOption.point(start_x, y))
    		.waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
    		.moveTo(PointOption.point(end_x, y)).release().perform();
    }
    
    public void swipeElemento(MobileElement element, double inicio, double fim) {
    	   	
    	int y = element.getLocation().y + (element.getSize().height / 2);
    	
    	int start_x = (int) (element.getSize().width * inicio);
    	int end_x = (int) (element.getSize().width * fim);
    	
    	new AndroidTouchAction(getDriver()).press(PointOption.point(start_x, y))
    		.waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
    		.moveTo(PointOption.point(end_x, y)).release().perform();
    }
    
    public void clicarLongo(By by) {
    	new AndroidTouchAction(getDriver())
    	.longPress(ElementOption.element(getDriver()
    	.findElement(by))).perform();
    }
    
    
    
    
}










