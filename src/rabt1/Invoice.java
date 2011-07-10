/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rabt1;

/**
 *
 * @author jjones
 */
public class Invoice {
    // Class member for storing number of invoices created
    private static int numberOfInvoices = 0;
    
    // Inst variables
    private String companyName;
    private double amountDue;
    private String chargeDate;
    private int invoiceNumber;
    
    // Constructor (basic)
    public Invoice() {
        // (pre)increment numberOfInvoices
        invoiceNumber = ++Invoice.numberOfInvoices;
    }
    
    // Constructor (Init all vars)
    public Invoice(String name, int amount, String date) {
       // (pre)increment numberOfInvoices
       invoiceNumber = ++Invoice.numberOfInvoices;
       companyName = name;
       amountDue = amount;
       chargeDate = date;
    }
    
    // Getters for inst vars
    public String getComapanyName() {
        return companyName;
    }
    
    public double getAmountDue() {
        return amountDue;
    }
    
    public String getChargeDate() {
        return chargeDate;
    }
    
    public int getInvoiceNumber() {
        return invoiceNumber;
    }
    
    // Setters for inst vars
    public void setCompanyName(String name) {
        companyName = name;
    }
    
    public void setAmountDue(double amount) {
        amountDue = amount;
    }
    
    public void setChargeDate(String date) {
        chargeDate = date;
    }
    
    
    // Class method to get the total number of invoices created
    public static int getNumberOfInvoices() {
        return Invoice.numberOfInvoices;
    }
    
}
