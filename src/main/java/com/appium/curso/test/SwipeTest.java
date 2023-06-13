package com.appium.curso.test;

import org.junit.Assert;
import org.junit.Test;

import com.appium.curso.core.BaseTest;
import com.appium.curso.page.MenuPage;

public class SwipeTest extends BaseTest {

	private MenuPage menu = new MenuPage();
	
	@Test
	public void deveRealizarSwipe() {
		
		menu.acessarSwipe();
		
		//verificar texto 'a esquerda'
		Assert.assertTrue(menu.existeElementoPorTexto("a esquerda"));
		
		//swipe para direita
		menu.swipeLeft();
		
		//verificar texto 'E veja se'
		Assert.assertTrue(menu.existeElementoPorTexto("E veja se"));
		
		//clicar botão direita
		menu.clicarPorTexto("›");
		
		//verificar texto 'Chegar até o fim'
		Assert.assertTrue(menu.existeElementoPorTexto("Chegar até o fim!"));
		
		//swipe esquerda
		menu.swipeRight();
		
		//clicar botao esquerda
		menu.clicarPorTexto("‹");
		
		//verficiar texto 'a esquerda'
		Assert.assertTrue(menu.existeElementoPorTexto("a esquerda"));
	}
	
	
}
