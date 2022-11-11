package br.com.fiap.Globalsolution.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_MNT_ENDERECO")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_endereco")
    private Long id;

    @Column(name = "nm_rua")
    private String nomeRua;

    @Column(name = "ds_complemento")
    private String desComplemento;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Bairro bairro;

    public Endereco() {
    }

    public Endereco(Long id, String nomeRua, String desComplemento, Bairro bairro) {
        this.id = id;
        this.nomeRua = nomeRua;
        this.desComplemento = desComplemento;
        this.bairro = bairro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public String getDesComplemento() {
        return desComplemento;
    }

    public void setDesComplemento(String desComplemento) {
        this.desComplemento = desComplemento;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return "Endereco [id=" + id + ", nomeRua=" + nomeRua + ", desComplemento=" + desComplemento + ", bairro="
                + bairro + "]";
    }
}
