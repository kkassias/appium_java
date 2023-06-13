package com.appium.curso.page;

import com.appium.curso.core.BasePage;

public class MenuPage extends BasePage {
	
	public void acessarAbout() {
		clicarPorTexto("About...");
	}
	
	public void acessarFormulario() {
		clicarPorTexto("Formulário");
	}
	
	public void acessarSeuBarrigaNativo() {
		clicarPorTexto("SeuBarriga Nativo");
	}
	
	public void acessarSeuBarrigaHibrido() {
		clicarPorTexto("SeuBarriga Híbrido");
	}
	
	public void acessarAlertas() {
		clicarPorTexto("Alertas");
	}
	
	public void acessarSplash() {
		clicarPorTexto("Splash");
	}
	
	public void acessarAbas() {
		clicarPorTexto("Abas");
	}
	
	public void acessarAcordion() {
		clicarPorTexto("Accordion");
	}
	
	public void acessarCliques() {
		clicarPorTexto("Cliques");
	}
	
	public void acessarSwipe() {
		clicarPorTexto("Swipe");
	}
	
	public void acessarSwipeList() {
		clicarPorTexto("Swipe List");
	}
	
	public void acessarDragDrop() {
		clicarPorTexto("Drag and drop");
	}
}
