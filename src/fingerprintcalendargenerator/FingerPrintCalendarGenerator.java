/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fingerprintcalendargenerator;

/**
 *
 * @author jaspertomas
 */
public class FingerPrintCalendarGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Holidays.getInstance().generate("2014");
        for(Holiday holiday:Holidays.getInstance().getItems())
        {
            System.out.println(holiday.getType()+" - "+holiday.getName()+" - "+Holidays.dateFormat.format(holiday.getDate()));
        }
    }
}
