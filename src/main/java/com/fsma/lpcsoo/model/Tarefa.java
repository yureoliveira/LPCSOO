/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fsma.lpcsoo.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author acg
 */
public class Tarefa {

    private String nome;
    private LocalDate dataLimite;
    private String descricao;
    private List<Item> items;
    private static List<Tarefa> tarefas = new ArrayList();

    public Tarefa() {
        items = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(LocalDate dataLimite) {
        this.dataLimite = dataLimite;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPercentualConcluido() {
        if (items.isEmpty()) {
            return 0.0;
        }

        Double total = 0.0;
        for (Item i : items) {
            total += i.getPercentagem();
        }

        return total / items.size();

    }

    public List<Item> getItems() {
        return items;
    }

    public void adicionarItem(Item item) {
        this.items.add(item);
    }

    public void removerItem(Item item) {
        this.items.remove(item);
    }

    public static List<Tarefa> getTarefas() {
        return tarefas;
    }

    public static void adicionarTarefa(Tarefa tarefa) {
        Tarefa.tarefas.add(tarefa);
    }

    public static void removerTarefa(Tarefa tarefa) {
        Tarefa.tarefas.remove(tarefa);
    }

}
