package entities;

public final class Gift {
    private String productName;
    private Double price;
    private String category;
    private int quantity;

    public static class GiftBuilder {
        private String productName;
        private Double price;
        private String category;
        private int quantity;

        public GiftBuilder(final String productName, final Double price,
                           final String category, final int quantity) {
            this.productName = productName;
            this.price = price;
            this.category = category;
            this.quantity = quantity;
        }

        /**
         * @return
         */
        public Gift build() {
            return new Gift(this);
        }
    }
    private Gift(final GiftBuilder giftBuilder) {
        this.productName = giftBuilder.productName;
        this.price = giftBuilder.price;
        this.category = giftBuilder.category;
        this.quantity = giftBuilder.quantity;
    }

    public String getProductName() {
        return productName;
    }

    public Double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }
}
