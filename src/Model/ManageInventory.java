/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author DHAFINDRA
 */
public interface ManageInventory {
    public void addItem(Item item);
    public void getItemDetails(Item item);
    public void updateItem();
    public void removeItem();
}
