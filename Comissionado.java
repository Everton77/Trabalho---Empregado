/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.tcsc.CLASSES;

/**
 *
 * @author al1410644
 */
public class Comissionado extends Empregado{
    
    private long empregado;
    private float totalVenda;
    private float taxaComissao;

    public long getEmpregado() {
        return empregado;
    }

    public float getTotalVenda() {
        return totalVenda;
    }

    public float getTaxaComissao() {
        return taxaComissao;
    }

    public void setEmpregado(long empregado) {
        this.empregado = empregado;
    }

    public void setTotalVenda(float totalVenda) {
        this.totalVenda = totalVenda;
    }

    public void setTaxaComissao(float taxaComissao) {
        this.taxaComissao = taxaComissao;
    }    
}
