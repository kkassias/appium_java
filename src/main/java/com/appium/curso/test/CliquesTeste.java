package com.appium.curso.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.appium.curso.core.BaseTest;
import com.appium.curso.page.CliquesPage;
import com.appium.curso.page.MenuPage;

public class CliquesTeste extends BaseTest {

	private MenuPage menu = new MenuPage();
	private CliquesPage page = new CliquesPage();
	
	@Before
	public void entrarCliques() {
		menu.acessarCliques();
	}
	
	@Test
	public void deveRealizarCliqueLongo() {
			
		page.cliqueLongo();
		
		Assert.assertEquals("Clique Longo", page.obterTextoCampo());
	}
	
	@Test
	public void deveRealizarCliqueDuplo() {
		page.clicarPorTexto("Clique duplo");
		page.clicarPorTexto("Clique duplo");
		
		Assert.assertEquals("Duplo Clique", page.obterTextoCampo());
	}
}
