package steps;
import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class repositorioDetalhesTest {
	
	Metodos me = new Metodos();
	Elementos el = new Elementos();

	@When("selecionar qualquer atributo do repositório na tela Meus Repositorios")
	public void selecionarQualquerAtributoDoRepositórioNaTelaMeusRepositorios() {
	    me.clicar(el.proprietario);
	}
	@Then("deve ser redirecionado a uma tela detalhe")
	public void deveSerRedirecionadoAUmaTelaDetalhe() throws IOException {
	    me.evidenciarTeste("Não foi possível acessar");
	}	
}
