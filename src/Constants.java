/**
 * Enum class Containing the Constants
 */

public final class Constants {

    enum DeliveryType {
        PARTIAL("Partial Delivery"),
        COMPLETE("Full Delivery"),
        RETURN("Return Delivery");

        private String deliverValue;

        DeliveryType(String value) {
            this.deliverValue = value;
        }

        public String getDeliverValue(){
            return deliverValue;
        }
    }
}

