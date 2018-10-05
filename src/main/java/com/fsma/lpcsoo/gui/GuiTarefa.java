/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fsma.lpcsoo.gui;

import com.fsma.lpcsoo.model.Tarefa;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author acg
 */
@Named(value = "guiTarefa")
@SessionScoped
public class GuiTarefa implements Serializable {

    private Tarefa minhaTarefa;
    private Boolean alterando;
    private List<Tarefa> tarefas;

    public String iniciarTarefa() {
        tarefas = Tarefa.getTarefas();
        return "FrmTarefas";
    }

    public String incluir() {
        minhaTarefa = new Tarefa();
        alterando = false;
        return "FrmCadTarefa";
    }

    public String alterar(Tarefa tarefa) {
        minhaTarefa = tarefa;
        alterando = true;
        return "FrmCadTarefa";
    }

    public String excluir(Tarefa tarefa) {
        Tarefa.removerTarefa(tarefa);
        tarefas = Tarefa.getTarefas();
        return null;
    }

    public String gravar() {
        if (alterando==false) {
            Tarefa.adicionarTarefa(minhaTarefa);
        }
        tarefas = Tarefa.getTarefas();
        return "FrmTarefas";
    }
    /**
     * Creates a new instance of GuiTarefa
     */
    public GuiTarefa() {
    }

    public Tarefa getMinhaTarefa() {
        return minhaTarefa;
    }

    public void setMinhaTarefa(Tarefa minhaTarefa) {
        this.minhaTarefa = minhaTarefa;
    }

    public Boolean getAlterando() {
        return alterando;
    }

    public void setAlterando(Boolean alterando) {
        this.alterando = alterando;
    }

}
