package Inputs;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class KeyboardInputs implements KeyListener{

    

    public KeyboardInputs(){
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //None
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_A:
                    
                break;
            case KeyEvent.VK_D:
                    
                break;
            case KeyEvent.VK_W:
                    
                break;
            case KeyEvent.VK_S:
                    
                break;
            case KeyEvent.VK_R:
                    
            default:
                break;
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //None
    }
    
}
