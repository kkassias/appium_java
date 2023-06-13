package com.appium.curso.page;

import org.openqa.selenium.By;

import com.appium.curso.core.BasePage;

public class AlertasPage extends BasePage {
	
	public void clicarAlertaSimples() {
		clicarPorTexto("ALERTA SIMPLES");
	}
	
	public void clicarAlertaRestritivo() {
		clicarPorTexto("ALERTA RESTRITIVO");
	}
	
	public void clicarAlertaConfirm() {
		clicarPorTexto("ALERTA CONFIRM");
	}
	
	public String obterTituloAlerta() {
		return obterTexto(By.id("android:id/alertTitle"));
	}
	
	public String obterMensagemAlerta() {
		return obterTexto(By.id("android:id/message"));
	}
	
	public void confirmar() {
		clicarPorTexto("CONFIRMAR");
	}
	
	public void negar() {
		clicarPorTexto("NEGAR");
	}
	
	public void sair() {
		clicarPorTexto("SAIR");
	}
	
	public void clicarForaCaixa() {
		tap(150, 500);
	}
}
