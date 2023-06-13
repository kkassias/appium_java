package com.appium.curso.page;

import static com.appium.curso.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import com.appium.curso.core.BasePage;


public class SeuBarrigaPage extends BasePage {

	public void acessarMenuHome() {
		clicarPorTexto("Home");
	}
	
	public void acessarMenuContas() {
		clicarPorTexto("Contas");
	}
	
	public void acessarMenuMov() {
		clicarPorTexto("Mov...");
	}
	
	public void acessarMenuResumo() {
		clicarPorTexto("Resumo");
	}
	
	public void preencherUsuario(String usuario) {
		escrever(By.xpath("//android.widget.EditText[@text= 'Nome']"), usuario);
	}
	
	public void preencherSenha(String senha) {
		escrever(By.xpath("//android.widget.EditText[@text= 'Senha']"), senha);
	}
	
	public void preencherDescricao(String descricao) {
		escrever(By.xpath("//android.widget.EditText[@text= 'Descrição']"), descricao);
	}
	
	public void preencherInteressado(String interessado) {
		escrever(By.xpath("//android.widget.EditText[@text= 'Interessado']"), interessado);
	}
	
	public void preencherValor(String valor) {
		escrever(By.xpath("//android.widget.EditText[3]"), valor);
	}
	
	public void selecionarConta(String conta) {
		selecionarCombo(By.xpath("//android.widget.Spinner[2]"), conta);
	}
	
	public String obterSaldoConta(String conta) {
		return obterTexto(By.xpath("//*[@text='"+conta+"']/following-sibling::android.widget.TextView"));
	}
	
	
	public void swipeElementLeft(String opcao) {
		swipeElemento(getDriver().findElement(By.xpath("//*[@text='"+opcao+"']/..")), 0.1, 0.9);
	}
	
	public void swipeElementRight(String opcao) {
		swipeElemento(getDriver().findElement(By.xpath("//*[@text= '"+opcao+"']/..")), 0.9, 0.1);
	}
	
	
	
}
