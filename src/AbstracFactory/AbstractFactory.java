/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstracFactory;

import Demacia.Demacia;
import Noxus.Noxus;
import Voodolands.Voodolands;

/**
 *
 * @author Jorge
 */
public interface AbstractFactory {
    Demacia getDemacia(String type);
    Noxus getNoxus(String type);
    Voodolands getVoodolands(String type);
    
}
