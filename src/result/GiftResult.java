package result;

public final class GiftResult {
    private String productName;
    private Double price;
    private String category;

    public static class GiftResultBuilder {
        private String productName;
        private Double price;
        private String category;

        public GiftResultBuilder(final String productName, final Double price,
                           final String category) {
            this.productName = productName;
            this.price = price;
            this.category = category;
        }

        /**
         * @return
         */
        public GiftResult build() {
            return new GiftResult(this);
        }
    }
    private GiftResult(final GiftResultBuilder giftBuilder) {
        this.productName = giftBuilder.productName;
        this.price = giftBuilder.price;
        this.category = giftBuilder.category;
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
}
