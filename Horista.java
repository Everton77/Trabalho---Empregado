/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.tcsc.CLASSES;

/**
 *
 * @author al1410644
 */
public class Horista extends Empregado{
    
    private long empregado;
    private float precoHora;
    private float horasTrabalhadas; 

    public long getEmpregado() {
        return empregado;
    }

    public float getPrecoHora() {
        return precoHora;
    }

    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setEmpregado(long empregado) {
        this.empregado = empregado;
    }

    public void setPrecoHora(float precoHora) {
        this.precoHora = precoHora;
    }

    public void setHorasTrabalhadas(float horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    
}
