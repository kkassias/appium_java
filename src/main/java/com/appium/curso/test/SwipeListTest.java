package com.appium.curso.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.appium.curso.core.BaseTest;
import com.appium.curso.page.MenuPage;
import com.appium.curso.page.SwipeListPage;

public class SwipeListTest extends BaseTest {

	private MenuPage menu = new MenuPage();
	private SwipeListPage page = new SwipeListPage();
	
	@Before
	public void acessarSwipeList() {
		menu.acessarSwipeList();
	}
	
	@Test
	public void desafioSwipeList() {
		
		page.swipeElementRight("Opção 1");
		page.clicarBotaoMais();
		Assert.assertTrue(page.existeElementoPorTexto("Opção 1 (+)"));
		
		page.swipeElementRight("Opção 4");
		page.clicarPorTexto("(-)");
		Assert.assertTrue(page.existeElementoPorTexto("Opção 4 (-)"));
		
		page.swipeElementLeft("Opção 5 (-)");
		Assert.assertTrue(page.existeElementoPorTexto("Opção 5"));
	}
}
