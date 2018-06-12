/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demacia;

import AbstracFactory.AbstractFactory;
import HyperloopV.Hyperloop;
import Noxus.Noxus;
import OdiseusV.Odiseus;
import TardisV.Tardis;
import Voodolands.Voodolands;

/**
 *
 * @author Jorge
 */
public class FactoryDemacia implements AbstractFactory{

    @Override
    public Demacia getDemacia(String type) {
        switch (type){
            case "Tropas":
                return new Tropas();
            case "":
        }
        return null;
    }

    @Override
    public Noxus getNoxus(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Voodolands getVoodolands(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Hyperloop GetHyperloop(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Odiseus GetOdiseus(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tardis GetTardis(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
