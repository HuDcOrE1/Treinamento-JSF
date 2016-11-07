package com.stefanini.service;
import java.io.Serializable;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Agente;
import com.stefanini.model.Denuncia;
import com.stefanini.repository.AgenteRepository;

public class AgenteService implements Serializable {
	
	@Inject
	private AgenteRepository agenteRepository;
	
	   @TransactionAttribute(TransactionAttributeType.REQUIRED)
	    public void incluir(Agente agente){
		   agenteRepository.incluir(agente);
	    }

}
