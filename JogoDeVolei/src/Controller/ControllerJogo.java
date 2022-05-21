package Controller;

import Model.ModelPlacar;
import Model.ModelEquipe;
import java.util.ArrayList;
import java.util.List;
import Controller.observer.JogoObserver;

/**
 *
 * @author boing
 */
public class ControllerJogo {
    
    private List<JogoObserver> JogoObservers = new ArrayList<>(); 
    
    private ModelEquipe equipeVisitor;
    private ModelEquipe equipeHome;
    private ModelPlacar placarVisitor;
    private ModelPlacar placarHome;
    private int         numSet;
    
    
    public ControllerJogo() {
    }
    
    public void pontuar(boolean casa){
        if (casa) {
           placarHome.addPonto();
        } 
        else {
           placarVisitor.addPonto();
        }
        notifyPontuou();
        verificaPontuacao();
    }
    
    public void comecarJogo(String nomeHome, String nomeVisitor){
        this.equipeHome    = new ModelEquipe(nomeHome);
        this.placarHome    = new ModelPlacar();
        this.equipeVisitor = new ModelEquipe(nomeVisitor);
        this.placarVisitor = new ModelPlacar();
       
        this.numSet        = 1;
        notifyStart();
    }
    
    public void startSet(){
        this.placarHome.resetPontos();
        this.placarVisitor.resetPontos();
        this.numSet++;
    }
    
    public String getPlacar(){
        return equipeHome.getNome() + " : " + placarHome.getPontos() + " - " +  placarVisitor.getPontos() + " : " + equipeVisitor.getNome();
    }

    public void verificaPontuacao() {
        
        ModelEquipe equipeCasa      = equipeHome;
        ModelPlacar placarCasa      = placarHome;
        ModelPlacar placarVisitante = placarVisitor;
        ModelEquipe equipeVisitante = equipeVisitor;
        
        if(verificaVencedor(placarCasa, placarVisitante)) {
            gameOver(equipeCasa, placarCasa, true);
        }
        else if(verificaVencedor(placarVisitante, placarCasa)) {
            gameOver(equipeVisitante, placarVisitante, false);
        }
    }
    
    public boolean verificaHouveVencedor() {
        return verificaVencedor(placarHome, placarVisitor) || verificaVencedor(placarVisitor, placarHome);
    }
    
    private boolean verificaVencedor(ModelPlacar placarVencedor, ModelPlacar placarPerdedor) {
        int pontuacaoMaxima = getPontuacaoMaxima();
        
        return (placarVencedor.getPontos() == pontuacaoMaxima && placarPerdedor.getPontos() < (pontuacaoMaxima - 1)) || (placarVencedor.getPontos() > pontuacaoMaxima && (placarVencedor.getPontos() - 1) > placarPerdedor.getPontos());
    }

    public ModelEquipe getEquipeVisitor() {
        return equipeVisitor;
    }

    public void setEquipeVisitor(ModelEquipe equipeVisitor) {
        this.equipeVisitor = equipeVisitor;
    }

    public ModelEquipe getEquipeHome() {
        return equipeHome;
    }

    public void setEquipeHome(ModelEquipe equipeHome) {
        this.equipeHome = equipeHome;
    }

    public ModelPlacar getPlacarVisitor() {
        return placarVisitor;
    }

    public void setPlacarVisitor(ModelPlacar placarVisitor) {
        this.placarVisitor = placarVisitor;
    }

    public ModelPlacar getPlacarHome() {
        return placarHome;
    }

    public void setPlacarHome(ModelPlacar placarHome) {
        this.placarHome = placarHome;
    }

    public int getNumSet() {
        return numSet;
    }

    public void setNumSet(int numSet) {
        this.numSet = numSet;
    }
    
    private int getPontuacaoMaxima() {
        return numSet == 5 ? 15 : 25;
    }

    private void gameOver(ModelEquipe equipeVencedora, ModelPlacar placarVencedor, boolean casa) {
        placarVencedor.addSet();
        if (this.verificaEquipeVencedora(placarVencedor)) {
            notifyEndGame(equipeVencedora.getNome(), placarVencedor.getSet(), casa);
        } 
        else {
            notifyEndSet(equipeVencedora.getNome(), placarVencedor.getSet(), casa);
            startSet();
        }
    }
    
    public boolean verificaEquipeVencedora(ModelPlacar equipe) {
        return equipe.getSet() == 3;
    }
    
    public void attach(JogoObserver obs) {
        this.JogoObservers.add(obs);
    }

    public void detach(JogoObserver obs) {
        this.JogoObservers.remove(obs);
    }

    private void notifyPontuou() {
        for (JogoObserver JogoObserver : JogoObservers) {
            JogoObserver.atualizaPontos();
        }
    }
    
    private void notifyStart() {
        for (JogoObserver JogoObserver : JogoObservers) {
            JogoObserver.start();
        }
    }

    private void notifyEndGame(String nomeWinner, int sets, boolean casa) {
        for (JogoObserver JogoObserver : JogoObservers) {
            JogoObserver.endGame(nomeWinner, sets, casa);
        }
    }

    private void notifyEndSet(String nomeWinner, int sets, boolean casa) {
        for (JogoObserver JogoObserver : JogoObservers) {
            JogoObserver.endSet(nomeWinner, sets, casa);
        }
    }
    
}
