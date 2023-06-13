package com.appium.curso.test;

import org.junit.Assert;
import org.junit.Test;

import com.appium.curso.core.BaseTest;
import com.appium.curso.page.AcordionPage;
import com.appium.curso.page.MenuPage;

public class AcordionTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private AcordionPage page = new AcordionPage();
	
	@Test
	public void deveInteragirComAcordion() {
		//acessar menu
		menu.acessarAcordion();
		
		//Clicar opção 1
		page.selecionarOp1();
		
		//Verificar testo 1
		Assert.assertEquals("Esta é a descrição da opção 1", page.obterValorOp1());
	}
}
