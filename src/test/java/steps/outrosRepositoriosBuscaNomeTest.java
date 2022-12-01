package steps;
import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class outrosRepositoriosBuscaNomeTest {
	Metodos me = new Metodos();
	Elementos el = new Elementos();

	@When("estiver na tela outros Repositorios")
	public void estiverNaTelaOutrosRepositorios() {
	    me.clicar(el.outrosRepositorios);
	}
	@Then("deve conseguir pesquisar um repositório pelo nome")
	public void deveConseguirPesquisarUmRepositórioPeloNome() throws IOException {
	    me.escrever(el.campoNomeRepositorio, "AlcoolOuGasolina");
	    me.clicar(el.btnBuscar);
	    me.validarTexto(el.validacaoProprietario3, "damasio34");
	    me.evidenciarTeste("Outros repositorios buscar nome - sucesso");
	}

	


	
}
