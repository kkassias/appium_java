package com.appium.curso.test;

import static com.appium.curso.core.DriverFactory.getDriver;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import com.appium.curso.core.BaseTest;
import com.appium.curso.page.MenuPage;
import com.appium.curso.page.SeuBarrigaPage;

public class SeuBarrigaTest extends BaseTest {

	private MenuPage menu = new MenuPage();
	private SeuBarrigaPage page = new SeuBarrigaPage();
	
	String contaTeste = "Teste Conta";
	String movTeste = "Teste Movimentação";
	String movNumTeste = "1234";
	
	@Before
	public void acessarSeuBarriga() {
		menu.acessarSeuBarrigaNativo();
	}
	
	@Test
	public void loginCorreto() {
		page.clicarPorTexto("Nome");
		page.preencherUsuario("kassia@teste.com");
		
		page.clicarPorTexto("Senha");
		page.preencherSenha("1234");
		
		page.clicarPorTexto("ENTRAR");
		
		Assert.assertTrue(page.existeElementoPorTexto("Home"));
	}
	
	@Test
	public void adicionarConta() {
		loginCorreto();
		
		page.acessarMenuContas();
		
		page.clicarPorTexto("Conta");
		page.escrever(By.xpath("//android.widget.EditText[@text= 'Conta']"), contaTeste);
		page.clicarPorTexto("SALVAR");
		
		Assert.assertTrue(page.existeElementoPorTexto(contaTeste));
	}
	
	@Test
	public void excluirConta() {
		loginCorreto();
		page.acessarMenuContas();
		
		page.clicarLongo(By.xpath("//*[@text = '"+contaTeste+"']"));
		page.clicarPorTexto("EXCLUIR");
		page.clicarPorTexto("EXCLUIR");
		
		Assert.assertTrue(page.existeElementoPorTexto("Conta excluída com sucesso"));
		Assert.assertFalse(page.existeElementoPorTexto(contaTeste));
	}
	
	@Test
	public void adicionarMovimentacao() {
		loginCorreto();
		
		page.acessarMenuMov();
		Assert.assertTrue(page.existeElementoPorTexto("Receita"));
		
		page.clicarPorTexto("SALVAR");
		Assert.assertTrue(page.existeElementoPorTexto("Descrição é um campo obrigatório"));
		
		page.clicarPorTexto("Descrição");
		page.preencherDescricao(movTeste);
		
		page.clicarPorTexto("SALVAR");
		Assert.assertTrue(page.existeElementoPorTexto("Interessado é um campo obrigatório"));
		
		page.clicarPorTexto("Interessado");
		page.preencherInteressado(movTeste);
		
		page.clicarPorTexto("SALVAR");
		Assert.assertTrue(page.existeElementoPorTexto("Valor é um campo obrigatório"));
		
		page.preencherValor("123");
		
		page.clicarPorTexto("SALVAR");
		Assert.assertTrue(page.existeElementoPorTexto("Conta é um campo obrigatório"));
		
		page.selecionarConta("Conta para alterar");
		
		page.clicarPorTexto("SALVAR");
		Assert.assertTrue(page.existeElementoPorTexto("Movimentação cadastrada com sucesso"));
						
	}
	
	@Test
	public void exclusaoResumo() {
		loginCorreto();
		
		Assert.assertEquals("534.00", page.obterSaldoConta("Conta para saldo"));
		
		page.acessarMenuResumo();
		
		//page.swipeElementRight("Movimentacao 2, calculo saldo");
		page.swipeElemento(getDriver().findElement(By.xpath("//*[@text='Movimentacao 3, calculo saldo']/..")), 0.9, 0.1);
		esperar(1000);
		page.clicarPorTexto("Del");
		
		Assert.assertTrue(page.existeElementoPorTexto("Movimentação removida com sucesso!"));
		
		page.acessarMenuHome();
		esperar(1000);
		page.scroll(0.2, 0.9);
		
		Assert.assertEquals("1534.00", page.obterSaldoConta("Conta para saldo"));
	}
	

}
