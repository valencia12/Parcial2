/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HyperloopV;

import AbstracFactory.AbstractFactory;
import Demacia.Demacia;
import Noxus.Noxus;
import Voodolands.Voodolands;

/**
 *
 * @author Jorge
 */
public class FactoryHyperloop implements AbstractFactory {

    @Override
    public Demacia getDemacia(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Noxus getNoxus(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Voodolands getVoodolands(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
