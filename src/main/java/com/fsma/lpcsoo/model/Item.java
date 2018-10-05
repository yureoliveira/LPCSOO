/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fsma.lpcsoo.model;

import java.time.LocalDate;

/**
 *
 * @author acg
 */
public class Item {
    private String nome;
    private Double percentagem;
    private LocalDate dataConclusao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPercentagem() {
        return percentagem;
    }

    public void setPercentagem(Double percentagem) {
        this.percentagem = percentagem;
    }

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }
    
    
    
    
    
}
