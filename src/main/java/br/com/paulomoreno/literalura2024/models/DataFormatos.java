package br.com.paulomoreno.literalura2024.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DataFormatos(@JsonAlias("image/jpeg") String poster) {
}




