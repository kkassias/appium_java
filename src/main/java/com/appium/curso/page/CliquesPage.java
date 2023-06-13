package com.appium.curso.page;

import com.appium.curso.core.BasePage;
import static com.appium.curso.core.DriverFactory.getDriver;

import org.openqa.selenium.By;


public class CliquesPage extends BasePage {
	

	public void cliqueLongo() {
		//new TouchAction(getDriver()).longPress(getDriver().findElement(By.xpath("//*[@text= 'Clique Longo']"))).perform();
		clicarLongo(By.xpath("//*[@text= 'Clique Longo']"));
	}
	
	
	public String obterTextoCampo() {
		return getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]")).getText();
	}
}
