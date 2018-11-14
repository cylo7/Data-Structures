package ip5;

/**
 *
 * @author user
 */
public class SalesPerson {

    private int salesId;
    private String firstName;
    private String lastName;
    private double supplies;
    private double books;
    private double paper;
    private String district;
    private String contact;
    private double totalSales;

    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSupplies() {
        return supplies;
    }

    public void setSupplies(double supplies) {
        this.supplies = supplies;
    }

    public double getBooks() {
        return books;
    }

    public void setBooks(double books) {
        this.books = books;
    }

    public double getPaper() {
        return paper;
    }

    public void setPaper(double paper) {
        this.paper = paper;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    
    public void calculateTotals() {
        totalSales = (supplies + books + paper);
    }

    @Override
    public String toString() {
        return "Top Sellers: " + "\n" +
                salesId +" "+ firstName + " " + lastName 
                + "\nSupplies: " + supplies 
                + "\nBooks: " + books 
                + "\nPaper: " + paper 
                + "\nDistrict: "+ district 
                + "\nPreferred Method of Contact:" + contact 
                + "\nTotal Sales: " + totalSales + "\n";
        
        
                
    }

  

}
