/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstracFactory;

import Demacia.FactoryDemacia;
import Noxus.FactoryNoxus;
import Vehiculo.FactoryVehiculo;
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
                return (AbstractFactory) new FactoryNoxus();
            case VOODOLANDERS:
                return (AbstractFactory) new FactoryVoodolands();
            default: 
               switch (vehi){
                    case VEHICULO1:

                    default:
                        return null;
                }
        }
    }
    
    
    
}

