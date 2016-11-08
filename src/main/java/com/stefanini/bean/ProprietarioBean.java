package com.stefanini.bean;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.inject.*;

import com.stefanini.model.Proprietario;
import com.stefanini.service.ProprietarioService;


@Named("proprietarioMB")
@SessionScoped
public class ProprietarioBean implements  Serializable{

	@Inject
	private ProprietarioService proprietarioService;
	
	@Inject
	Proprietario proprietario;
	
		public Proprietario getProprietario(){
			if(proprietario == null){
				proprietario = new Proprietario();
			}
			return proprietario;
			
		}
		public void setProprietario(Proprietario proprietario) {
			this.proprietario  = proprietario;
		}
		
		public String chamar(){
			this.proprietarioService.incluir(proprietario);
			return "teste.faces?faces-redirect=true";
			
		}
	
	
}
