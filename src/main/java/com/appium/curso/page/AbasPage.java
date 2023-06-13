package com.appium.curso.page;

import org.openqa.selenium.By;

import com.appium.curso.core.BasePage;

public class AbasPage extends BasePage {

	public void clicarAba1() {
		clicarPorTexto("Aba 1");
	}
	
	public void clicarAba2() {
		clicarPorTexto("Aba 2");
	}
	
	public String obterTexto() {
		return obterTexto(By.xpath("//android.widget.TextView[@index = '0']"));
	}
	
	public boolean isAba1() {
		return existeElementoPorTexto("Este é o conteúdo da Aba 1");
	}
}
