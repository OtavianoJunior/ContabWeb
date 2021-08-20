package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela CUC
* @generated
*/
@Entity
@Table(name = "\"CUC\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.CUC")
public class CUC implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "NRO_CUC", nullable = false, insertable=true, updatable=true)
        private java.lang.String nrO_CUC = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "NRO_CGC", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nrO_CGC;

    /**
    * @generated
    */
    @Column(name = "DES_NOME", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String deS_NOME;

    /**
    * @generated
    */
    @Column(name = "DES_EMAIL", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String deS_EMAIL;

    /**
    * @generated
    */
    @Column(name = "NRO_FONE1", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nrO_FONE1;

    /**
    * @generated
    */
    @Column(name = "DAT_CADASTRO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String daT_CADASTRO;

    /**
    * @generated
    */
    @Column(name = "DAT_LASTREC", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String daT_LASTREC;

    /**
    * @generated
    */
    @Column(name = "COD_USUARIO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String coD_USUARIO;

    /**
    * Construtor
    * @generated
    */
    public CUC(){
    }

    /**
    * Obtém nrO_CUC
    * return nrO_CUC
    * @generated
    */
    
    public java.lang.String getNrO_CUC(){
        return this.nrO_CUC;
    }

    /**
    * Define nrO_CUC
    * @param nrO_CUC nrO_CUC
    * @generated
    */
    public CUC setNrO_CUC(java.lang.String nrO_CUC){
        this.nrO_CUC = nrO_CUC;
        return this;
    }
    /**
    * Obtém nrO_CGC
    * return nrO_CGC
    * @generated
    */
    
    public java.lang.String getNrO_CGC(){
        return this.nrO_CGC;
    }

    /**
    * Define nrO_CGC
    * @param nrO_CGC nrO_CGC
    * @generated
    */
    public CUC setNrO_CGC(java.lang.String nrO_CGC){
        this.nrO_CGC = nrO_CGC;
        return this;
    }
    /**
    * Obtém deS_NOME
    * return deS_NOME
    * @generated
    */
    
    public java.lang.String getDeS_NOME(){
        return this.deS_NOME;
    }

    /**
    * Define deS_NOME
    * @param deS_NOME deS_NOME
    * @generated
    */
    public CUC setDeS_NOME(java.lang.String deS_NOME){
        this.deS_NOME = deS_NOME;
        return this;
    }
    /**
    * Obtém deS_EMAIL
    * return deS_EMAIL
    * @generated
    */
    
    public java.lang.String getDeS_EMAIL(){
        return this.deS_EMAIL;
    }

    /**
    * Define deS_EMAIL
    * @param deS_EMAIL deS_EMAIL
    * @generated
    */
    public CUC setDeS_EMAIL(java.lang.String deS_EMAIL){
        this.deS_EMAIL = deS_EMAIL;
        return this;
    }
    /**
    * Obtém nrO_FONE1
    * return nrO_FONE1
    * @generated
    */
    
    public java.lang.String getNrO_FONE1(){
        return this.nrO_FONE1;
    }

    /**
    * Define nrO_FONE1
    * @param nrO_FONE1 nrO_FONE1
    * @generated
    */
    public CUC setNrO_FONE1(java.lang.String nrO_FONE1){
        this.nrO_FONE1 = nrO_FONE1;
        return this;
    }
    /**
    * Obtém daT_CADASTRO
    * return daT_CADASTRO
    * @generated
    */
    
    public java.lang.String getDaT_CADASTRO(){
        return this.daT_CADASTRO;
    }

    /**
    * Define daT_CADASTRO
    * @param daT_CADASTRO daT_CADASTRO
    * @generated
    */
    public CUC setDaT_CADASTRO(java.lang.String daT_CADASTRO){
        this.daT_CADASTRO = daT_CADASTRO;
        return this;
    }
    /**
    * Obtém daT_LASTREC
    * return daT_LASTREC
    * @generated
    */
    
    public java.lang.String getDaT_LASTREC(){
        return this.daT_LASTREC;
    }

    /**
    * Define daT_LASTREC
    * @param daT_LASTREC daT_LASTREC
    * @generated
    */
    public CUC setDaT_LASTREC(java.lang.String daT_LASTREC){
        this.daT_LASTREC = daT_LASTREC;
        return this;
    }
    /**
    * Obtém coD_USUARIO
    * return coD_USUARIO
    * @generated
    */
    
    public java.lang.String getCoD_USUARIO(){
        return this.coD_USUARIO;
    }

    /**
    * Define coD_USUARIO
    * @param coD_USUARIO coD_USUARIO
    * @generated
    */
    public CUC setCoD_USUARIO(java.lang.String coD_USUARIO){
        this.coD_USUARIO = coD_USUARIO;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
CUC object = (CUC)obj;
        if (nrO_CUC != null ? !nrO_CUC.equals(object.nrO_CUC) : object.nrO_CUC != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((nrO_CUC == null) ? 0 : nrO_CUC.hashCode());
        return result;
    }

}