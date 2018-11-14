package ip5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author user
 */
public class SalesPersonStorage {

    public void writePerson(SalesPerson p) throws IOException {
        File testWriter = new File("salesperson.txt");
        try (BufferedWriter out = new BufferedWriter(new FileWriter(testWriter, true))) {

            out.write("" + p.getSalesId());
            out.write(", ");
            out.write(p.getFirstName());
            out.write(", ");
            out.write(p.getLastName());
            out.write(", ");
            out.write("" + p.getSupplies());
            out.write(", ");
            out.write("" + p.getBooks());
            out.write(", ");
            out.write("" + p.getPaper());
            out.write(", ");
            out.write("" + p.getDistrict());
            out.write(", ");
            out.write("" + p.getContact());
            out.write(", ");
            out.write("" + p.getTotalSales());
            out.newLine();
        }
    }
}
