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
    private static int numberOfInvoices = 0;
    
    private String companyName;
    private double amountDue;
    private String chargeDate;
    private int invoiceNumber;
    
    public Invoice() {
        invoiceNumber = ++Invoice.numberOfInvoices;
    }
    
    public Invoice(String name, int amount, String date) {
       invoiceNumber = ++Invoice.numberOfInvoices;
       companyName = name;
       amountDue = amount;
       chargeDate = date;
    }
    
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
    
    public void setCompanyName(String name) {
        companyName = name;
    }
    
    public void setAmountDue(double amount) {
        amountDue = amount;
    }
    
    public void setChargeDate(String date) {
        chargeDate = date;
    }
    
    public static int getNumberOfInvoices() {
        return Invoice.numberOfInvoices;
    }
    
}
