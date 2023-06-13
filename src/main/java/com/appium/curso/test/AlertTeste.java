package com.appium.curso.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.appium.curso.core.BaseTest;
import com.appium.curso.page.AlertasPage;
import com.appium.curso.page.MenuPage;

public class AlertTeste extends BaseTest {

	MenuPage menu = new MenuPage();
	AlertasPage page = new AlertasPage();
	
	@Before
	public void acessarMenuAlertas() {
		menu.acessarAlertas();
	}
	
	@Test
	public void deveConfirmarAlerta() {
		
		//Clicar em alerta confirm
		page.clicarAlertaConfirm();
		
		//Verificar textos
		Assert.assertEquals("Info", page.obterTituloAlerta());
		Assert.assertEquals("Confirma a operação?", page.obterMensagemAlerta());
		
		// Confirmar alerta
		page.confirmar();
		
		//Cerificar nova mensagem
		Assert.assertEquals("Confirmado", page.obterMensagemAlerta());
		
		//Sair
		page.sair();
	}
	
	@Test
	public void deveClicarForaAlerta() {
			
		//clicar em alerta simples
		page.clicarAlertaSimples();
		
		//verificar mensaggem
		Assert.assertEquals("Pode clicar no OK ou fora da caixa para sair", page.obterMensagemAlerta());	
		
		//clicar fora da caixa
		page.clicarForaCaixa();
		
		// verificar que mensagem fechou
		Assert.assertFalse(page.existeElementoPorTexto("Pode clicar no OK ou fora da caixa para sair"));
	}
}
