package br.com.paulomoreno.literalura2024.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record DataLivraria(@JsonAlias("results") List<DataLivro> livros) {

}
