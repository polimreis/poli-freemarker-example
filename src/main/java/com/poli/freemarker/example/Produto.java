/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poli.freemarker.example;

/**
 *
 * @author poliana
 */
public class Produto {

    private String nome;

    private double preco;

    public Produto(String nome, double preco) {

        super();

        this.nome = nome;

        this.preco = preco;

    }

    public String getNome() {

        return nome;

    }

    public double getPreco() {

        return preco;

    }

}
