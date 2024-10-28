/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kolling
 * @version 2008.03.30
 */
public class TicketMachine {
    // The price of a ticket from this machine.
    private Integer price;
    // The amount of money entered by a customer so far.
    private Integer balance;
    // The total amount of money collected by this machine.
    private Integer total;
    // The number of tickets printed.
    private Integer ticketNumber;
    //Amount of Refund
    private Integer refund;


    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(Integer ticketCost) {
        price = ticketCost;
        clearBalance();
        total = 0;
        ticketNumber = 0;
        refund = 0;
    }

    /**
     * Return the price of a ticket.
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * Return ticketNumber.
     * (Increments on each print.)
     */
    public Integer getTicketNumber() {
       incrementTicketNumber();
        return ticketNumber;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public Integer getBalance() {
        return balance;
    }

    /**
     * Receive an amount of money in cents from a customer.
     */
    public Integer insertMoney(Integer amount) {
        balance = balance + amount;
        return balance;
    }

    public Integer calculateTotal() {
        total = balance + total;
        return total;
    }

    public Integer incrementTicketNumber() {
        ticketNumber++;
       /* int i = 1;
        for (i = 0; i <= 10; i++) ;
        TicketMachine machine1 = new ticketNumber.intValue(i = i + 1);*/
        return ticketNumber;
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public String printTicket() {
        // Increment the number of tickets printed
        incrementTicketNumber();
        // Update the total collected with the balance.
        total = total + balance;
        // Clear the balance.
        clearBalance();


        return "Ticket price: " + price + " cents. " + "Your total is " + total + ".";
    }

    public void clearBalance() {
        balance = 0;
    }


    public Integer getRefund() {
                balance = getBalance();
                refund = balance - price;
                return refund;

        }

    public static void main(String[] args){

        TicketMachine machine1 = new TicketMachine(20) ;
        System.out.println("Ticket number:" + machine1.getTicketNumber());
        System.out.println("price of each Ticket: " + machine1.getPrice());
        System.out.println("amount of money Inserted: " + machine1.insertMoney(50));
        System.out.println("Refund:" + machine1.getRefund());
        System.out.println((machine1.printTicket()));
        System.out.println("Balance is: " + machine1.balance);


//       if (machine1.insertMoney(0)< machine1.price){
//       System.out.println("Out of Balance");}

//        TicketMachine machine2 = new TicketMachine(30) ;
//        System.out.println("price of each Ticket: " + machine2.getPrice());
//        System.out.println("amount of money Inserted: " + machine2.insertMoney(100)
//        System.out.println("Balance present: " + machine1.getBalance());
//
//        System.out.println(machine2.printTicket());
//        System.out.println(machine2.getTicketNumber());
//        //0 balance is returned after the machine prints a ticket
//        System.out.println("balance present: " + machine2.getBalance());
//        System.out.println("Refund:" + machine2.getRefund());
//    }
}
}


