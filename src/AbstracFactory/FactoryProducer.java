/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstracFactory;

import Demacia.FactoryDemacia;
import Noxus.FactoryNoxus;
import Hyperloop.FactoryHyperloop;
import Odiseus.FactoryOdiseus;
import Tardis.FactoryTardis;
import Voodolands.FactoryVoodolands;

/**
 *
 * @author Jorge
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(Type raza, TypeVehiculo vehi){
        switch (raza){
            case DEMACIANOS: 
                return  new FactoryDemacia();
            case NEXEANOS:
                return  new FactoryNoxus();
            case VOODOLANDERS:
                return  new FactoryVoodolands();
            default: 
               switch (vehi){
                    case HYPERLOOP:
                       return new FactoryHyperloop();
                    case ODISEUS:
                       return new FactoryOdiseus();
                    case TARDIS:
                       return new FactoryTardis();
                    default:
                        return null;
                }
        }
    }
    
    
    
}

