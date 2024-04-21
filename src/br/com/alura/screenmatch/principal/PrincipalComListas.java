package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        var outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(8);
        Serie serie = new Serie("Lost", 2000);

        Filme f1 = outroFilme;

        List<Titulo> lista = new ArrayList<>();

        lista.add(outroFilme);
        lista.add(meuFilme);
        lista.add(serie);

        for (Titulo item: lista) {
            System.out.println(item.getNome());

            if (item instanceof Filme filme && filme.getClassificacao() > 2) {

                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        System.out.println("Lista de títulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por Ano");
        System.out.println(lista);
    }
}
