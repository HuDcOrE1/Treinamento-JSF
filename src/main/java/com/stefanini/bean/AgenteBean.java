package com.stefanini.bean;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.*;
import com.stefanini.model.Agente;
import com.stefanini.service.AgenteService;

@Named("agenteMB")
@SessionScoped
public class AgenteBean implements Serializable {

	@Inject
	private AgenteService agenteService;
	@Inject
	Agente agente;
	
		public Agente getAgente() {
		if(agente == null){
			agente = new Agente();
    	}
		return agente;
	}

	public void setAgente(Agente agente) {
		this.agente = agente;
	}


	public String chamar() {
		this.agenteService.incluir(agente);
		return "teste.faces?faces-redirect=true";
	}

}
