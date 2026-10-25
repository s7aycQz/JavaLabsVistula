package Lab2;

import java.math.BigDecimal;

public class TaxCalculation {
    public static void main(String[] args) {
        double productCostGay = 9.99;
        double vatRateGay = 0.05;

        double unitVatGay = productCostGay * vatRateGay;
        double totalNetGay = 0;
        double totalVatGay = 0;
        double totalGrossGay = 0;

        for (int i = 0; i < 10000; i++) {
            totalNetGay += productCostGay;
            totalVatGay += unitVatGay;
            totalGrossGay += (productCostGay + unitVatGay);
        }

        System.out.println("--- Using double (Raw Values) ---");
        System.out.println("Single unit VAT: " + unitVatGay);
        System.out.println("Total Net Sales (10,000 units): " + totalNetGay);
        System.out.println("Total VAT Amount: " + totalVatGay);
        System.out.println("Total Gross Value: " + totalGrossGay);

        // BigDecimal comparison for exact financial precision
        BigDecimal costBD = new BigDecimal("9.99");
        BigDecimal vatRateBD = new BigDecimal("0.05");
        BigDecimal unitVatBD = costBD.multiply(vatRateBD);
        BigDecimal quantityBD = new BigDecimal("10000");

        System.out.println("\n--- Using BigDecimal (Exact Precision) ---");
        System.out.println("Single unit VAT: " + unitVatBD);
        System.out.println("Total Net Sales: " + costBD.multiply(quantityBD));
        System.out.println("Total VAT Amount: " + unitVatBD.multiply(quantityBD));
        System.out.println("Total Gross Value: " + costBD.add(unitVatBD).multiply(quantityBD));
    }
}
