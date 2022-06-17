package br.com.projetokabum.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.projetokabum.actions.KabumAction;
import br.com.projetokabum.utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsKabum {
	
	DriverManager manager = new DriverManager();
	WebDriver driver = manager.abrirURL();
	KabumAction action = PageFactory.initElements(driver, KabumAction.class);
	
	public StepsKabum() throws Exception {
		
	}
	
	//Executa a URL vindo da feature e verifica se a URL condiz com a URL solicitada
	@Given("que esteja na pagina da {string}")
	public void que_esteja_na_pagina_da(String url) {
	    driver.get(url);
	    assertEquals("https://www.kabum.com.br/", url);
	}

	//Utiliza o nome do produto vindo da feature e verifica se é o mesmo
	@And("fizer uma busca pelo produto {string}")
	public void fizer_uma_busca_pelo_produto(String nomeProduto) {
	   action.escreverNotebook(nomeProduto);
	   assertEquals("notebook", nomeProduto);
	}

	@And("clica no primeiro produto do resultado")
	public void clica_no_primeiro_produto_do_resultado() {
	    action.clicarResultado();
	}
	
	@And("digita o CEP")
	public void digita_o_cep() {
	    action.digitarCep();
	    	  	
	}
	
	@Given("imprimir valores de frete")
	public void imprimir_valores_de_frete() {
		action.clickBotaoOk();
	    
	}

	@And("fecha a tela de opcoes")
	public void fecha_a_tela_de_opcoes() throws InterruptedException {
	    action.clickClose();
	}

	@And("clica em comprar")
	public void clica_em_comprar() {
	    action.clickComprar();
	}
	
	@And("clica na garantia estendida")
	public void clica_na_garantia_estendida() {
		action.clickGarantia();
	}
	
	@When("clica para direcionar ao carrinho")
	public void clica_para_direcionar_ao_carrinho() {
	    action.goToCart();
	}
	
	//Valida se o produto está presente no carrinho
	@Then("valida o produto adicionado")
	public void valida_o_produto_adicionado() {
	   assertTrue(action.validarProduto());
	}
	
	
}
