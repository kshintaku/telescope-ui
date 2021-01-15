/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author kshintaku
 * Work on creating MVC
 */

// This should probably be an interface instead of a class
public class Telescope {
    Axis xaxis = new Axis();
    Axis yaxis = new Axis();
    
    public void updateXAxis(Integer xRate) {
        try {
            xaxis.setRate(xRate);
            
        } catch (Exception e) {
            System.out.println("Exception happened: " + e);
        }
        
        
    }
    
    public void goToXY(int x, int y) {
        xaxis.goto(x);
        yaxis.goto(y);
    }
}

// Breaking objects down more to reduce repetitive code
public class Axis {
     public int getPos() {
        return currentPos;
    }
    
    // Setter for rate
    public void setRate(Integer rate) {
        if(rate > 10) {
            throw exception("Rate too high");
        }
        
    }
    
    public void goto(int destination) {
        setRate(MAX (10));
        while currentPos+MAX < destination
                currentPos += MAX
                delay(1s)
        int remainder = destination - currentPos;
        setRate(remainder);
        delay(1s)
        setRate(0)
        
}
    
    
}