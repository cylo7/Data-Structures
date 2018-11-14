package ip5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.StringTokenizer;

/**
 *
 * @author user
 */
public class SalesPersonReader {

    public static void main(String args[]) throws IOException {

        SalesPersonReader reader = new SalesPersonReader();
        Collection<SalesPerson> people = reader.readPeople("salesperson.txt");
        System.out.println(people);

    }

    public Collection<SalesPerson> readPeople(String filename) throws IOException {
        File f = new File(filename);
        FileReader reader = new FileReader(f);
        BufferedReader breader = new BufferedReader(reader);

        Collection<SalesPerson> people = new ArrayList<>();
        Iterator<SalesPerson> iterator = people.iterator();

        String line = breader.readLine();
        while (line != null) {
            SalesPerson p = null;
            try {
                p = parseLine(line);
            } catch (Exception e) {
            }

            if (p == null) {
                System.out.println(" Error: Invalid String " + line);
            } else {
                people.add(p);
            }
            line = breader.readLine();
            
        }
        return people;
    }

    private SalesPerson parseLine(String line) {

        int salesId;
        String firstName;
        String lastName;
        double supplies;
        double books;
        double paper;
        String district;
        String contact;
        double totalSales;

        StringTokenizer st = new StringTokenizer(line, ",");

        salesId = Integer.parseInt(st.nextToken().trim());
        firstName = st.nextToken().trim();
        lastName = st.nextToken().trim();
        supplies = Double.parseDouble(st.nextToken().trim());
        books = Double.parseDouble(st.nextToken().trim());
        paper = Double.parseDouble(st.nextToken().trim());
        district = st.nextToken().trim();
        contact = st.nextToken();
        totalSales = Double.parseDouble(st.nextToken().trim());

        if (salesId < 0) {
            return null;
        }

        if (firstName.length() == 0) {
            return null;
        }
        if (lastName.length() == 0) {
            return null;
        }

        if (supplies < 1) {
            return null;
        }

        if (books < 1) {
            return null;
        }

        if (paper < 1) {
            return null;
        }

        if (district.length() == 0) {
            return null;
        }

        if (contact.length() == 0) {
            return null;
        }

        if (totalSales < 1) {
            return null;
        }

        SalesPerson p = new SalesPerson();
        p.setSalesId(salesId);
        p.setFirstName(firstName);
        p.setLastName(lastName);
        p.setSupplies(supplies);
        p.setBooks(books);
        p.setPaper(paper);
        p.setDistrict(district);
        p.setContact(contact);
        p.setTotalSales(totalSales);

        return p;
    }
}
