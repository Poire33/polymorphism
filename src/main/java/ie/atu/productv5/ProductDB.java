package ie.atu.productv5;


// import ie.atu.productv2.Software;

public class ProductDB {
    public static Product getProduct(String productCode) {
        Book myBook = null;
        TV myTV = null;
        Music myMusic = null;
        Product myProduct = null;
        Software mySoftware = null;
        if (productCode.equalsIgnoreCase("java")) {
            myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            myProduct = myBook;
        } else if (productCode.equalsIgnoreCase("Odysseus")) {
            myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Odysseus by Luc Arbogast");
            myMusic.setPrice(10.20);
            myMusic.setArtist("Luc Arbogast");
            myMusic.setLabel("Universal");
            myProduct = myMusic;
        } else if (productCode.equalsIgnoreCase("Samsung_40")) {
            myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("Samsung 40 inch 1080p");
            myTV.setPrice(575);
            myTV.setScreen_size("40 inches");
            myTV.setManufacturer("Samsung");
            myProduct = myTV;
        } else if (productCode.equalsIgnoreCase("studios")) {
            mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            myProduct = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            myProduct = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            myProduct = mySoftware;
        }
        return myProduct;
    }
}
