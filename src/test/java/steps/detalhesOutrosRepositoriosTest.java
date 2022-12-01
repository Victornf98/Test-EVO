package steps;
import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class detalhesOutrosRepositoriosTest {
	
	Metodos me = new Metodos();
	Elementos el = new Elementos();
	
	@When("estiver na tela Outros Repositórios")
	public void estiverNaTelaOutrosRepositórios() {
	    me.clicar(el.outrosRepositorios);
	}
	@When("pesquisar um repositório")
	public void pesquisarUmRepositório() {
	    me.escrever(el.campoNomeRepositorio, "APINode");
	    me.clicar(el.btnBuscar);
	}
	@Then("deve ter acesso aos detalhes do repositório pesquisado")
	public void deveTerAcessoAosDetalhesDoRepositórioPesquisado() throws IOException {
	    me.clicar(el.submitDetalhe);
	    me.validarTexto(el.validarJavaScript, "JavaScript");
	    me.evidenciarTeste("Acesso aos detalhes - sucesso");
	}	
}
