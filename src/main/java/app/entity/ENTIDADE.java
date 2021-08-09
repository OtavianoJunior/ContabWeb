package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela ENTIDADE
* @generated
*/
@Entity
@Table(name = "\"ENTIDADE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.ENTIDADE")
public class ENTIDADE implements Serializable {

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
    @Column(name = "ID_ENTIDADE", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer id_ENTIDADE;

    /**
    * @generated
    */
    @Column(name = "COD_ENTIDADE", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer coD_ENTIDADE;

    /**
    * @generated
    */
    @Column(name = "DES_TIPOENTIDADE", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String deS_TIPOENTIDADE;

    /**
    * @generated
    */
    @Column(name = "NRO_CGC", nullable = true, unique = false, length=14, insertable=true, updatable=true)
        
        private java.lang.String nrO_CGC;

    /**
    * @generated
    */
    @Column(name = "NRO_INSCESTADUAL", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String nrO_INSCESTADUAL;

    /**
    * @generated
    */
    @Column(name = "DES_ENTIDADE", nullable = true, unique = false, length=40, insertable=true, updatable=true)
        
        private java.lang.String deS_ENTIDADE;

    /**
    * @generated
    */
    @Column(name = "DES_LOGRADOURO", nullable = true, unique = false, length=40, insertable=true, updatable=true)
        
        private java.lang.String deS_LOGRADOURO;

    /**
    * @generated
    */
    @Column(name = "NRO_ENDERECO", nullable = true, unique = false, length=15, insertable=true, updatable=true)
        
        private java.lang.String nrO_ENDERECO;

    /**
    * @generated
    */
    @Column(name = "DES_COMPLEMENTO", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String deS_COMPLEMENTO;

    /**
    * @generated
    */
    @Column(name = "DES_BAIRRO", nullable = true, unique = false, length=30, insertable=true, updatable=true)
        
        private java.lang.String deS_BAIRRO;

    /**
    * @generated
    */
    @Column(name = "NRO_CEP", nullable = true, unique = false, length=10, insertable=true, updatable=true)
        
        private java.lang.String nrO_CEP;

    /**
    * @generated
    */
    @Column(name = "NRO_TELEFONE", nullable = true, unique = false, length=10, insertable=true, updatable=true)
        
        private java.lang.String nrO_TELEFONE;

    /**
    * @generated
    */
    @Column(name = "NRO_FAX", nullable = true, unique = false, length=10, insertable=true, updatable=true)
        
        private java.lang.String nrO_FAX;

    /**
    * @generated
    */
    @Column(name = "DES_EMAIL", nullable = true, unique = false, length=40, insertable=true, updatable=true)
        
        private java.lang.String deS_EMAIL;

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
    @JoinColumn(name="fk_MUNICIPIO", nullable = true, referencedColumnName = "ID_MUNICIPIO", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private MUNICIPIO id_MUNICIPIO;

    /**
    * Construtor
    * @generated
    */
    public ENTIDADE(){
    }

    /**
    * Obtém id_ENTIDADE
    * return id_ENTIDADE
    * @generated
    */
    
    public java.lang.Integer getId_ENTIDADE(){
        return this.id_ENTIDADE;
    }

    /**
    * Define id_ENTIDADE
    * @param id_ENTIDADE id_ENTIDADE
    * @generated
    */
    public ENTIDADE setId_ENTIDADE(java.lang.Integer id_ENTIDADE){
        this.id_ENTIDADE = id_ENTIDADE;
        return this;
    }
    /**
    * Obtém coD_ENTIDADE
    * return coD_ENTIDADE
    * @generated
    */
    
    public java.lang.Integer getCoD_ENTIDADE(){
        return this.coD_ENTIDADE;
    }

    /**
    * Define coD_ENTIDADE
    * @param coD_ENTIDADE coD_ENTIDADE
    * @generated
    */
    public ENTIDADE setCoD_ENTIDADE(java.lang.Integer coD_ENTIDADE){
        this.coD_ENTIDADE = coD_ENTIDADE;
        return this;
    }
    /**
    * Obtém deS_TIPOENTIDADE
    * return deS_TIPOENTIDADE
    * @generated
    */
    
    public java.lang.String getDeS_TIPOENTIDADE(){
        return this.deS_TIPOENTIDADE;
    }

    /**
    * Define deS_TIPOENTIDADE
    * @param deS_TIPOENTIDADE deS_TIPOENTIDADE
    * @generated
    */
    public ENTIDADE setDeS_TIPOENTIDADE(java.lang.String deS_TIPOENTIDADE){
        this.deS_TIPOENTIDADE = deS_TIPOENTIDADE;
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
    public ENTIDADE setNrO_CGC(java.lang.String nrO_CGC){
        this.nrO_CGC = nrO_CGC;
        return this;
    }
    /**
    * Obtém nrO_INSCESTADUAL
    * return nrO_INSCESTADUAL
    * @generated
    */
    
    public java.lang.String getNrO_INSCESTADUAL(){
        return this.nrO_INSCESTADUAL;
    }

    /**
    * Define nrO_INSCESTADUAL
    * @param nrO_INSCESTADUAL nrO_INSCESTADUAL
    * @generated
    */
    public ENTIDADE setNrO_INSCESTADUAL(java.lang.String nrO_INSCESTADUAL){
        this.nrO_INSCESTADUAL = nrO_INSCESTADUAL;
        return this;
    }
    /**
    * Obtém deS_ENTIDADE
    * return deS_ENTIDADE
    * @generated
    */
    
    public java.lang.String getDeS_ENTIDADE(){
        return this.deS_ENTIDADE;
    }

    /**
    * Define deS_ENTIDADE
    * @param deS_ENTIDADE deS_ENTIDADE
    * @generated
    */
    public ENTIDADE setDeS_ENTIDADE(java.lang.String deS_ENTIDADE){
        this.deS_ENTIDADE = deS_ENTIDADE;
        return this;
    }
    /**
    * Obtém deS_LOGRADOURO
    * return deS_LOGRADOURO
    * @generated
    */
    
    public java.lang.String getDeS_LOGRADOURO(){
        return this.deS_LOGRADOURO;
    }

    /**
    * Define deS_LOGRADOURO
    * @param deS_LOGRADOURO deS_LOGRADOURO
    * @generated
    */
    public ENTIDADE setDeS_LOGRADOURO(java.lang.String deS_LOGRADOURO){
        this.deS_LOGRADOURO = deS_LOGRADOURO;
        return this;
    }
    /**
    * Obtém nrO_ENDERECO
    * return nrO_ENDERECO
    * @generated
    */
    
    public java.lang.String getNrO_ENDERECO(){
        return this.nrO_ENDERECO;
    }

    /**
    * Define nrO_ENDERECO
    * @param nrO_ENDERECO nrO_ENDERECO
    * @generated
    */
    public ENTIDADE setNrO_ENDERECO(java.lang.String nrO_ENDERECO){
        this.nrO_ENDERECO = nrO_ENDERECO;
        return this;
    }
    /**
    * Obtém deS_COMPLEMENTO
    * return deS_COMPLEMENTO
    * @generated
    */
    
    public java.lang.String getDeS_COMPLEMENTO(){
        return this.deS_COMPLEMENTO;
    }

    /**
    * Define deS_COMPLEMENTO
    * @param deS_COMPLEMENTO deS_COMPLEMENTO
    * @generated
    */
    public ENTIDADE setDeS_COMPLEMENTO(java.lang.String deS_COMPLEMENTO){
        this.deS_COMPLEMENTO = deS_COMPLEMENTO;
        return this;
    }
    /**
    * Obtém deS_BAIRRO
    * return deS_BAIRRO
    * @generated
    */
    
    public java.lang.String getDeS_BAIRRO(){
        return this.deS_BAIRRO;
    }

    /**
    * Define deS_BAIRRO
    * @param deS_BAIRRO deS_BAIRRO
    * @generated
    */
    public ENTIDADE setDeS_BAIRRO(java.lang.String deS_BAIRRO){
        this.deS_BAIRRO = deS_BAIRRO;
        return this;
    }
    /**
    * Obtém nrO_CEP
    * return nrO_CEP
    * @generated
    */
    
    public java.lang.String getNrO_CEP(){
        return this.nrO_CEP;
    }

    /**
    * Define nrO_CEP
    * @param nrO_CEP nrO_CEP
    * @generated
    */
    public ENTIDADE setNrO_CEP(java.lang.String nrO_CEP){
        this.nrO_CEP = nrO_CEP;
        return this;
    }
    /**
    * Obtém nrO_TELEFONE
    * return nrO_TELEFONE
    * @generated
    */
    
    public java.lang.String getNrO_TELEFONE(){
        return this.nrO_TELEFONE;
    }

    /**
    * Define nrO_TELEFONE
    * @param nrO_TELEFONE nrO_TELEFONE
    * @generated
    */
    public ENTIDADE setNrO_TELEFONE(java.lang.String nrO_TELEFONE){
        this.nrO_TELEFONE = nrO_TELEFONE;
        return this;
    }
    /**
    * Obtém nrO_FAX
    * return nrO_FAX
    * @generated
    */
    
    public java.lang.String getNrO_FAX(){
        return this.nrO_FAX;
    }

    /**
    * Define nrO_FAX
    * @param nrO_FAX nrO_FAX
    * @generated
    */
    public ENTIDADE setNrO_FAX(java.lang.String nrO_FAX){
        this.nrO_FAX = nrO_FAX;
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
    public ENTIDADE setDeS_EMAIL(java.lang.String deS_EMAIL){
        this.deS_EMAIL = deS_EMAIL;
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
    public ENTIDADE setDaT_LASTREC(java.util.Date daT_LASTREC){
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
    public ENTIDADE setCoD_USUARIO(java.lang.String coD_USUARIO){
        this.coD_USUARIO = coD_USUARIO;
        return this;
    }
    /**
    * Obtém id_MUNICIPIO
    * return id_MUNICIPIO
    * @generated
    */
    
    public MUNICIPIO getId_MUNICIPIO(){
        return this.id_MUNICIPIO;
    }

    /**
    * Define id_MUNICIPIO
    * @param id_MUNICIPIO id_MUNICIPIO
    * @generated
    */
    public ENTIDADE setId_MUNICIPIO(MUNICIPIO id_MUNICIPIO){
        this.id_MUNICIPIO = id_MUNICIPIO;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
ENTIDADE object = (ENTIDADE)obj;
        if (id_ENTIDADE != null ? !id_ENTIDADE.equals(object.id_ENTIDADE) : object.id_ENTIDADE != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id_ENTIDADE == null) ? 0 : id_ENTIDADE.hashCode());
        return result;
    }

}