package com.appium.curso.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.appium.curso.core.BaseTest;
import com.appium.curso.page.DragDropPage;
import com.appium.curso.page.MenuPage;

public class DragDropTest extends BaseTest {

	private MenuPage menu = new MenuPage();
	private DragDropPage page = new DragDropPage();
	
	private String[] estadoInicial = new String[]{"Esta", "é uma lista", "Drag em Drop!", "Faça um clique longo,", "e arraste para", "qualquer local desejado."};
	
	private String[] estadoIntermediario = new String[]{"é uma lista", "Drag em Drop!", "Faça um clique longo,", "e arraste para", "Esta", "qualquer local desejado."};
	
	private String[] estadoFinal = new String[]{"Faça um clique longo,", "é uma lista", "Drag em Drop!", "e arraste para", "Esta", "qualquer local desejado."};
	
	@Before
	public void acessarDragDrop() {
		menu.acessarDragDrop();
	}
	
	@Test
	public void realizarDragDrop() {
		esperar(1000);
		Assert.assertArrayEquals(estadoInicial, page.obterLista());
		
		page.arrastar("Esta", "e arraste para");
		Assert.assertArrayEquals(estadoIntermediario, page.obterLista());
		
		page.arrastar("Faça um clique longo,", "é uma lista");
		Assert.assertArrayEquals(estadoFinal, page.obterLista());
	}
}
