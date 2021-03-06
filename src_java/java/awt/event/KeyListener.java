// KeyListener.java -R0996
//
// 2000-09-08 MK Added new Licensetext
//	
//#include ..\..\..\license.txt
//
// kAWT version 0.95
//
// Copyright (C) 1999-2000 by Michael Kroll & Stefan Haustein GbR, Essen
//
// Contact: kawt@kawt.de
// General Information about kAWT is available at: http://www.kawt.de
//
// Using kAWT for private and educational and in GPLed open source
// projects is free. For other purposes, a commercial license must be
// obtained. There is absolutely no warranty for non-commercial use.
//
//
// 1. BECAUSE THE PROGRAM IS LICENSED FREE OF CHARGE, THERE IS NO
//    WARRANTY FOR THE PROGRAM, TO THE EXTENT PERMITTED BY APPLICABLE
//    LAW.  EXCEPT WHEN OTHERWISE STATED IN WRITING THE COPYRIGHT
//    HOLDERS AND/OR OTHER PARTIES PROVIDE THE PROGRAM "AS IS" WITHOUT
//    WARRANTY OF ANY KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING, BUT
//    NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
//    FITNESS FOR A PARTICULAR PURPOSE.  THE ENTIRE RISK AS TO THE
//    QUALITY AND PERFORMANCE OF THE PROGRAM IS WITH YOU.  SHOULD THE
//    PROGRAM PROVE DEFECTIVE, YOU ASSUME THE COST OF ALL NECESSARY
//    SERVICING, REPAIR OR CORRECTION.
//   
// 2. IN NO EVENT UNLESS REQUIRED BY APPLICABLE LAW OR AGREED TO IN
//    WRITING WILL ANY COPYRIGHT HOLDER, OR ANY OTHER PARTY WHO MAY
//    MODIFY AND/OR REDISTRIBUTE THE PROGRAM AS PERMITTED ABOVE, BE
//    LIABLE TO YOU FOR DAMAGES, INCLUDING ANY GENERAL, SPECIAL,
//    INCIDENTAL OR CONSEQUENTIAL DAMAGES ARISING OUT OF THE USE OR
//    INABILITY TO USE THE PROGRAM (INCLUDING BUT NOT LIMITED TO LOSS OF
//    DATA OR DATA BEING RENDERED INACCURATE OR LOSSES SUSTAINED BY YOU
//    OR THIRD PARTIES OR A FAILURE OF THE PROGRAM TO OPERATE WITH ANY
//    OTHER PROGRAMS), EVEN IF SUCH HOLDER OR OTHER PARTY HAS BEEN
//    ADVISED OF THE POSSIBILITY OF SUCH DAMAGES.
//   
//    END OF TERMS AND CONDITIONS
// 
//#endinclude

 
package java.awt.event;

import java.util.EventListener;

  /**
   * The listener interface for receiving keyboard events (keystrokes). 
   * The class that is interested in processing a keyboard event either 
   * implements this interface (and all the methods it contains) or extends
   * the abstract KeyAdapter class (overriding only the methods of interest). 
   *
   * The listener object created from that class is then registered with a 
   * component using the component's addKeyListener method. A keyboard event 
   * is generated when a key is pressed, released, or typed (pressedn and released). 
   * The relevant method in the listener object is then invoked, and the KeyEvent is
   * passed to it. 
   *
   * @author  Stefan Haustein / Michael Kroll
   */

public interface KeyListener extends EventListener {
    
    /**
     * Invoked when a key has been pressed.
     */
    
    public void keyPressed (KeyEvent ke);    
    
    /**
     * Invoked when a key has been released.
     */
    
    public void keyReleased (KeyEvent ke);
    
    /**
     * Invoked when a key has been typed.
     */
    
    public void keyTyped (KeyEvent ke);
}

/*
 * $Log: KeyListener.java,v $
 * Revision 1.2  2001/08/28 23:29:11  mkroll
 * Added EventListener for J2SE compatibility.
 * Changed the Listeners accordingly.
 *
 */
