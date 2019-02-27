package com.br.estudo.projeto.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tarefa")
public class Tarefa {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "tarefa_id")
    private Long id;
	@Column(name = "tarefa_descricao")
	private String descricao;
	@Column(name = "tarefa_finalizado")
    private boolean finalizado;
	@Column(name = "tarefa_data_finalizacao")
    private Calendar dataFinalizacao;
    
    public Tarefa() {}
    
    public Tarefa(Long id, String descricao, boolean finalizado, Calendar dataFinalizacao) {
    	setId(id);
    	setDescricao(descricao);
    	setFinalizado(finalizado);
    	setDataFinalizacao(dataFinalizacao);
    }
    
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public boolean isFinalizado() {
		return finalizado;
	}
	
	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}
	
	public Calendar getDataFinalizacao() {
		return dataFinalizacao;
	}
	
	public void setDataFinalizacao(Calendar dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}

}