/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultMethods;

/**
 *
 * @author globalk
 */
public class TestDefault implements PersonaA, PersonaB{

    @Override
    public void hablar() {
        PersonaA.super.hablar(); //To change body of generated methods, choose Tools | Templates.
    }

      
    public static void main(String[] args) {
        TestDefault td = new TestDefault();
        td.hablar();
    }
}
