/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.tcsc.CLASSES;

/**
 *
 * @author al1410644
 */
public class Empregado {
    
    private long codigo;
    private String nome;
    private String sobrenome;
    private String cpf;

    public Empregado(long codigo, String nome, String sobrenome) {
        this.codigo = codigo;
        this.nome = nome;
        this.sobrenome = sobrenome;
    } 

    public long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
}
