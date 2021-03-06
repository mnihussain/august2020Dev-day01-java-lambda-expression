package payment;

public class PaymentSystems {
    PayByCreditCard payByCreditCard = new PayByCreditCard();
    public static void processPayment(){
        System.out.println("process customer payment");
        PayByCreditCardLambda.processPaymentByCreditCard();

    }

    public class PayByPayPal{

        public void processPaymentByPayPal(){
            System.out.println("process customer payment by PayPal");
        }

    }
    public class PayByCrypto{

        public void processPaymentByCrypto(){
            System.out.println("process customer payment by Crypto");
        }

    }
    public static class PayByCreditCard{

        public void processPaymentByCreditCard(){
            System.out.println("process customer payment by Credit Card");
            Pay pay = new Pay() {
                @Override
                public void paymentMethod() {
                    System.out.println("System will take credit card");
                }
            };
            pay.paymentMethod();
        }

        public interface Pay{
            public void paymentMethod();
        }

    }
    public static class PayByCreditCardLambda{

        public static void processPaymentByCreditCard(){
            System.out.println("process customer payment by Credit Card with lambda style");
            Pay pay = ()-> System.out.println("System will take credit card with lambda");
            pay.paymentMethod();
        }

        public interface Pay{
             void paymentMethod();
        }

    }
}
