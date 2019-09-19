public class MainClass {

    public static void main(String[] args) {
        //Get enum Value From constants
        Constants.DeliveryType deliveryType = Constants.DeliveryType.PARTIAL;

        //Using Switch statement
        switch (deliveryType){
            case PARTIAL:
                System.out.println(Constants.DeliveryType.PARTIAL);
                break;
            case COMPLETE:
                System.out.println(Constants.DeliveryType.COMPLETE);
                break;
            case RETURN:
                System.out.println(Constants.DeliveryType.RETURN);
                break;
        }

        //Loop through values in the enum
        for (Constants.DeliveryType value :Constants.DeliveryType.values()){
            System.out.println(value);
            System.out.println("You can Save this to database "+value.getDeliverValue());
        }

    }
}
