/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rabt1;

/**
 *
 * @author jjones
 */
public class RABT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("Amazing Software", 5000, "January 18, 2009");
        Invoice invoice2 = new Invoice("Best Programs", 4000, "Feburary 18, 1009");
        Invoice invoice3 = new Invoice("Champion Code", 3000, "March 18, 2009");
        
        System.out.println("Invoice No. " + invoice1.getInvoiceNumber());
        System.out.println(invoice1.getComapanyName());
        System.out.format("$%.2f\n", invoice1.getAmountDue());
        System.out.println(invoice1.getChargeDate());
        
        System.out.println("\nInvoice No. " + invoice2.getInvoiceNumber());        
        System.out.println(invoice2.getComapanyName());
        System.out.format("$%.2f\n", invoice2.getAmountDue());
        System.out.println(invoice2.getChargeDate());

        System.out.println("\nInvoice No. " + invoice3.getInvoiceNumber());        
        System.out.println(invoice3.getComapanyName());
        System.out.format("$%.2f\n", invoice3.getAmountDue());
        System.out.println(invoice3.getChargeDate());
        
        System.out.println("\nInvoice count: " + Invoice.getNumberOfInvoices());

    }
}
