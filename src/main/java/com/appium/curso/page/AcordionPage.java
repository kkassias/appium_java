package com.appium.curso.page;

import org.openqa.selenium.By;

import com.appium.curso.core.BasePage;

public class AcordionPage extends BasePage {

	public void selecionarOp1(){
		clicarPorTexto("Opção 1");
	}
	
	public String obterValorOp1(){
		return obterTexto(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.TextView"));
	}
}
