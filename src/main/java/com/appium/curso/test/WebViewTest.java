package com.appium.curso.test;

import org.junit.Before;
import org.junit.Test;

import com.appium.curso.core.BaseTest;
import com.appium.curso.page.MenuPage;
import com.appium.curso.page.WebViewPage;

public class WebViewTest extends BaseTest {
	//Infos login - Nome: Kassia / Email: kassia@teste.com / Senha: 1234
	
	private MenuPage menu = new MenuPage();
	private WebViewPage page = new WebViewPage();

	@Before
	public void acessarSeuBarrigaHibrido() {
		menu.acessarSeuBarrigaHibrido();
		esperar(3000);
	}
	
	@Test
	public void realizarLogin() {
		
		page.entrarContextoWeb();
		page.setEmail("kassia@teste.com");
		
		//não finbalizado
	}
}
