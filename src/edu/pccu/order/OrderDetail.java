/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.pccu.order;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class OrderDetail {
    public int id;
    public String ItemName;
    public int num;
    public OrderDetail(int id, String IN, int num)
    {
        this.id = id;
        this.ItemName = IN;
        this.num = num;
    }
}
