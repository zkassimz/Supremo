package com.supremo.kassiotech.models;

import javax.persistence.*;


@Entity
@Table(name = "Produtos")
public class Produtos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String produto;
    public Integer preco;
    public Integer imageID;
    public Integer quantidade;
    public String descricao;

    public Produtos() {
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Integer getPreco() {
        return preco;
    }

    public void setPreco(Integer preco) {
        this.preco = preco;
    }

    public Integer getImageID() {
        return imageID;
    }

    public void setImageID(Integer imageID) {
        this.imageID = imageID;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
