/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeMachine.Forms;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author shahar
 */
public class TimeTrackerListener implements DocumentListener
{
    public TimeTracker t; //this is so wrong
    @Override
    public void changedUpdate(DocumentEvent e) {
      t.manualUpdate();
    }
    @Override
    public void removeUpdate(DocumentEvent e) {
      t.manualUpdate();
    }
    @Override
    public void insertUpdate(DocumentEvent e) {
      t.manualUpdate();
    };
}
