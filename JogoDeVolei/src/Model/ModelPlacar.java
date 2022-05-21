/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author boing
 */
public class ModelPlacar {
    
    private int set;
    
    private int pontos;

    public ModelPlacar() {
        this.pontos = 0;
        this.set    = 0;
    }

    public int getSet() {
        return set;
    }

    public void setSet(int set) {
        this.set = set;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    
    public void addPonto() {
        this.pontos++;
    }
    
    public void addSet() {
        this.set++;
    }
    
    public void resetPontos() {
        this.pontos = 0;
    }
    
}
