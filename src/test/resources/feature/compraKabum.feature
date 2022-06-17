@comprakabum
Feature: Teste de compra no site kabum

  Scenario: 
    Given que esteja na pagina da "https://www.kabum.com.br/"
    And fizer uma busca pelo produto "notebook"
    And clica no primeiro produto do resultado
		And digita o CEP
		And imprimir valores de frete
		And fecha a tela de opcoes
		And clica em comprar
	  When clica para direcionar ao carrinho
	  And clica na garantia estendida 
		Then valida o produto adicionado