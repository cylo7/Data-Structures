package ip5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author user
 */
public class StarSalesPerson {

    public SalesPerson star(Collection<SalesPerson> people) throws IOException {
        SalesPerson star = null;
        for (SalesPerson p : people) {
            while (star == null) {
                star = p;
            }
            if (p.getTotalSales() >= 8000) {
                File starWriter = new File("stars.txt");
                try (BufferedWriter out = new BufferedWriter(new FileWriter(starWriter, true))) {
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
        return star;
    }
     
}
