package com.example.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.models.Docente;

@Repository
public interface DocenteRepository extends JpaRepository<Docente, Long> {

	
	@Query("SELECT CASE WHEN COUNT(d) > 0 THEN true ELSE false END FROM Docente d WHERE d.tipo_Documento = :tipo_Documento AND d.numero_Documento = :numero_Documento")
	boolean existsByTipo_DocumentoAndNumero_Documento(@Param("tipo_Documento") String tipo_Documento, @Param("numero_Documento") String numero_Documento);

	 @Query("SELECT CASE WHEN COUNT(d) > 0 THEN true ELSE false END FROM Docente d WHERE d.numero_Documento = :numero_Documento AND d.tipo_Documento <> :tipo_Documento")
	    boolean existsByNumero_DocumentoAndTipo_DocumentoNot(@Param("numero_Documento") String numero_Documento, @Param("tipo_Documento") String tipo_Documento);

	
	

}




