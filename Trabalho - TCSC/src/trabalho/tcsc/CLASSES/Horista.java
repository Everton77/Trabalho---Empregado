/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.tcsc.CLASSES;

/**
 *
 * @author al1410644
 */
public class Horista {
    
    private long empregado;
    private float precoHora;
    private float horasTrabalhadas; 

    public Horista(long empregado, float precoHora, float horasTrabalhadas) {
        this.empregado = empregado;
        this.precoHora = precoHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

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
