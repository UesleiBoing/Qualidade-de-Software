/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import Controller.ControllerJogo;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 *
 * @author boing
 */
public class TesteSet {
    
    @Test
    public void testeComVencedorSimples() {
        ControllerJogo Jogo = new ControllerJogo();
        Jogo.comecarJogo("Casa", "Visitantes");
        
        (Jogo.getPlacarVisitor()).setPontos(12);
        (Jogo.getPlacarHome()).setPontos(25);
        
        assertEquals(true, Jogo.verificaHouveVencedor());
    }
    
    @Test
    public void testeComVencedorCompleto() {
        ControllerJogo Jogo = new ControllerJogo();
        Jogo.comecarJogo("Casa", "Visitantes");
        
        (Jogo.getPlacarVisitor()).setPontos(27);
        (Jogo.getPlacarHome()).setPontos(25);
        
        assertEquals(true, Jogo.verificaHouveVencedor());
    }
    
    @Test
    public void testeComVencedorCincoSets() {
        ControllerJogo Jogo = new ControllerJogo();
        Jogo.comecarJogo("Casa", "Visitantes");
        
        /* 1 */
        (Jogo.getPlacarVisitor()).setPontos(25);
        (Jogo.getPlacarHome()).setPontos(27);
        Jogo.verificaPontuacao();
        
        /* 2 */
        (Jogo.getPlacarVisitor()).setPontos(25);
        (Jogo.getPlacarHome()).setPontos(20);
        Jogo.verificaPontuacao();
        
        /* 3 */
        (Jogo.getPlacarVisitor()).setPontos(25);
        (Jogo.getPlacarHome()).setPontos(12);
        Jogo.verificaPontuacao();
        
        /* 4 */
        (Jogo.getPlacarVisitor()).setPontos(24);
        (Jogo.getPlacarHome()).setPontos(26);
        Jogo.verificaPontuacao();
        
        /* 5 */
        (Jogo.getPlacarVisitor()).setPontos(14);
        (Jogo.getPlacarHome()).setPontos(16);
        Jogo.verificaPontuacao();
        
        assertEquals(true, Jogo.verificaHouveVencedor());
    }
    
    @Test
    public void testeSemVencedorSimples() {
        ControllerJogo Jogo = new ControllerJogo();
        Jogo.comecarJogo("Casa", "Visitantes");
        
        (Jogo.getPlacarVisitor()).setPontos(12);
        (Jogo.getPlacarHome()).setPontos(15);
        
        assertEquals(false, Jogo.verificaHouveVencedor());
    }
    
    @Test
    public void testeSemVencedorCompleto() {
        ControllerJogo Jogo = new ControllerJogo();
        Jogo.comecarJogo("Casa", "Visitantes");
        
        (Jogo.getPlacarVisitor()).setPontos(24);
        (Jogo.getPlacarHome()).setPontos(25);
        
        assertEquals(false, Jogo.verificaHouveVencedor());
    }
    
    @Test
    public void testeSemVencedorCincoSets() {
        ControllerJogo Jogo = new ControllerJogo();
        Jogo.comecarJogo("Casa", "Visitantes");
        
        /* 1 */
        (Jogo.getPlacarVisitor()).setPontos(25);
        (Jogo.getPlacarHome()).setPontos(27);
        Jogo.verificaPontuacao();
        
        /* 2 */
        (Jogo.getPlacarVisitor()).setPontos(25);
        (Jogo.getPlacarHome()).setPontos(20);
        Jogo.verificaPontuacao();
        
        /* 3 */
        (Jogo.getPlacarVisitor()).setPontos(25);
        (Jogo.getPlacarHome()).setPontos(12);
        Jogo.verificaPontuacao();
        
        /* 4 */
        (Jogo.getPlacarVisitor()).setPontos(24);
        (Jogo.getPlacarHome()).setPontos(26);
        Jogo.verificaPontuacao();
        
        /* 5 */
        (Jogo.getPlacarVisitor()).setPontos(14);
        (Jogo.getPlacarHome()).setPontos(15);
        Jogo.verificaPontuacao();
        
        assertEquals(false, Jogo.verificaHouveVencedor());
    }
}
