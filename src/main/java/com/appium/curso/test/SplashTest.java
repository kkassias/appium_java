package com.appium.curso.test;

import org.junit.Assert;
import org.junit.Test;

import com.appium.curso.core.BaseTest;
import com.appium.curso.page.MenuPage;
import com.appium.curso.page.SplashPage;

public class SplashTest extends BaseTest {

	private MenuPage menu = new MenuPage();
	private SplashPage page = new SplashPage();
	@Test
	public void deveAguardarSplashSumir() {
		//acessar splash
		menu.acessarSplash();
		
		//verificar que o splash esta sendo exibido
		page.isTelaSplashVisivel();
		
		//aguardar saida do splash
		page.aguardarSplashSumir();
		
		//verificar que o fomrulario esta aparecendo
		Assert.assertTrue(page.existeElementoPorTexto("Formulário"));
	}
}
