package exceptionpack;

class CountryNotValidException extends Exception 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
    
    public CountryNotValidException(String message) 
    {
        this.message = message;
    }
    
    @Override
    public String toString() 
    {
        return message;
    }    
}
class EmployeeNameInvalidException extends Exception 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
    
    public EmployeeNameInvalidException(String message) 
    {
        this.message = message;
    }
    
    @Override
    public String toString() 
    {
        return message;
    }
}


@SuppressWarnings("serial")
class TaxNotEligibleException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
    
    public TaxNotEligibleException(String message) {
        this.message = message;
    }
    
    @Override
    public String toString() {
        return message;
    }
}

class TaxCalculator 
{
    public static double calculateTax(String empname, boolean isIndian, double empSal) 
            throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException 
    {
            if (!isIndian) 
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
        
        if (empname == null || empname.isEmpty()) 
            throw new EmployeeNameInvalidException("The employee name cannot be empty");
        
        double taxAmount;
        if (empSal > 100000)
            taxAmount = empSal * 8 / 100;
        else if (empSal >= 50000 && empSal <= 100000)
            taxAmount = empSal * 6 / 100;
        else if (empSal >= 30000 && empSal < 50000)
            taxAmount = empSal * 5 / 100;
        else if (empSal >= 10000 && empSal < 30000)
            taxAmount = empSal * 4 / 100;
        else
            throw new TaxNotEligibleException("The employee does not need to pay tax");
        
        return taxAmount;
    }
}

public class CalciSimulator {
    public static void main(String[] args) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException 
    {
        try {
            double tax = TaxCalculator.calculateTax("Vijay", true, 20000);
            System.out.println("Tax Amount will be: " + tax);
        } catch (CountryNotValidException e) {
            System.out.println("Exception caught: " + e);
            e.printStackTrace();
        } catch (EmployeeNameInvalidException e) {
            System.out.println("Exception caught: " + e);
            e.printStackTrace();
        } catch (TaxNotEligibleException e) {
            System.out.println("Exception caught: " + e);
            e.printStackTrace();
        }
    }
}