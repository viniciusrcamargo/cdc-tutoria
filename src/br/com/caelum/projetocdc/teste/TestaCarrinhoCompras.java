package br.com.caelum.projetocdc.teste;

import java.util.Calendar;

import br.com.caelum.projetocdc.Autor;
import br.com.caelum.projetocdc.CarrinhoDeCompras;
import br.com.caelum.projetocdc.Item;
import br.com.caelum.projetocdc.Livro;
import br.com.caelum.projetocdc.Tipo;

public class TestaCarrinhoCompras {

	public static void main(String[] args) {
		
		Calendar dataUltimaAtualizacao = Calendar.getInstance();
		dataUltimaAtualizacao.set(2017, 03, 01);
		
		Calendar dataLancamento = Calendar.getInstance();
		dataLancamento.set(2014, 02, 15);
		
		Autor everton = new Autor("Everton Coimbra de Araújo");
		Livro livroUm = new Livro("ASP.NET MVC5", "Crie aplicações Web na plataforma Microsoft", everton, Tipo.EBOOK, 29.90,
				dataUltimaAtualizacao, dataLancamento);

		Autor willian = new Autor("Willian Molinari");
		Livro livroDois = new Livro("Desconstruindo a Web", "As tecnologias por tráz de uma requisição", willian, Tipo.IMPRESSO, 69.90,
				dataUltimaAtualizacao, dataLancamento);
		
		Livro livroTres = new Livro("Desconstruindo a Web", "As tecnologias por tráz de uma requisição", willian, Tipo.EBOOK, 29.90,
				dataUltimaAtualizacao, dataLancamento);
		
		Item itemUm = new Item(livroUm, 3);
		Item itemDois = new Item(livroDois, 2);
		Item itemTres = new Item(livroTres, 1);
		
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		
		carrinhoDeCompras.adiciona(itemUm);
		carrinhoDeCompras.adiciona(itemDois);
		carrinhoDeCompras.adiciona(itemTres);
		
		carrinhoDeCompras.getItens().forEach(item -> {
			System.out.println(item);
		});
		
		System.out.println(carrinhoDeCompras.getQuantidadeItens());
		
		System.out.println(carrinhoDeCompras.getValorTotal());
		
		
		carrinhoDeCompras.atualizarQuantidadeItem(itemUm, 1);
		carrinhoDeCompras.getItens().forEach(item -> {
			System.out.println(item);
		});

		carrinhoDeCompras.remove(itemUm);
		
		System.out.println(livroUm);
	}

}
