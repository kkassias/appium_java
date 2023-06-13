package com.appium.curso.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.appium.curso.core.BaseTest;
import com.appium.curso.page.AbasPage;
import com.appium.curso.page.MenuPage;

public class AbasTeste extends BaseTest {

	MenuPage menu = new MenuPage();
	AbasPage page = new AbasPage();
	
	@Before
	public void acessarAbas() {
		menu.acessarAbas();
	}
	
	@Test
	public void deveInteragirComAbas() {
		//Acessar aba 1 - por padrao ao entrar em abas cai nela
		//Verificar que esta na aba 1
		Assert.assertTrue(page.isAba1());
		
		//Acessar aba 2
		page.clicarAba2();
		//Verificar que esta na aba 2
		Assert.assertEquals("Este é o conteúdo da Aba 2", page.obterTexto());
	}
}
