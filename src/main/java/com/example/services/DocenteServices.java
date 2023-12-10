package com.example.services;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.models.Docente;
import com.example.repositories.DocenteRepository;

@Service
public class DocenteServices {
	
	@Autowired
	private DocenteRepository docenteRepository;
	
	public ArrayList<Docente> getAll(){
		
		return (ArrayList<Docente>) docenteRepository.findAll();
	}
	
	public Docente save(Docente docente) {
		    if (docenteRepository.existsByTipo_DocumentoAndNumero_Documento(docente.getTipo_Documento(), docente.getnumero_Documento())) {
	            throw new RuntimeException("YA EXISTE UN DOCENTE CON EL MISMO TIPO DE Y NUMERO DE DOCUMENTO.");
	        }

	        if (docenteRepository.existsByNumero_DocumentoAndTipo_DocumentoNot(docente.getnumero_Documento(), docente.getTipo_Documento())) {
	            throw new RuntimeException("YA EXISTE UN DOCENTE CON EL MISMO NÚMERO DE DOCUMENTO PERO DIFERENTE TIPO DE DOCUMENTO.");
	        }


	        return docenteRepository.save(docente);
		}
	
    public Docente update(Docente docente) {
         if (docenteRepository.existsById(docente.getId())) {
        return docenteRepository.save(docente);
    } else {
        throw new RuntimeException("ESTE DOCENTE NO EXISTE");
    }
}
	
	public void deleteById(Long id) {
	    if (docenteRepository.existsById(id)) {
	        docenteRepository.deleteById(id);
	    } else {
	        throw new RuntimeException("EL DOCENTE NO EXISTE");
	    }
	}
}
