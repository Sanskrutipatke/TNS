import java.util.Scanner;

// Framework: Abstract classes
abstract class ShopAcc {
    private final int accNo;
    private String accNm;
    private final float charges;

    public ShopAcc(int accNo, String accNm, float charges) {
        this.accNo = accNo;
        this.accNm = accNm;
        this.charges = charges;
    }

    public int getAccNo() {
        return accNo;
    }

    public String getAccNm() {
        return accNm;
    }

    public float getCharges() {
        return charges;
    }

    public abstract void bookProduct(float amount);

    @Override
    public String toString() {
        return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
    }
}

abstract class PrimeAcc extends ShopAcc {
    private final boolean isPrime;

    public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges);
        this.isPrime = isPrime;
    }

    public boolean isPrime() {
        return isPrime;
    }

    @Override
    public void bookProduct(float amount) {
        float totalAmount = amount + getCharges();
        System.out.println("Booking product for Prime Account. Total Amount: $" + totalAmount);
    }
}

abstract class NormalAcc extends ShopAcc {
    private final float lazyDeliveryCharges;

    public NormalAcc(int accNo, String accNm, float charges, float lazyDeliveryCharges) {
        super(accNo, accNm, charges);
        this.lazyDeliveryCharges = lazyDeliveryCharges;
    }

    @Override
    public void bookProduct(float amount) {
        float totalAmount = amount + getCharges() + getDeliveryCharges();
        System.out.println("Booking product for Normal Account. Total Amount: $" + totalAmount);
    }

    protected float getDeliveryCharges() {
        return lazyDeliveryCharges;
    }
}

// Framework: Factory class
abstract class ShopFactory {
    public abstract PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime);
    public abstract NormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float lazyDeliveryCharges);
}

// Framework: Concrete Factory class
class GSShopFactory extends ShopFactory {
    @Override
    public PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        return new GSPrimeAcc(accNo, accNm, charges, isPrime);
    }

    @Override
    public NormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float lazyDeliveryCharges) {
        return new GSNormalAcc(accNo, accNm, charges, lazyDeliveryCharges);
    }
}

// Application part for GoShopping
class GSPrimeAcc extends PrimeAcc {
    public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges, isPrime);
    }
}

class GSNormalAcc extends NormalAcc {
    public GSNormalAcc(int accNo, String accNm, float charges, float lazyDeliveryCharges) {
        super(accNo, accNm, charges, lazyDeliveryCharges);
    }
}

// Entry point for application part
public class Go_ShoppingApp {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShopFactory shopFactory = new GSShopFactory();

        System.out.println("Welcome to the GoShopping App!");
        System.out.println("Select an account type:");
        System.out.println("1. Prime Account");
        System.out.println("2. Normal Account");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        ShopAcc userAccount;
        if (choice == 1) {
            userAccount = createPrimeAccount(scanner, shopFactory);
        } else if (choice == 2) {
            userAccount = createNormalAccount(scanner, shopFactory);
        } else {
            System.out.println("Invalid choice. Exiting the application.");
            return;
        }

        // Invoke bookProduct() method.
        System.out.print("\nEnter product cost: $");
        float itemCost = scanner.nextFloat();
        userAccount.bookProduct(itemCost);

        // Invoke toString() method.
        System.out.println("\nAccount Details: " + userAccount);

        scanner.close();
    }

    private static PrimeAcc createPrimeAccount(Scanner scanner, ShopFactory shopFactory) {
        System.out.println("\nEnter Prime Account details:");
        System.out.print("Account Number: ");
        int primeAccNo = scanner.nextInt();
        System.out.print("Account Name: ");
        String primeAccNm = scanner.next();
        System.out.print("Charges: ");
        float primeCharges = scanner.nextFloat();
        System.out.print("Is Prime? (true/false): ");
        boolean isPrime = scanner.nextBoolean();

        return shopFactory.getNewPrimeAcc(primeAccNo, primeAccNm, primeCharges, isPrime);
    }

    private static NormalAcc createNormalAccount(Scanner scanner, ShopFactory shopFactory) {
        System.out.println("\nEnter Normal Account details:");
        System.out.print("Account Number: ");
        int normalAccNo = scanner.nextInt();
        System.out.print("Account Name: ");
        String normalAccNm = scanner.next();
        System.out.print("Charges: ");
        float normalCharges = scanner.nextFloat();
        System.out.print("Lazy Delivery Charges: ");
        float lazyDeliveryCharges = scanner.nextFloat();

        return shopFactory.getNewNormalAcc(normalAccNo, normalAccNm, normalCharges, lazyDeliveryCharges);
    }
}
