package com.appium.curso.test;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.appium.curso.core.BaseTest;
import com.appium.curso.core.DriverFactory;
import com.appium.curso.page.MenuPage;
import com.appium.curso.page.FormularioPage;
import io.appium.java_client.MobileBy;

public class FormularioTeste extends BaseTest {

	private MenuPage menu = new MenuPage();
	private FormularioPage page = new FormularioPage();

	@Before
	public void inicializarAppium() throws MalformedURLException {
		menu.acessarFormulario();
	}

	@Test
	public void devePreencherCampoTexto() throws MalformedURLException {

		page.escrever(MobileBy.AccessibilityId("nome"), "Kassia");

		assertEquals("Kassia", page.obterTexto(MobileBy.AccessibilityId("nome")));
	}

	@Test
	public void deveInteragirCombo() throws MalformedURLException {

		page.selecionarCombo(MobileBy.AccessibilityId("console"), "Nintendo Switch");

		String text = page.obterTexto(By.xpath("//android.widget.Spinner/android.widget.TextView"));
		Assert.assertEquals("Nintendo Switch", text);
	}

	@Test
	public void deveInteragirSwitchCheckbox() throws MalformedURLException {

		Assert.assertFalse(page.isCheckMarcado(By.className("android.widget.CheckBox")));
		Assert.assertTrue(page.isCheckMarcado(MobileBy.AccessibilityId("switch")));

		page.clicar(By.className("android.widget.CheckBox"));
		page.clicar(MobileBy.AccessibilityId("switch"));

		Assert.assertTrue(page.isCheckMarcado(By.className("android.widget.CheckBox")));
		Assert.assertFalse(page.isCheckMarcado(MobileBy.AccessibilityId("switch")));
	}

	@Test
	public void desafio() throws MalformedURLException {

		page.escreverNome("Kassia");

		page.selecionarCombo("PS4");
		page.clicarCheck();
		page.clicarSwitch();

		page.clicarSalvar();

		Assert.assertEquals("Nome: Kassia", page.obterNomeCadastrado());
		Assert.assertEquals("Console: ps4", page.obterConsoleCadastrado());
		Assert.assertTrue(page.obterCheckCadastrado().endsWith("Marcado"));
		Assert.assertTrue(page.obterSwitchCadastrado().endsWith("Off"));
	}

//	@Test
//    public void realizarCadastroDemorado() throws MalformedURLException {
//    	
//        page.escreverNome("Salvar Demorado");
//        
//        DriverFactory.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); //Espera implicita - otimo pra mobile
//        page.clicarSalvarDemorado();
//		// esperar(3000); Esse método é ruim pq ele vai esperar o tempo delimitado mesmo que execute rapidamente, causando demora.        
//        
//        WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10); //espera explicita - otimo para web
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text= 'Nome: Salvar Demorado']")));
//        
//        Assert.assertEquals("Nome: Salvar Demorado", page.obterNomeCadastrado());
//    }
	
	@Test
	public void deveAlterarData() {
		page.clicarPorTexto("01/01/2000");
		page.clicar(MobileBy.AccessibilityId("Próximo mês"));
		page.clicarPorTexto("27");
		page.clicarPorTexto("OK");
		Assert.assertTrue(page.existeElementoPorTexto("27/02/2000"));
	}
	
	@Test
	public void deveAlterarHora() {
		page.clicarPorTexto("09:00");
		page.clicar(MobileBy.AccessibilityId("6"));
		page.clicar(MobileBy.AccessibilityId("40"));
		page.clicarPorTexto("OK");
		Assert.assertTrue(page.existeElementoPorTexto("06:40"));
	}
	
	@Test
	public void deveInteragirComSeekbar() {
		//clicar no seekbar
		
		//salvar
		
		//obter o valor
	}

}
