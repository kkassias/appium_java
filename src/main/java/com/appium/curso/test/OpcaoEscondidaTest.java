package com.appium.curso.test;

import org.junit.Assert;
import org.junit.Test;

import com.appium.curso.core.BaseTest;
import com.appium.curso.page.MenuPage;

public class OpcaoEscondidaTest extends BaseTest {

	private MenuPage menu = new MenuPage();
	
	@Test
	public void clicarOpcaoEscondida() {
		//menu.scroll(0.9, 0.1);
		
		menu.scrollDown();
		
		menu.clicarPorTexto("Opção bem escondida");
		
		Assert.assertEquals("Você achou essa opção", menu.obterMensagemAlerta());
		
		menu.clicarPorTexto("OK");
	}
}
