package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela PPA_PROGRAMA
* @generated
*/
@Entity
@Table(name = "\"PPA_PROGRAMA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.PPA_PROGRAMA")
public class PPA_PROGRAMA implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PROGRAMA", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer id_PROGRAMA;

    /**
    * @generated
    */
    @Column(name = "COD_PROGRAMA", nullable = true, unique = false, length=4, insertable=true, updatable=true)
        
        private java.lang.String coD_PROGRAMA;

    /**
    * @generated
    */
    @Column(name = "DES_PROGRAMA", nullable = true, unique = false, length=100, insertable=true, updatable=true, columnDefinition = "TEXT")
        
        private java.lang.String deS_PROGRAMA;

    /**
    * @generated
    */
    @Column(name = "DES_PROGRAMA_ORC", nullable = true, unique = false, length=40, insertable=true, updatable=true)
        
        private java.lang.String deS_PROGRAMA_ORC;

    /**
    * @generated
    */
    @Column(name = "DES_PIBLICOALVO", nullable = true, unique = false, length=100, insertable=true, updatable=true, columnDefinition = "TEXT")
        
        private java.lang.String deS_PIBLICOALVO;

    /**
    * @generated
    */
    @Column(name = "DES_FORMULA", nullable = true, unique = false, length=100, insertable=true, updatable=true, columnDefinition = "TEXT")
        
        private java.lang.String deS_FORMULA;

    /**
    * @generated
    */
    @Column(name = "FLG_NOVO", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String flG_NOVO;

    /**
    * @generated
    */
    @Column(name = "FLG_CAPTURADOORCAMENTO", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String flG_CAPTURADOORCAMENTO;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_LASTREC", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date daT_LASTREC;

    /**
    * @generated
    */
    @Column(name = "COD_USUARIO", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String coD_USUARIO;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="ID_ANOFISCAL", nullable = true, referencedColumnName = "ID_ANOFISCAL", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private ANOFISCALENTIDADE id_ANOFISCAL;

    /**
    * Construtor
    * @generated
    */
    public PPA_PROGRAMA(){
    }

    /**
    * Obtém id_PROGRAMA
    * return id_PROGRAMA
    * @generated
    */
    
    public java.lang.Integer getId_PROGRAMA(){
        return this.id_PROGRAMA;
    }

    /**
    * Define id_PROGRAMA
    * @param id_PROGRAMA id_PROGRAMA
    * @generated
    */
    public PPA_PROGRAMA setId_PROGRAMA(java.lang.Integer id_PROGRAMA){
        this.id_PROGRAMA = id_PROGRAMA;
        return this;
    }
    /**
    * Obtém coD_PROGRAMA
    * return coD_PROGRAMA
    * @generated
    */
    
    public java.lang.String getCoD_PROGRAMA(){
        return this.coD_PROGRAMA;
    }

    /**
    * Define coD_PROGRAMA
    * @param coD_PROGRAMA coD_PROGRAMA
    * @generated
    */
    public PPA_PROGRAMA setCoD_PROGRAMA(java.lang.String coD_PROGRAMA){
        this.coD_PROGRAMA = coD_PROGRAMA;
        return this;
    }
    /**
    * Obtém deS_PROGRAMA
    * return deS_PROGRAMA
    * @generated
    */
    
    public java.lang.String getDeS_PROGRAMA(){
        return this.deS_PROGRAMA;
    }

    /**
    * Define deS_PROGRAMA
    * @param deS_PROGRAMA deS_PROGRAMA
    * @generated
    */
    public PPA_PROGRAMA setDeS_PROGRAMA(java.lang.String deS_PROGRAMA){
        this.deS_PROGRAMA = deS_PROGRAMA;
        return this;
    }
    /**
    * Obtém deS_PROGRAMA_ORC
    * return deS_PROGRAMA_ORC
    * @generated
    */
    
    public java.lang.String getDeS_PROGRAMA_ORC(){
        return this.deS_PROGRAMA_ORC;
    }

    /**
    * Define deS_PROGRAMA_ORC
    * @param deS_PROGRAMA_ORC deS_PROGRAMA_ORC
    * @generated
    */
    public PPA_PROGRAMA setDeS_PROGRAMA_ORC(java.lang.String deS_PROGRAMA_ORC){
        this.deS_PROGRAMA_ORC = deS_PROGRAMA_ORC;
        return this;
    }
    /**
    * Obtém deS_PIBLICOALVO
    * return deS_PIBLICOALVO
    * @generated
    */
    
    public java.lang.String getDeS_PIBLICOALVO(){
        return this.deS_PIBLICOALVO;
    }

    /**
    * Define deS_PIBLICOALVO
    * @param deS_PIBLICOALVO deS_PIBLICOALVO
    * @generated
    */
    public PPA_PROGRAMA setDeS_PIBLICOALVO(java.lang.String deS_PIBLICOALVO){
        this.deS_PIBLICOALVO = deS_PIBLICOALVO;
        return this;
    }
    /**
    * Obtém deS_FORMULA
    * return deS_FORMULA
    * @generated
    */
    
    public java.lang.String getDeS_FORMULA(){
        return this.deS_FORMULA;
    }

    /**
    * Define deS_FORMULA
    * @param deS_FORMULA deS_FORMULA
    * @generated
    */
    public PPA_PROGRAMA setDeS_FORMULA(java.lang.String deS_FORMULA){
        this.deS_FORMULA = deS_FORMULA;
        return this;
    }
    /**
    * Obtém flG_NOVO
    * return flG_NOVO
    * @generated
    */
    
    public java.lang.String getFlG_NOVO(){
        return this.flG_NOVO;
    }

    /**
    * Define flG_NOVO
    * @param flG_NOVO flG_NOVO
    * @generated
    */
    public PPA_PROGRAMA setFlG_NOVO(java.lang.String flG_NOVO){
        this.flG_NOVO = flG_NOVO;
        return this;
    }
    /**
    * Obtém flG_CAPTURADOORCAMENTO
    * return flG_CAPTURADOORCAMENTO
    * @generated
    */
    
    public java.lang.String getFlG_CAPTURADOORCAMENTO(){
        return this.flG_CAPTURADOORCAMENTO;
    }

    /**
    * Define flG_CAPTURADOORCAMENTO
    * @param flG_CAPTURADOORCAMENTO flG_CAPTURADOORCAMENTO
    * @generated
    */
    public PPA_PROGRAMA setFlG_CAPTURADOORCAMENTO(java.lang.String flG_CAPTURADOORCAMENTO){
        this.flG_CAPTURADOORCAMENTO = flG_CAPTURADOORCAMENTO;
        return this;
    }
    /**
    * Obtém daT_LASTREC
    * return daT_LASTREC
    * @generated
    */
    
    public java.util.Date getDaT_LASTREC(){
        return this.daT_LASTREC;
    }

    /**
    * Define daT_LASTREC
    * @param daT_LASTREC daT_LASTREC
    * @generated
    */
    public PPA_PROGRAMA setDaT_LASTREC(java.util.Date daT_LASTREC){
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
    public PPA_PROGRAMA setCoD_USUARIO(java.lang.String coD_USUARIO){
        this.coD_USUARIO = coD_USUARIO;
        return this;
    }
    /**
    * Obtém id_ANOFISCAL
    * return id_ANOFISCAL
    * @generated
    */
    
    public ANOFISCALENTIDADE getId_ANOFISCAL(){
        return this.id_ANOFISCAL;
    }

    /**
    * Define id_ANOFISCAL
    * @param id_ANOFISCAL id_ANOFISCAL
    * @generated
    */
    public PPA_PROGRAMA setId_ANOFISCAL(ANOFISCALENTIDADE id_ANOFISCAL){
        this.id_ANOFISCAL = id_ANOFISCAL;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
PPA_PROGRAMA object = (PPA_PROGRAMA)obj;
        if (id_PROGRAMA != null ? !id_PROGRAMA.equals(object.id_PROGRAMA) : object.id_PROGRAMA != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id_PROGRAMA == null) ? 0 : id_PROGRAMA.hashCode());
        return result;
    }

}