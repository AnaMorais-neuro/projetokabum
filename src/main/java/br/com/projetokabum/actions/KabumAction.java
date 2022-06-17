package br.com.projetokabum.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.projetokabum.pages.KabumPages;
import br.com.projetokabum.utils.DriverContext;

//Classe Page
public class KabumAction extends KabumPages{

	//Atributo do WebDriverWait para esperar um tempo de retorno
	protected WebDriverWait wait;

	public KabumAction() {
		wait = new WebDriverWait(DriverContext.getDriver(), 10);	
	}
	
	//Escrevendo no campo de busca
	public void escreverNotebook(String nomeProduto) {
		escreverNotebook.sendKeys(nomeProduto);		
	}
	
	//Fazendo a pesquisa pela busca do produto
	public void clicarResultado() {
		clicarResultado.click();
	}
	
	//Escrevendo no campo CEP
	public void digitarCep() {
		digitarCep.sendKeys("50731490");
		
	}
	
	//Botao para confimar o CEP e exibir os valores do frete
	public void clickBotaoOk() {
		clickBotaoOk.click();
	}
	
	//Fechar a janela de valores do frete
	public void clickClose() throws InterruptedException {
		clickClose.click();
	}
	
	//Clica no botao de comprar o produto
	public void clickComprar() {
		clickComprar.click();
	}
	
	//Clica no botao que direciona ao carrinho
	public void goToCart() {
		goToCart.click();
	}
	
	//Clica no radionbutton que seleciona a garantia estendia
	public void clickGarantia() {
		clickGarantia.findElement(By.xpath("//*[@id=\"sellersContainer\"]/div/div/div/details/div/form/label[2]")).click();	
	}
	
	//Valida se o produto esta adicionado no carrinho
	public boolean validarProduto() {
		return validarProduto.isDisplayed();
	}
	
}