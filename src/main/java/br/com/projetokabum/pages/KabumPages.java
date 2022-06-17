package br.com.projetokabum.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import br.com.projetokabum.utils.DriverContext;

public class KabumPages {

	public KabumPages() {
		PageFactory.initElements(DriverContext.getDriver(), this);	
	}
	
	//Atribuindo o elemento pelo ID
	@FindBy(how=How.ID, using = "input-busca")
	protected WebElement escreverNotebook;
	
	//Atribuindo o elemento pelo XPATH
	@FindBy(how=How.XPATH, using = "//*[@id=\"barraBuscaKabum\"]/div/div/div[1]/div/div[2]")
	protected WebElement clicarResultado;
	
	//Atribuindo o elemento pelo ID
	@FindBy(how=How.ID, using = "inputCalcularFrete")
	protected WebElement digitarCep;
	
	//Atribuindo o elemento pelo ID
	@FindBy(how=How.ID, using = "botaoCalcularFrete")
	protected WebElement clickBotaoOk;
	
	//Atribuindo o elemento pelo XPATH
	@FindBy(how=How.XPATH, using = "//*[@id=\"modalWrapper\"]/div/div[1]/div[2]")
	protected WebElement clickClose;
	
	//Atribuindo o elemento pelo XPATH
	@FindBy(how=How.XPATH, using = "//*[@id=\"blocoValores\"]/div[2]/button")
	protected WebElement clickComprar;
	
	//Atribuindo o elemento pelo XPATH
	@FindBy(how=How.XPATH, using = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div/div/div[4]/button[1]")
	protected WebElement goToCart;
	
	//Atribuindo o elemento pelo XPATH
	@FindBy(how=How.XPATH, using = "//*[@id=\"sellersContainer\"]/div/div/div/details/div/form/label[2]")
	protected WebElement clickGarantia;
	
	//Atribuindo o elemento pelo CLASS_NAME
	@FindBy(how=How.CLASS_NAME, using = "productImage")
	protected WebElement validarProduto;
		
}
