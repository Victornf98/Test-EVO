package steps;
import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class atributosRepositorioTest {

	Metodos me = new Metodos();
	Elementos el = new Elementos();
	
	@When("selecionar o detalhe de um repositório")
	public void selecionarODetalheDeUmRepositório() {
	    me.clicar(el.detalhe);
	}
	@Then("deve ser redirecionado a uma tela com nome, descrição, linguagem, ultima data de atualização e o dono do repositório")
	public void deveSerRedirecionadoAUmaTelaComNomeDescriçãoLinguagemUltimaDataDeAtualizaçãoEODonoDoRepositório() throws IOException {
	    me.validarTexto(el.validarLinguagem, "Dart");
	    me.evidenciarTeste("O campo Dono do Repositorio não existe");
	}
}
