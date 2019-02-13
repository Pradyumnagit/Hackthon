/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcs.services;

import com.tcs.beans.beans;

/**
 *
 * @author 1528178
 */
public class dao {

    public static int calculate(beans bean) {
        String first = bean.getFirst();
        String second = bean.getSecond();
        String operation= bean.getOperation();
        int result = 0;
        switch (operation) {
            case "Addition":
                result = Integer.parseInt(first)+Integer.parseInt(second);
                break;
            case "Subtraction":
                result = Integer.parseInt(first)-Integer.parseInt(second);
                break;
            case "Multiplication":
                result = Integer.parseInt(first)*Integer.parseInt(second);
                break;
            case "Division":
                result = Integer.parseInt(first)/Integer.parseInt(second);
                break;
        }
        return result;
    }

}
