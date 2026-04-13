/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package patrones.estructurales.facade;

/**
 *
 * @author hugof
 */
public class VegNonBothRestaurant implements Hotel {
    public Menus getMenus() {
        Both b = new Both();
        return b;
    }
}
