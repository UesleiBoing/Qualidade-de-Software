package Testes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Controller.ControllerJogo;
import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 *
 * @author boing
 */
public class TesteJogo{
    @Test
    public void TesteCasaGanhouSimples() {
        ControllerJogo Jogo = new ControllerJogo();
        Jogo.comecarJogo("Casa", "Visitantes");
        
        for(int set = 1; set <= 3; set ++) {
            (Jogo.getPlacarHome()).setPontos(25);
            Jogo.verificaPontuacao();
        }
        assertEquals(true, Jogo.verificaEquipeVencedora(Jogo.getPlacarHome()));
    }
    
    @Test
    public void TesteVisitantesGanhouSimples() {
        ControllerJogo Jogo = new ControllerJogo();
        Jogo.comecarJogo("Casa", "Visitantes");
        
        for(int set = 1; set <= 3; set ++) {
            (Jogo.getPlacarVisitor()).setPontos(25);
            Jogo.verificaPontuacao();
        }
        assertEquals(true, Jogo.verificaEquipeVencedora(Jogo.getPlacarVisitor()));
    }
    
    @Test
    public void TesteCasaGanhouComplexo() {
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
        
        assertEquals(true, Jogo.verificaEquipeVencedora(Jogo.getPlacarHome()));
    }
    
    @Test
    public void TesteVisitanteGanhouComplexo() {
        ControllerJogo Jogo = new ControllerJogo();
        Jogo.comecarJogo("Casa", "Visitantes");
        
        /* 1 */
        (Jogo.getPlacarVisitor()).setPontos(26);
        (Jogo.getPlacarHome()).setPontos(24);
        Jogo.verificaPontuacao();
        
        /* 2 */
        (Jogo.getPlacarVisitor()).setPontos(25);
        (Jogo.getPlacarHome()).setPontos(23);
        Jogo.verificaPontuacao();
        
        /* 3 */
        (Jogo.getPlacarVisitor()).setPontos(10);
        (Jogo.getPlacarHome()).setPontos(25);
        Jogo.verificaPontuacao();
        
        /* 4 */
        (Jogo.getPlacarVisitor()).setPontos(27);
        (Jogo.getPlacarHome()).setPontos(25);
        Jogo.verificaPontuacao();
        
        /* 5 */
        (Jogo.getPlacarVisitor()).setPontos(15);
        (Jogo.getPlacarHome()).setPontos(17);
        Jogo.verificaPontuacao();
        
        assertEquals(true, Jogo.verificaEquipeVencedora(Jogo.getPlacarVisitor()));
    }
}
