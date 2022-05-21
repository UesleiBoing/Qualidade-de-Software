/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.observer;

/**
 *
 * @author boing
 */
public interface JogoObserver {

    public void atualizaPontos();

    public void start();

    public void endSet(String nomeWinner, int sets, boolean casa);

    public void endGame(String nomeWinner, int sets, boolean casa);
    
}
